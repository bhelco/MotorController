package motor;

public class Controller 
{
    public static void main(String[] args)
    {
        Motor motor1 = new Motor();
        motor1.setDirectionOfMotor("forward");
        motor1.setSpeedOfMotor(10);
        System.out.println(motor1.getActualSpeedOfMotor());
        System.out.println(motor1.getDirectionOfMotor());
    }

}
