package pl.p.lodz.zzpj.builder;

public class Value {
        private final String value; //required
        private final String value2; //required
        private final int value3; // optional
        private final String value4; //optional

        private Value(ValueBuilder builder){
            this.value = builder.value;
            this.value2 = builder.value2;
            this.value3 = builder.value3;
            this.value4 = builder.value4;

        }

        public String getValue() {
                return value;
        }

        public String getValue2() {
                return value2;
        }

        public int getValue3() {
                return value3;
        }

        public String getValue4() {
                return value4;
        }

        public static class ValueBuilder{
                private  String value;
                private  String value2;
                private int value3;
                private String value4;

                public ValueBuilder(String value, String value2){
                        this.value = value;
                        this.value2 = value2;
                }
                public ValueBuilder value3(int value3){
                        this.value3 = value3;
                        return this;
                }
                public ValueBuilder value4(String value4){
                        this.value4 = value4;
                        return this;
                }
                public Value build(){
                        Value value = new Value(this);
                        return value;
                }
        }


}