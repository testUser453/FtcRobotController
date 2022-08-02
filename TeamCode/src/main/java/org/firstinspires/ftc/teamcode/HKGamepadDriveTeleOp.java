package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="HK Drive", group="Training")
public class HKGamepadDriveTeleOp extends OpMode {

    DcMotor leftWheel;
    DcMotor rightWheel;
    DcMotor armControl;


    double leftWheelPower;
    double rightWheelPower;
    double armControlDetect;



    @Override
    public void init() {
        leftWheel = hardwareMap.dcMotor.get("leftMotor");
        rightWheel = hardwareMap.dcMotor.get("rightMotor");
        armControl = hardwareMap.dcMotor.get("arm");


        leftWheel.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop() {
        leftWheelPower = -gamepad1.left_stick_y;
        rightWheelPower = -gamepad1.right_stick_y;


        leftWheel.setPower(leftWheelPower);
        rightWheel.setPower(rightWheelPower);

        if (gamepad1.a) {
            armControl.setPower(armControlDetect);

        } else if (gamepad1.x) {
            armControl.setPower(-armControlDetect);




        }



    }



}
