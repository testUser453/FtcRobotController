package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="HK Arcade Drive", group="Training")
public class HKGamepadArcadeDriveTeleOp extends OpMode {

    DcMotor leftWheel;
    DcMotor rightWheel;
    DcMotor armControl;

    Servo leftClaw;
    Servo rightClaw;




    double frontAndBackPower;
    double leftAndRightPower;
    double armPower;

    @Override
    public void init() {
        leftWheel = hardwareMap.dcMotor.get("leftMotor");
        rightWheel = hardwareMap.dcMotor.get("rightMotor");
        armControl = hardwareMap.dcMotor.get("arm");

        leftClaw = hardwareMap.servo.get("pinch");


        leftWheel.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop() {

        frontAndBackPower = -gamepad1.left_stick_y;

        leftWheel.setPower(frontAndBackPower);
        rightWheel.setPower(frontAndBackPower);


        leftAndRightPower = -gamepad1.right_stick_x;

        leftWheel.setPower(-leftAndRightPower);
        rightWheel.setPower(leftAndRightPower);

        //if(gamepad1.x) {
        //leftClaw.setPosition(1);
        //} else {
          //  leftClaw.setPosition(0);
        //}



        armPower = gamepad1.right_stick_y;
        if (armPower > 0 || armPower < 0) {
            armControl.setPower(armPower);

        } else if(armPower == 0) {
            armControl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }



        armControl.setPower(armPower);


        // leftWheelPower = -gamepad1.left_stick_y;
        // rightWheelPower = -gamepad1.right_stick_y;


        // leftWheel.setPower(leftWheelPower);
        // rightWheel.setPower(rightWheelPower);





    }



}
