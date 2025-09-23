package lab_06_OOPConcept;


class InstanceVariableDefaultValue {
    private boolean aBoolean;
    private int anInt;
    private float aFloat;
    private String aString;

    public boolean isaBoolean() {
        return aBoolean;
    }

    public int getAnInt() {
        return anInt;
    }

    public float getaFloat() {
        return aFloat;
    }

    public String getaString() {
        return aString;
    }
}


class IntanceVariableDefaultValueTestDriver{
    public static void main(String[] args) {
        InstanceVariableDefaultValue instanceVariableDefaultValue = new InstanceVariableDefaultValue();
        System.out.println(instanceVariableDefaultValue.getaFloat()); //0.0
        System.out.println(instanceVariableDefaultValue.getAnInt()); //0
        System.out.println(instanceVariableDefaultValue.isaBoolean()); //false
        System.out.println(instanceVariableDefaultValue.getaString());//null
    }
}
