package sk.varga.martin.gl1;

public enum Gender {
    MALE("male"),
    FEMALE("felame"),
    OTHER("other");

    private final String value;

    Gender(String value){
        this.value = value;
    }

    public static Gender fromString(String s){
        for(Gender g : Gender.values()){
            if(g.value.equalsIgnoreCase(s)){
                return g;
            }
        }
        return null;
    }
}
