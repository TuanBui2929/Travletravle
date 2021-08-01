package com.example.travletravle;

import android.content.Context;
import android.widget.TextView;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.robotium.solo.Solo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DangkiTest {
    @Rule
    public ActivityTestRule<Dangki> activityTestRule = new ActivityTestRule<>(Dangki.class);
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
    // test case kiểm tra đăng kí khong nhap gia tri vao
    @Test
    public void testregisterfail() throws Exception {

        solo.clearEditText(3);
        solo.clearEditText(2);
        solo.clearEditText(1);
        solo.clearEditText(0);
        solo.enterText(3,"");
        solo.enterText(2, "");
        solo.enterText(1,"");
        solo.enterText(0, "");
        solo.clickOnView(solo.getView(R.id.emaidangki));
        solo.clickOnView(solo.getView(R.id.sdtdangki));
        solo.clickOnView(solo.getView(R.id.hovatendangki));
        solo.clickOnView(solo.getView(R.id.passwordangki));
        this.solo.clickOnButton(0);
        assertTrue(solo.waitForText("Vui Lòng Nhập Đầy Đủ Thông Tin"));
 //       solo.assertCurrentActivity("Current activity should be LoginActivity", Dangnhap.class);
    }
// testcase dang ki thanh cong
    @Test
    public void testregistersuccessful() throws Exception {

        solo.clearEditText(3);
        solo.clearEditText(2);
        solo.clearEditText(1);
        solo.clearEditText(0);
        solo.enterText(3,"Buiadmin@gmail.com");
        solo.enterText(2, "0923323434");
        solo.enterText(1,"Nguyen Van Admin");
        solo.enterText(0, "123456");
        solo.clickOnView(solo.getView(R.id.emaidangki));
        solo.clickOnView(solo.getView(R.id.sdtdangki));
        solo.clickOnView(solo.getView(R.id.hovatendangki));
        solo.clickOnView(solo.getView(R.id.passwordangki));
        this.solo.clickOnButton(0);
        solo.assertCurrentActivity("Current activity should be LoginActivity", Dangnhap.class);
    }
    @Test
    public void testregistermailnull() throws Exception {

        solo.clearEditText(3);
        solo.clearEditText(2);
        solo.clearEditText(1);
        solo.clearEditText(0);
        solo.enterText(3,"");
        solo.enterText(2, "0359254362");
        solo.enterText(1," Trần Văn A");
        solo.enterText(0, "tranvana@123");
        solo.clickOnView(solo.getView(R.id.emaidangki));
        solo.clickOnView(solo.getView(R.id.sdtdangki));
        solo.clickOnView(solo.getView(R.id.hovatendangki));
        solo.clickOnView(solo.getView(R.id.passwordangki));
        this.solo.clickOnButton(0);
        assertTrue(solo.waitForText("Vui Lòng Nhập Đầy Đủ Thông Tin"));
    }
    @Test
    public void testregistermailwrong() throws Exception {

        solo.clearEditText(3);
        solo.clearEditText(2);
        solo.clearEditText(1);
        solo.clearEditText(0);
        solo.enterText(3,"usergmail.com");
        solo.enterText(2, "0359254362");
        solo.enterText(1," Trần Văn A");
        solo.enterText(0, "tranvana@123");
        solo.clickOnView(solo.getView(R.id.emaidangki));
        solo.clickOnView(solo.getView(R.id.sdtdangki));
        solo.clickOnView(solo.getView(R.id.hovatendangki));
        solo.clickOnView(solo.getView(R.id.passwordangki));
        this.solo.clickOnButton(0);
        assertTrue(solo.waitForText("Dang ki that bai"));
    }
    @Test
    public void testregisternumbernull() throws Exception {

        solo.clearEditText(3);
        solo.clearEditText(2);
        solo.clearEditText(1);
        solo.clearEditText(0);
        solo.enterText(3,"user@gmail.com");
        solo.enterText(2, "");
        solo.enterText(1," Trần Văn A");
        solo.enterText(0, "tranvana@123");
        solo.clickOnView(solo.getView(R.id.emaidangki));
        solo.clickOnView(solo.getView(R.id.sdtdangki));
        solo.clickOnView(solo.getView(R.id.hovatendangki));
        solo.clickOnView(solo.getView(R.id.passwordangki));
        this.solo.clickOnButton(0);
        assertTrue(solo.waitForText("Vui Lòng Nhập Đầy Đủ Thông Tin"));
    }
    @Test
    public void testregisternamenull() throws Exception {

        solo.clearEditText(3);
        solo.clearEditText(2);
        solo.clearEditText(1);
        solo.clearEditText(0);
        solo.enterText(3,"user@gmail.com");
        solo.enterText(2, "02309243234");
        solo.enterText(1,"");
        solo.enterText(0, "tranvana@123");
        solo.clickOnView(solo.getView(R.id.emaidangki));
        solo.clickOnView(solo.getView(R.id.sdtdangki));
        solo.clickOnView(solo.getView(R.id.hovatendangki));
        solo.clickOnView(solo.getView(R.id.passwordangki));
        this.solo.clickOnButton(0);
        assertTrue(solo.waitForText("Vui Lòng Nhập Đầy Đủ Thông Tin"));
    }
    @Test
    public void testregisterpasswordnull() throws Exception {

        solo.clearEditText(3);
        solo.clearEditText(2);
        solo.clearEditText(1);
        solo.clearEditText(0);
        solo.enterText(3,"user@gmail.com");
        solo.enterText(2, "02309243234");
        solo.enterText(1,"Tran Van A");
        solo.enterText(0, "");
        solo.clickOnView(solo.getView(R.id.emaidangki));
        solo.clickOnView(solo.getView(R.id.sdtdangki));
        solo.clickOnView(solo.getView(R.id.hovatendangki));
        solo.clickOnView(solo.getView(R.id.passwordangki));
        this.solo.clickOnButton(0);
        assertTrue(solo.waitForText("Vui Lòng Nhập Đầy Đủ Thông Tin"));
    }

    public void testregisterpasswordnotinvalid() throws Exception {

        solo.clearEditText(3);
        solo.clearEditText(2);
        solo.clearEditText(1);
        solo.clearEditText(0);
        solo.enterText(3,"userfsdfsdfsdf@gmail.com");
        solo.enterText(2, "02309243234");
        solo.enterText(1,"Tran Van A");
        solo.enterText(0, "123");
        solo.clickOnView(solo.getView(R.id.emaidangki));
        solo.clickOnView(solo.getView(R.id.sdtdangki));
        solo.clickOnView(solo.getView(R.id.hovatendangki));
        solo.clickOnView(solo.getView(R.id.passwordangki));
        this.solo.clickOnButton(0);
        assertTrue(solo.waitForText("Vui Lòng Nhập Đầy Đủ Thông Tin"));
    }


}
