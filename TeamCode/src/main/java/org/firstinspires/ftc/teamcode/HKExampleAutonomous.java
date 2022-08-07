package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name="HKExampleAutonomous", group="HK")
public class HKExampleAutonomous extends LinearOpMode {
    DcMotor leftWheel;
    DcMotor rightWheel;
    Servo dumpArm;

    @Override
    public void runOpMode() throws InterruptedException {
        leftWheel = hardwareMap.dcMotor.get("leftMotor");
        rightWheel = hardwareMap.dcMotor.get("rightMotor");
        leftWheel.setDirection(DcMotor.Direction.REVERSE);
        dumpArm = hardwareMap.servo.get("arm");

        dumpArm.setPosition(0);

        waitForStart();

        leftWheel.setPower(.5);
        rightWheel.setPower(.5);

        sleep(2000);

        leftWheel.setPower(0);
        rightWheel.setPower(0);

        leftWheel.setPower(.5);
        rightWheel.setPower(-.5);

        sleep(500);

        leftWheel.setPower(0);
        rightWheel.setPower(0);

        leftWheel.setPower(1);
        rightWheel.setPower(1);

        sleep(700);

        leftWheel.setPower(0);
        rightWheel.setPower(0);

        dumpArm.setPosition(.5);

        sleep(1000);

        dumpArm.setPosition(0);



    }
}
