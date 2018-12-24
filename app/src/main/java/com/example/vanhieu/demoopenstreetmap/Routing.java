package com.example.vanhieu.demoopenstreetmap;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Routing {
    /**
     * hints : {"visited_nodes.average":"214.0","visited_nodes.sum":"214"}
     * info : {"copyrights":["GraphHopper","OpenStreetMap contributors"],"took":6}
     * paths : [{"distance":40993.762,"weight":2352.368766,"time":2352343,"transfers":0,"points_encoded":true,"bbox":[105.84996,20.908935,106.155525,21.040155],"points":"{yr~BanzfS`AgBsXoSoBsCuAkAoBgAcEhA{@ZqBJcAUaByBc@wAk@{@iD}BgCwAeDiBwTrBeBDcB}@q@y@}@oEiA}HnHrBt@`FbH`a@|Itj@h@nFbDnYpHps@jGti@nFhf@f@`HR|D?x@IbH]nFSpAgAbGU|@mBvGuBtH_CbJoBbHkAdDwG|OiEzIqCnGaDrGmDlGiC~DkBhD}BvG}@bEq@dFa@nDcBdNeDfSaAfFqBfLwClSy@zGw@xEoFnU{D|PkApFsAzFwFfX{@dGoD~ZgAzGqB~EiCxFsDfJsGjRq@xDU`D[~Hu@dIgClNeBnNm@|CsDvLkFfOiCnIuJ~XwQvj@sO|d@gCpE}EbGaClDwHfMqItMmFzIsB|CiC|BoErCyPxGaMpEeP~GgMrFcn@xVkF~CeCvBkJjNyB|CwIdNwC~DqDbEgFbFsH|FqG~Dyk@lYk@`@w@r@cClDuP`XuAbBkBrBgFpEwDrEkAhB}@bB}GfOmA~BkS`[}BpDqU|]sZ~d@uD`GmHjNe@fAqRjl@uAzDsFrQkBjGcBnGw@dCsChL_M|n@Vh@pAxA`ChCn@j@~@r@tDdB~BnB^d@r@z@hAdBjBvDn@|AjB~DhDzEfAxAnBjBsBhF_JfVcCrGgBfFIt@iBxE]~Aq@`ES`@eG`^Q`BGpBIhNGfAS~AKd@mAnDe@~AWhAOfAEbATvD@~@OjAg@xA]j@i@r@mBtBk@b@BZ[nAaAhDuA|BoDpGuEzIyKfSiBtDw@vAwFfKeBdD]v@u@vBc@l@LDHHDPAVIR]Rw@XUDa@AKEIO@ODMLOd@W`GvSjKf_@xErNGPKb@@VFNPJH@NCn@SFE\\e@\\[ZSpCkAHpBD`EGrAO`GOnBOhAEr@Bl@TjCnDeAvCyAjB[jA]h@TX@d@EtBe@jEo@^A","instructions":[{"distance":65.33,"heading":124.03,"sign":0,"interval":[0,1],"text":"Continue","time":7839,"street_name":""},{"distance":802.479,"sign":-2,"interval":[1,5],"text":"Turn left","time":96295,"street_name":""},{"distance":1576.28,"sign":-2,"interval":[5,21],"text":"Turn left onto Quốc Lộ 38, QL.38","time":81062,"street_name":"Quốc Lộ 38, QL.38"},{"distance":179.689,"sign":3,"interval":[21,22],"text":"Turn sharp right onto Quốc Lộ 38, QL.38","time":12937,"street_name":"Quốc Lộ 38, QL.38"},{"distance":27870.66,"sign":2,"interval":[22,131],"text":"Turn right onto Quốc lộ 5A, QL.5A","time":1433318,"street_name":"Quốc lộ 5A, QL.5A"},{"distance":1896.2,"sign":-7,"interval":[131,138],"text":"Keep left onto Nguyễn Văn Linh, QL.5A","time":97513,"street_name":"Nguyễn Văn Linh, QL.5A"},{"distance":1192.499,"sign":-2,"interval":[138,154],"text":"Turn left","time":71543,"street_name":""},{"distance":864.933,"sign":2,"interval":[154,158],"text":"Turn right onto Cổ Linh","time":51893,"street_name":"Cổ Linh"},{"distance":2017.629,"sign":-7,"interval":[158,183],"text":"Keep left","time":121656,"street_name":""},{"distance":14.793,"sign":-2,"interval":[183,184],"text":"Turn left","time":887,"street_name":""},{"distance":140.316,"sign":1,"interval":[184,186],"text":"Turn slight right","time":8418,"street_name":""},{"distance":1525.178,"sign":1,"interval":[186,197],"text":"Turn slight right onto Đê Xuân Quan - Long Biên, ĐT.195","time":84456,"street_name":"Đê Xuân Quan - Long Biên, ĐT.195"},{"distance":135.827,"sign":-3,"interval":[197,206],"text":"Turn sharp left","time":7521,"street_name":""},{"distance":16.901,"sign":7,"interval":[206,208],"text":"Keep right","time":936,"street_name":""},{"distance":52.924,"sign":1,"interval":[208,212],"text":"Turn slight right","time":2931,"street_name":""},{"distance":1238.67,"sign":2,"interval":[212,215],"text":"Turn right onto Nguyễn Văn Cừ","time":175863,"street_name":"Nguyễn Văn Cừ"},{"distance":10.165,"sign":2,"interval":[215,216],"text":"Turn right onto Vòng xoay Cầu Chương Dương","time":562,"street_name":"Vòng xoay Cầu Chương Dương"},{"distance":102.524,"sign":0,"interval":[216,224],"text":"Continue onto Vòng xoay Cầu Chương Dương","time":5677,"street_name":"Vòng xoay Cầu Chương Dương"},{"distance":157.605,"sign":7,"interval":[224,228],"text":"Keep right onto Trần Quang Khải","time":9456,"street_name":"Trần Quang Khải"},{"distance":561.957,"sign":3,"interval":[228,237],"text":"Turn sharp right onto Hàng Mắm","time":40457,"street_name":"Hàng Mắm"},{"distance":308.018,"sign":-2,"interval":[237,241],"text":"Turn left onto Lương Văn Can","time":22175,"street_name":"Lương Văn Can"},{"distance":263.185,"sign":2,"interval":[241,247],"text":"Turn right onto Lê Thái Tổ","time":18948,"street_name":"Lê Thái Tổ"},{"distance":0,"sign":4,"last_heading":174.8094232944142,"interval":[247,247],"text":"Arrive at destination","time":0,"street_name":""}],"legs":[],"details":{},"ascend":0,"descend":0,"snapped_waypoints":"{yr~BanzfSalVxjx@"}]
     */

    private HintsBean hints;
    private InfoBean info;
    private List<PathsBean> paths;

    public HintsBean getHints() {
        return hints;
    }

    public void setHints(HintsBean hints) {
        this.hints = hints;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public List<PathsBean> getPaths() {
        return paths;
    }

    public void setPaths(List<PathsBean> paths) {
        this.paths = paths;
    }

    public static class HintsBean {
        @SerializedName("visited_nodes.average")
        private String _$Visited_nodesAverage260; // FIXME check this code
        @SerializedName("visited_nodes.sum")
        private String _$Visited_nodesSum187; // FIXME check this code

        public String get_$Visited_nodesAverage260() {
            return _$Visited_nodesAverage260;
        }

        public void set_$Visited_nodesAverage260(String _$Visited_nodesAverage260) {
            this._$Visited_nodesAverage260 = _$Visited_nodesAverage260;
        }

        public String get_$Visited_nodesSum187() {
            return _$Visited_nodesSum187;
        }

        public void set_$Visited_nodesSum187(String _$Visited_nodesSum187) {
            this._$Visited_nodesSum187 = _$Visited_nodesSum187;
        }
    }

    public static class InfoBean {
        /**
         * copyrights : ["GraphHopper","OpenStreetMap contributors"]
         * took : 6
         */

        private int took;
        private List<String> copyrights;

        public int getTook() {
            return took;
        }

        public void setTook(int took) {
            this.took = took;
        }

        public List<String> getCopyrights() {
            return copyrights;
        }

        public void setCopyrights(List<String> copyrights) {
            this.copyrights = copyrights;
        }
    }

    public static class PathsBean {
        /**
         * distance : 40993.762
         * weight : 2352.368766
         * time : 2352343
         * transfers : 0
         * points_encoded : true
         * bbox : [105.84996,20.908935,106.155525,21.040155]
         * points : {yr~BanzfS`AgBsXoSoBsCuAkAoBgAcEhA{@ZqBJcAUaByBc@wAk@{@iD}BgCwAeDiBwTrBeBDcB}@q@y@}@oEiA}HnHrBt@`FbH`a@|Itj@h@nFbDnYpHps@jGti@nFhf@f@`HR|D?x@IbH]nFSpAgAbGU|@mBvGuBtH_CbJoBbHkAdDwG|OiEzIqCnGaDrGmDlGiC~DkBhD}BvG}@bEq@dFa@nDcBdNeDfSaAfFqBfLwClSy@zGw@xEoFnU{D|PkApFsAzFwFfX{@dGoD~ZgAzGqB~EiCxFsDfJsGjRq@xDU`D[~Hu@dIgClNeBnNm@|CsDvLkFfOiCnIuJ~XwQvj@sO|d@gCpE}EbGaClDwHfMqItMmFzIsB|CiC|BoErCyPxGaMpEeP~GgMrFcn@xVkF~CeCvBkJjNyB|CwIdNwC~DqDbEgFbFsH|FqG~Dyk@lYk@`@w@r@cClDuP`XuAbBkBrBgFpEwDrEkAhB}@bB}GfOmA~BkS`[}BpDqU|]sZ~d@uD`GmHjNe@fAqRjl@uAzDsFrQkBjGcBnGw@dCsChL_M|n@Vh@pAxA`ChCn@j@~@r@tDdB~BnB^d@r@z@hAdBjBvDn@|AjB~DhDzEfAxAnBjBsBhF_JfVcCrGgBfFIt@iBxE]~Aq@`ES`@eG`^Q`BGpBIhNGfAS~AKd@mAnDe@~AWhAOfAEbATvD@~@OjAg@xA]j@i@r@mBtBk@b@BZ[nAaAhDuA|BoDpGuEzIyKfSiBtDw@vAwFfKeBdD]v@u@vBc@l@LDHHDPAVIR]Rw@XUDa@AKEIO@ODMLOd@W`GvSjKf_@xErNGPKb@@VFNPJH@NCn@SFE\e@\[ZSpCkAHpBD`EGrAO`GOnBOhAEr@Bl@TjCnDeAvCyAjB[jA]h@TX@d@EtBe@jEo@^A
         * instructions : [{"distance":65.33,"heading":124.03,"sign":0,"interval":[0,1],"text":"Continue","time":7839,"street_name":""},{"distance":802.479,"sign":-2,"interval":[1,5],"text":"Turn left","time":96295,"street_name":""},{"distance":1576.28,"sign":-2,"interval":[5,21],"text":"Turn left onto Quốc Lộ 38, QL.38","time":81062,"street_name":"Quốc Lộ 38, QL.38"},{"distance":179.689,"sign":3,"interval":[21,22],"text":"Turn sharp right onto Quốc Lộ 38, QL.38","time":12937,"street_name":"Quốc Lộ 38, QL.38"},{"distance":27870.66,"sign":2,"interval":[22,131],"text":"Turn right onto Quốc lộ 5A, QL.5A","time":1433318,"street_name":"Quốc lộ 5A, QL.5A"},{"distance":1896.2,"sign":-7,"interval":[131,138],"text":"Keep left onto Nguyễn Văn Linh, QL.5A","time":97513,"street_name":"Nguyễn Văn Linh, QL.5A"},{"distance":1192.499,"sign":-2,"interval":[138,154],"text":"Turn left","time":71543,"street_name":""},{"distance":864.933,"sign":2,"interval":[154,158],"text":"Turn right onto Cổ Linh","time":51893,"street_name":"Cổ Linh"},{"distance":2017.629,"sign":-7,"interval":[158,183],"text":"Keep left","time":121656,"street_name":""},{"distance":14.793,"sign":-2,"interval":[183,184],"text":"Turn left","time":887,"street_name":""},{"distance":140.316,"sign":1,"interval":[184,186],"text":"Turn slight right","time":8418,"street_name":""},{"distance":1525.178,"sign":1,"interval":[186,197],"text":"Turn slight right onto Đê Xuân Quan - Long Biên, ĐT.195","time":84456,"street_name":"Đê Xuân Quan - Long Biên, ĐT.195"},{"distance":135.827,"sign":-3,"interval":[197,206],"text":"Turn sharp left","time":7521,"street_name":""},{"distance":16.901,"sign":7,"interval":[206,208],"text":"Keep right","time":936,"street_name":""},{"distance":52.924,"sign":1,"interval":[208,212],"text":"Turn slight right","time":2931,"street_name":""},{"distance":1238.67,"sign":2,"interval":[212,215],"text":"Turn right onto Nguyễn Văn Cừ","time":175863,"street_name":"Nguyễn Văn Cừ"},{"distance":10.165,"sign":2,"interval":[215,216],"text":"Turn right onto Vòng xoay Cầu Chương Dương","time":562,"street_name":"Vòng xoay Cầu Chương Dương"},{"distance":102.524,"sign":0,"interval":[216,224],"text":"Continue onto Vòng xoay Cầu Chương Dương","time":5677,"street_name":"Vòng xoay Cầu Chương Dương"},{"distance":157.605,"sign":7,"interval":[224,228],"text":"Keep right onto Trần Quang Khải","time":9456,"street_name":"Trần Quang Khải"},{"distance":561.957,"sign":3,"interval":[228,237],"text":"Turn sharp right onto Hàng Mắm","time":40457,"street_name":"Hàng Mắm"},{"distance":308.018,"sign":-2,"interval":[237,241],"text":"Turn left onto Lương Văn Can","time":22175,"street_name":"Lương Văn Can"},{"distance":263.185,"sign":2,"interval":[241,247],"text":"Turn right onto Lê Thái Tổ","time":18948,"street_name":"Lê Thái Tổ"},{"distance":0,"sign":4,"last_heading":174.8094232944142,"interval":[247,247],"text":"Arrive at destination","time":0,"street_name":""}]
         * legs : []
         * details : {}
         * ascend : 0.0
         * descend : 0.0
         * snapped_waypoints : {yr~BanzfSalVxjx@
         */

        private double distance;
        private double weight;
        private int time;
        private int transfers;
        private boolean points_encoded;
        private String points;
        private DetailsBean details;
        private double ascend;
        private double descend;
        private String snapped_waypoints;
        private List<Double> bbox;
        private List<InstructionsBean> instructions;
        private List<?> legs;

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public int getTransfers() {
            return transfers;
        }

        public void setTransfers(int transfers) {
            this.transfers = transfers;
        }

        public boolean isPoints_encoded() {
            return points_encoded;
        }

        public void setPoints_encoded(boolean points_encoded) {
            this.points_encoded = points_encoded;
        }

        public String getPoints() {
            return points;
        }

        public void setPoints(String points) {
            this.points = points;
        }

        public DetailsBean getDetails() {
            return details;
        }

        public void setDetails(DetailsBean details) {
            this.details = details;
        }

        public double getAscend() {
            return ascend;
        }

        public void setAscend(double ascend) {
            this.ascend = ascend;
        }

        public double getDescend() {
            return descend;
        }

        public void setDescend(double descend) {
            this.descend = descend;
        }

        public String getSnapped_waypoints() {
            return snapped_waypoints;
        }

        public void setSnapped_waypoints(String snapped_waypoints) {
            this.snapped_waypoints = snapped_waypoints;
        }

        public List<Double> getBbox() {
            return bbox;
        }

        public void setBbox(List<Double> bbox) {
            this.bbox = bbox;
        }

        public List<InstructionsBean> getInstructions() {
            return instructions;
        }

        public void setInstructions(List<InstructionsBean> instructions) {
            this.instructions = instructions;
        }

        public List<?> getLegs() {
            return legs;
        }

        public void setLegs(List<?> legs) {
            this.legs = legs;
        }

        public static class DetailsBean {
        }

        public static class InstructionsBean {
            /**
             * distance : 65.33
             * heading : 124.03
             * sign : 0
             * interval : [0,1]
             * text : Continue
             * time : 7839
             * street_name :
             * last_heading : 174.8094232944142
             */

            private double distance;
            private double heading;
            private int sign;
            private String text;
            private int time;
            private String street_name;
            private double last_heading;
            private List<Integer> interval;

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public double getHeading() {
                return heading;
            }

            public void setHeading(double heading) {
                this.heading = heading;
            }

            public int getSign() {
                return sign;
            }

            public void setSign(int sign) {
                this.sign = sign;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }

            public String getStreet_name() {
                return street_name;
            }

            public void setStreet_name(String street_name) {
                this.street_name = street_name;
            }

            public double getLast_heading() {
                return last_heading;
            }

            public void setLast_heading(double last_heading) {
                this.last_heading = last_heading;
            }

            public List<Integer> getInterval() {
                return interval;
            }

            public void setInterval(List<Integer> interval) {
                this.interval = interval;
            }
        }
    }
}
