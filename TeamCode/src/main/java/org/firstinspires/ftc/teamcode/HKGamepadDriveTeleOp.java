package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Gamepad Drive", group="Training")
public class HKGamepadDriveTeleOp extends OpMode {

    DcMotor leftWheel;
    DcMotor rightWheel;

    double leftWheelPower;
    double rightWheelPower;
    double servoControl;
    double armControl;
    double clawControl;


    @Override
    public void init() {
        leftWheel = hardwareMap.dcMotor.get("leftMotor");
        rightWheel = hardwareMap.dcMotor.get("rightMotor");

        leftWheel.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop() {
        leftWheelPower = gamepad1.left_stick_y;
        rightWheelPower = gamepad1.right_stick_y;


        leftWheel.setPower(leftWheelPower);
        rightWheel.setPower(rightWheelPower);


    }



}
