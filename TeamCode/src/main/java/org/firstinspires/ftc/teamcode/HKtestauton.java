package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name="HKtestingAuton", group="HK")
public class HKtestauton extends LinearOpMode {


    Servo clawServo;

    @Override
    public void runOpMode() throws InterruptedException {
        clawServo = hardwareMap.servo.get("pinch");

        waitForStart();

        clawServo.setPosition(.75);
    }
}
