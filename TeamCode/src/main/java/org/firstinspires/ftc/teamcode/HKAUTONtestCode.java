package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name="HKAUTONtest", group="HK")
public class HKAUTONtestCode extends LinearOpMode {

    DcMotor leftWheel;
    DcMotor rightWheel;
    DcMotor armMotor;
    Servo clawServo;

    @Override
    public void runOpMode() throws InterruptedException {
        leftWheel = hardwareMap.dcMotor.get("leftMotor");
        rightWheel = hardwareMap.dcMotor.get("rightMotor");
        leftWheel.setDirection(DcMotor.Direction.REVERSE);
        armMotor = hardwareMap.dcMotor.get("arm");
        clawServo = hardwareMap.servo.get("pinch");

        armMotor.setPower(0);

        waitForStart();

        //go forward at .5 speed for 2 seconds

        leftWheel.setPower(.5);
        rightWheel.setPower(.5);

        sleep(2000);

        //turn right for half a second at .5 speed

        leftWheel.setPower(.5);
        rightWheel.setPower(-.5);

        sleep(500);

        //move forward for 1/5th of a second

        leftWheel.setPower(1);
        rightWheel.setPower(1);

        sleep(200);

        // armMotor goes up at a power of .3 for 1/5th of a second
        armMotor.setPower(.3);

        sleep(200);

        armMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftWheel.setPower(.5);
        rightWheel.setPower(.5);

        sleep(100);

        armMotor.setPower(0);










    }
}
