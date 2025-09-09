package lab_14_fileInput;

public class PersonController {

    public static Person processRawDataLine(String dataLine) {
        String[] data;
        try {
            data = dataLine.split("[;]");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            long salary = Long.parseLong(data[2]);
            return new Person(name, age, salary);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String proceedPersonDataToString(Person person){
        if(person == null){
            throw new IllegalArgumentException("[INFO] person data should not null.");
        }else{
            String name = person.getName();
            int age = person.getAge();
            long salary = person.getSalary();
            String output = name.concat(";").concat(String.valueOf(age)).concat(";").concat(String.valueOf(salary));
            return output;
        }
    }
}
