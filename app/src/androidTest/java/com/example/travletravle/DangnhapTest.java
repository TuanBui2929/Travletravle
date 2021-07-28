package com.example.travletravle;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.Date;
import java.util.Random;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class DangnhapTest {
    @Rule
    public ActivityTestRule<Dangnhap> activityTestRule = new ActivityTestRule<>(Dangnhap.class);
    private Context context;
    private Solo solo;
    @Before
    public void setUp() throws Exception {
        //setUp() được chạy trước khi 1 testcase được bắt đầu.'8/
        //Khởi Tạo đối tượng solo dùng kiểm.
        solo = new Solo(InstrumentationRegistry.getInstrumentation(), activityTestRule.getActivity());
        context = InstrumentationRegistry.getInstrumentation().getTargetContext().getApplicationContext();
    }
    @After
    public void tearDown() throws Exception {
        //tearDown() được chạy khi các testcase kết thức.
        //finishOpenedActivities() sẽ kết thúc tất cả các hoạt động đã chạy trong quá trình thực thi thử nghiệm.
        solo.finishOpenedActivities();
    }


    @Test
    public void testloginsuccessful() throws Exception {

            solo.clearEditText(0);
            solo.clearEditText(1);
            solo.enterText(0,"admin@gmail.com");
            solo.enterText(1, "123456");
            solo.clickOnView(solo.getView(R.id.edtemaildangnhap));
            solo.clickOnView(solo.getView(R.id.edtpassworddangnhap));
            this.solo.clickOnButton(0);
            solo.assertCurrentActivity("Current activity should be LoginActivity", MainActivity.class);

    }
    @Test
    public void testloginfail() throws Exception {

        solo.clearEditText(0);
        solo.clearEditText(1);
        solo.enterText(0,"");
        solo.enterText(1, "");
        solo.clickOnView(solo.getView(R.id.edtemaildangnhap));
        solo.clickOnView(solo.getView(R.id.edtpassworddangnhap));
        this.solo.clickOnButton(0);
        solo.assertCurrentActivity("Current activity should be LoginActivity", MainActivity.class);

    }
    @Test
    public void testloginpasswordfail() throws Exception {

        solo.clearEditText(0);
        solo.clearEditText(1);
        solo.enterText(0,"admin");
        solo.enterText(1, "");
        solo.clickOnView(solo.getView(R.id.edtemaildangnhap));
        solo.clickOnView(solo.getView(R.id.edtpassworddangnhap));
        this.solo.clickOnButton(0);
        solo.assertCurrentActivity("Current activity should be LoginActivity", MainActivity.class);

    }
    @Test
    public void testloginemailfail() throws Exception {

        solo.clearEditText(0);
        solo.clearEditText(1);
        solo.enterText(0,"");
        solo.enterText(1, "123456");
        solo.clickOnView(solo.getView(R.id.edtemaildangnhap));
        solo.clickOnView(solo.getView(R.id.edtpassworddangnhap));
        this.solo.clickOnButton(0);
        solo.assertCurrentActivity("Current activity should be LoginActivity", MainActivity.class);

    }
    @Test
    public void testloginwrong() throws Exception {

        solo.clearEditText(0);
        solo.clearEditText(1);
        solo.enterText(0,"adm@gmail.com");
        solo.enterText(1, "123456");
        solo.clickOnView(solo.getView(R.id.edtemaildangnhap));
        solo.clickOnView(solo.getView(R.id.edtpassworddangnhap));
        this.solo.clickOnButton(0);
        solo.assertCurrentActivity("Current activity should be LoginActivity", MainActivity.class);

    }

}
