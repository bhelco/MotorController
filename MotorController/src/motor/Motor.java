package motor;

public class Motor 
{
    int speed = 0;
    String directionOfMotor = "";

    public void setDirectionOfMotor(String directionOfMotor)
    {
        this.directionOfMotor = directionOfMotor; 
    }
    
    public void setSpeedOfMotor(int speed)
    {
        this.speed = speed;
    }
    
    public int getActualSpeedOfMotor()
    {
        return speed ;
    }
    public String getDirectionOfMotor()
    {
        return directionOfMotor;
    }

}
