package com.example.travletravle;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TourTest {
    @Rule
    public ActivityTestRule<TourActivity> activityTestRule = new ActivityTestRule<>(TourActivity.class);
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
    public void testtoursuccessful() throws Exception {

       solo.clickInList(2);
       solo.clickOnButton(0);
        solo.clearEditText(0);
        solo.clearEditText(1);
        solo.clearEditText(2);
        solo.enterText(0,"Nguyen Van A");
        solo.enterText(1, "1234567890");
        solo.enterText(2, "admin@gmail.com");
        solo.clickOnView(solo.getView(R.id.edtnhaptenkhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapsodienthoaikhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapemailkhachhang));
        this.solo.clickOnButton(0);
        solo.assertCurrentActivity("Current activity should be LoginActivity",ChiTietHoaDon.class);

    }
    @Test
    public void testtourfail() throws Exception {

        solo.clickInList(0);
        solo.clickOnButton(0);
        solo.clearEditText(0);
        solo.clearEditText(1);
        solo.clearEditText(2);
        solo.enterText(0,"");
        solo.enterText(1, "");
        solo.enterText(2, "");
        solo.clickOnView(solo.getView(R.id.edtnhaptenkhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapsodienthoaikhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapemailkhachhang));
        this.solo.clickOnButton(0);
        assertTrue(solo.waitForText("Nhập Đầy đủ thông tin"));

    }
    @Test
    public void testtourtennull() throws Exception {

        solo.clickInList(3);
        solo.clickOnButton(0);
        solo.clearEditText(0);
        solo.clearEditText(1);
        solo.clearEditText(2);
        solo.enterText(0,"");
        solo.enterText(1, "0359254362");
        solo.enterText(2, "use@gmail.com");
        solo.clickOnView(solo.getView(R.id.edtnhaptenkhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapsodienthoaikhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapemailkhachhang));
        this.solo.clickOnButton(0);
      //  solo.assertCurrentActivity("Current activity should be LoginActivity",ChiTietHoaDon.class);
        assertTrue(solo.waitForText("Nhập Đầy đủ thông tin"));

    }
    @Test
    public void testtourtenandphonenull() throws Exception {

        solo.clickInList(4);
        solo.clickOnButton(0);
        solo.clearEditText(0);
        solo.clearEditText(1);
        solo.clearEditText(2);
        solo.enterText(0,"");
        solo.enterText(1, "");
        solo.enterText(2, "use@gmail.com");
        solo.clickOnView(solo.getView(R.id.edtnhaptenkhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapsodienthoaikhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapemailkhachhang));
        this.solo.clickOnButton(0);
        assertTrue(solo.waitForText("Nhập Đầy đủ thông tin"));

    }
    @Test
    public void testtourtenandmailnull() throws Exception {

        solo.clickInList(5);
        solo.clickOnButton(0);
        solo.clearEditText(0);
        solo.clearEditText(1);
        solo.clearEditText(2);
        solo.enterText(0,"");
        solo.enterText(1, "0359254362");
        solo.enterText(2, "");
        solo.clickOnView(solo.getView(R.id.edtnhaptenkhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapsodienthoaikhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapemailkhachhang));
        this.solo.clickOnButton(0);
        assertTrue(solo.waitForText("Nhập Đầy đủ thông tin"));

    }
    @Test
    public void testtourphoneandmailnull() throws Exception {

        solo.clickInList(2);
        solo.clickOnButton(0);
        solo.clearEditText(0);
        solo.clearEditText(1);
        solo.clearEditText(2);
        solo.enterText(0,"Trần Văn A");
        solo.enterText(1, "");
        solo.enterText(2, "");
        solo.clickOnView(solo.getView(R.id.edtnhaptenkhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapsodienthoaikhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapemailkhachhang));
        this.solo.clickOnButton(0);
        assertTrue(solo.waitForText("Nhập Đầy đủ thông tin"));

    }
    @Test
    public void testtourmailnull() throws Exception {
        solo.clickInList(1);
        solo.clickOnButton(0);
        solo.clearEditText(0);
        solo.clearEditText(1);
        solo.clearEditText(2);
        solo.enterText(0,"Trần Văn A");
        solo.enterText(1, "09234234234");
        solo.enterText(2, "");
        solo.clickOnView(solo.getView(R.id.edtnhaptenkhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapsodienthoaikhachhang));
        solo.clickOnView(solo.getView(R.id.edtnhapemailkhachhang));
        this.solo.clickOnButton(0);
        assertTrue(solo.waitForText("Nhập Đầy đủ thông tin"));
    }
}
