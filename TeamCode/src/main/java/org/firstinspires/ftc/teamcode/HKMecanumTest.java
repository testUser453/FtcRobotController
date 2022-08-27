package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp
public class HKMecanumTest extends OpMode {

    DcMotor leftWheel;
    DcMotor rightWheel;
    DcMotor leftWheel_b;
    DcMotor rightWheel_b;
    DcMotor armControl;

    double armPower;



    public void moveDriveTrain(){
        double vertical;
        double horizontal;
        double pivot;
        vertical = -gamepad1.left_stick_y;
        horizontal = gamepad1.left_stick_x;
        pivot = gamepad1.right_stick_x;

        rightWheel.setPower(pivot + (-vertical + horizontal));
        rightWheel_b.setPower(pivot + (-vertical - horizontal));
        leftWheel.setPower(pivot + (-vertical - horizontal));
        leftWheel_b.setPower(pivot + (-vertical + horizontal));






    }

    @Override
    public void init() {

        leftWheel.setDirection(DcMotor.Direction.REVERSE);
        leftWheel_b.setDirection(DcMotor.Direction.REVERSE);


        leftWheel = hardwareMap.get(DcMotor.class, "leftMotor");
        rightWheel = hardwareMap.get(DcMotor.class, "rightMotor");
        leftWheel_b = hardwareMap.get(DcMotor.class, "rearLeftMotor");
        rightWheel_b = hardwareMap.get(DcMotor.class, "rearRightMotor");


    }

    @Override
    public void init_loop() {





    }

    @Override
    public void loop() {
        armPower = gamepad1.right_trigger;
        if (armPower > 0 || armPower < 0) {
            armControl.setPower(armPower);
        } else if (armPower == 0) {

            armControl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }

        armControl.setPower(armPower);
    }
}
