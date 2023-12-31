
public class EnumExample {
    public enum CarTypes {Sport,Sedan,Hatchback,SUV,Mini,Hybrid}
    CarTypes carTypes;
        public EnumExample(CarTypes carTypes) {
            this.carTypes = carTypes;
        }
    public void carFeatures() {
        switch (carTypes) {
            case Sport:
                System.out.println("Stylish car with power");
                break;
            case Hybrid:
                System.out.println("Economical as partially runs on battery power");
                break;
            case Hatchback:
            case SUV:
                System.out.println("Rear door swings upward to provide access to the cargo area");
            break;
                default:
            System.out.println("Just a car");
                break;
        }
    }
    public static void main(String[] args) {
        EnumExample carOne = new EnumExample(CarTypes.Sport);
        carOne.carFeatures();
        EnumExample carTwo = new EnumExample(CarTypes.Hatchback);
        carTwo.carFeatures();
        EnumExample carThree = new EnumExample(CarTypes.Mini);
        carThree.carFeatures();
    }
}