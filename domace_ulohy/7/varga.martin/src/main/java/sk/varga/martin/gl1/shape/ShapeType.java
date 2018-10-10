package sk.varga.martin.gl1.shape;

public enum ShapeType {
    CIRCLE("Circle"),
    RECTANGLE("Rectangle"),
    SQUARE("Square"),
    TRAPEZOID("Trapezoid");

    ShapeType(String value){
        this.value = value;
    }

    private final String value;

    public String getEnumValue() {
        return value;
    }

    public static ShapeType fromString(String s){
        for(ShapeType type : ShapeType.values()){
            if(type.value.equals(s)){
                return type;
            }
        }
        return null;
    }
}
