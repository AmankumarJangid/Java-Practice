public class Car {
    int noOfWheel;
    int noOfDoor;
    int maxSpeed;
    String name;
    String company;
    String modelNumber;
//every class already has toString() function already;
    // it shows Car@7b23ec81 in which 7b23ec81 is called hashcode
    // now to replace this function
    //every object has a unique hascode

    //now to override this toString()

//    @Override // to override the existing the default function
//    public String toString() {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("noOfWheel=").append(noOfWheel);
        sb.append(", noOfDoor=").append(noOfDoor);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }

    ////        return "My car name is " + name;
//        return "Car{" +
//                "noOfWheel=" + noOfWheel +
//                ", noOfDoor=" + noOfDoor +
//                ", maxSpeed=" + maxSpeed +
//                ", name='" + name + '\'' +
//                ", company='" + company + '\'' +
//                ", modelNo.='" + modelNumber + '\'' +
//                '}';

//        public String toString(){
//            String
//        }
//         ideally if just print the object rather giving object.toString() it still return the toString() function
        // and print the string in it
//    }


    public Car(int noOfWheel, int noOfDoor, int maxSpeed, String name , String company, String modelNumber) {
        this.noOfWheel = noOfWheel;
        this.noOfDoor = noOfDoor;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.company = company;
        this.modelNumber = modelNumber;
    }

    public static void main( String[] args){
        Car swift = new Car( 4, 4, 150, "Swift", "Maruti", "SW865" );
        System.out.println(swift.toString());
        System.out.println(swift); // it directly calls the toString() function if not specified.
        //if toString() is not directly created it will just print <ClassName>@<objectHashcode>
    }
}
