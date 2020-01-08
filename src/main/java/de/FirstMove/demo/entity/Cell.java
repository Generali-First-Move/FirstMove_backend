package de.FirstMove.demo.entity;


public class Cell {

    private Double lat; //Breitengrad N (Start ObenRechts)
    private Double lng; //Längengrad E  (Start ObenRechts)
    private Double lng_OR;
    private Double lat_OR;
    private Double lng_OL;
    private Double lat_OL;
    private Double lat_UR;
    private Double lng_UR;
    private Double lat_UL;
    private Double lng_UL;

    //Preferences
    private Integer dist_train_station, dist_bus_station, dist_uni, dist_shopping, dist_park, dist_sport, dist_swimming, dist_center, dist_nightlife, dist_safety;
    //Value
    private Double tilesize;

    public Cell(){};
    public Cell(Double lng, Double lat){ this.lat = lat; this.lng = lng;}
    public Cell(Double lng, Double lat, Double tilesize, String name, String surname, String city, Integer dist_train_station, Integer dist_bus_station, Integer dist_uni, Integer dist_shopping, Integer dist_park, Integer dist_sport, Integer dist_swimming, Integer dist_center, Integer dist_nightlife, Integer dist_safety){
        this.lat = lat;
        this.lng = lng;
        this.tilesize = tilesize;

        this.dist_train_station = dist_train_station;
        this.dist_bus_station = dist_bus_station;
        this.dist_uni = dist_uni;
        this.dist_shopping = dist_shopping;
        this.dist_park = dist_park;
        this.dist_sport = dist_sport;
        this.dist_swimming = dist_swimming;
        this.dist_center = dist_center;
        this.dist_nightlife = dist_nightlife;
        this.dist_safety = dist_safety;
    };

    //Getter
    public Double getLat() { return lat; }
    public Double getLat_OR() { return lat_OR; }
    public Double getLng() { return lng; }
    public Double getLng_OR() { return lng_OR; }
    public Double getTilesize() { return tilesize; }
    public Double getLng_OL() { return lng_OL; }
    public Double getLat_OL() { return lat_OL; }
    public Double getLat_UR() { return lat_UR; }
    public Double getLng_UR() { return lng_UR; }
    public Double getLat_UL() { return lat_UL; }
    public Double getLng_UL() { return lng_UL; }
    public Integer getDist_train_station() { return dist_train_station; }
    public Integer getDist_bus_station() { return dist_bus_station; }
    public Integer getDist_uni() { return dist_uni; }
    public Integer getDist_shopping() { return dist_shopping; }
    public Integer getDist_park() { return dist_park; }
    public Integer getDist_safety() { return dist_safety; }
    public Integer getDist_nightlife() { return dist_nightlife; }
    public Integer getDist_center() { return dist_center; }
    public Integer getDist_swimming() { return dist_swimming; }
    public Integer getDist_sport() { return dist_sport; }


    //Setter
    public void setLat(Double lat) { this.lat = lat; }
    public void setLng(Double lng) { this.lng = lng; }
    public void setTilesize(Double tilesize) { this.tilesize = tilesize; }

    //Setter Kästchenecken (eine Ecke des Vierecks = Längen und Breitengrad
    public void set_OR(Double lng_OR, Double lat_OR) { this.lng_OR = lng_OR; this.lat_OR = lat_OR; }
    public void set_OL(Double lng_OL, Double lat_OL ) { this.lng_OL = lng_OL; this.lat_OL = lat_OL; }
    public void set_UR(Double lng_UR, Double lat_UR) { this.lng_UR = lng_UR; this.lat_UR = lat_UR; }
    public void set_UL(Double lng_UL, Double lat_UL) { this.lng_UL = lng_UL;this.lat_UL = lat_UL; }

    //Setter für Präferenzen im jew. Kästchen
    public void setLng_OR(Double lng_OR) { this.lng_OR = lng_OR; }
    public void setLng_UR(Double lng_UR) { this.lng_UR = lng_UR; }
    public void setLng_UL(Double lng_UL) { this.lng_UL = lng_UL; }
    public void setDist_train_station(Integer dist_train_station) { this.dist_train_station = dist_train_station; }
    public void setDist_bus_station(Integer dist_bus_station) { this.dist_bus_station = dist_bus_station; }
    public void setDist_uni(Integer dist_uni) { this.dist_uni = dist_uni; }
    public void setDist_shopping(Integer dist_shopping) { this.dist_shopping = dist_shopping; }
    public void setDist_park(Integer dist_park) { this.dist_park = dist_park; }
    public void setDist_sport(Integer dist_sport) { this.dist_sport = dist_sport; }
    public void setDist_swimming(Integer dist_swimming) { this.dist_swimming = dist_swimming; }
    public void setDist_center(Integer dist_center) { this.dist_center = dist_center; }
    public void setDist_nightlife(Integer dist_nightlife) { this.dist_nightlife = dist_nightlife; }
    public void setDist_safety(Integer dist_safety) { this.dist_safety = dist_safety; }



    //Erstellung des Rasters
    public Cell[][] createGrid(double lng, double lat){

        Cell[][] raster = new Cell[20][24];

        Integer count_lng = 0;
        Integer count_lat = 0;
        Double lng_max = lng - 0.034598; // Minus da der Längengrad nach unten kleiner wird
        Double lat_max = lat + 0.082569;

        for(Integer i = 0; i < 20; i++){
            for(Integer j = 0 ; j < 24; j++){
                raster[i][j] = new Cell();
            }

        }

        double Z_lng = lng;
        double z_lat = lat;

        for(double laenge = lng; laenge > lng - 0.034598; laenge = laenge - 0.0017299){
                //lat
                for(double breite = lat; breite < lat +  0.082569; breite = breite +  0.003440375){

                    raster[count_lng][count_lat].set_OL(laenge, breite);
                    raster[count_lng][count_lat].set_OR(laenge, breite + 0.003440375);
                    raster[count_lng][count_lat].set_UL(laenge - 0.0017299, breite);
                    raster[count_lng][count_lat].set_UR(laenge - 0.0017299, breite + 0.003440375);

                    count_lat++;
                }
                count_lng++;
                count_lat = 0;
        }
        return raster;
    }
}
