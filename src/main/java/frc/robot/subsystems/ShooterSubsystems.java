
                                                // Made by Malek Ettaher
package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.Encoder;
import com.revrobotics.PWMSparkMax;


// Since motor controller groups have been deprecated which means there is no grouping of the motors. It is just easier to code it seperately than finding a new solution.

// Creating motors
CANSparkMax Liftmotor;
CANSparkMax Shootingmotor1;
CANSparkMax Shootingmotor2;
// Intake using PWM motor controllers
Spark IntakeMotor = new Spark(1); // 1 is the RIO PWM port this is connected to
// Creating Encoders
Encoder LiftEncoder;
Encoder ShootingEncoder1;
Encoder ShootingEncoder2;
Encoder IntakeEncoder;
// Creating Subsystem
public ShooterSubsystem(CANSparkMax Liftmotor, CANSparkMax Shootingmotor1, CANSparkMax Shootingmotor2, CANSparkMax IntakeMotor ) {
System.out.println("Creating new Subsystem-");

this.Liftmotor = new MotorController(5);
this.Shootingmotor1 = new MotorController(6);
this.Shootingmotor2 = new MotorController(7);

System.out.println("Subsystem Created.");

}
// Creating Encoder Subsytem I CANT TYYYYYYYYYYYYYYYYYYYYYPE
public ShooterSubsystem(Encoder LiftEncoder, Encoder ShootingEncoder1, Encoder ShootingEncoder2, Encoder IntakeEncoder ) {
System.out.println("Creating Encoder Subsystem-");

this.LiftEncoder = LiftEncoder;
this.ShootingEncoder1 = ShootingEncoder1;
this.ShootingEncoder2 = ShootingEncoder1;
this.IntakeEncoder = IntakeEncoder;
System.out.println("Encoder Subsystem created.");
}

public int getEncoder(int encoder) {
if (encoders [encoder] !=null){
return encoders [encoder].get();
}
else{
System.out.println(encoders[encoder]);
System.out.println("Check the connection of the encoder, if it is not unplugged, it may be broken\n")
return -1;

}
}

public void resetShooterEncoders() {
    if (encoders != null) {
      for(int i = 0; i < encoders.length;  ++i) {
        encoders[i].reset();
      }
    } else {
      System.out.print("no encoders or no encoders defined\n");
    }
}

// Getting Lift speed
public double getLiftSpeed() {
return Liftmotor.speed();
}

// Getting Shooting motor 1's speed
public double getShooter1Speed(){
return Shootingmotor1.speed();

}

// Getting Shooting motor 2's Speed
public double getShooter2Speed(){
return Shootingmotor2.speed();
}

