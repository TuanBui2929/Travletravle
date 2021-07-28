package com.example.travletravle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.travletravle.adappter.AdappterKhachsan;
import com.example.travletravle.adappter.AdappterSlider;
import com.example.travletravle.nameclass.Khachsan;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
public class KhachsanActivity extends AppCompatActivity {
    GridView gridView2;
    ArrayList<Khachsan> ImageArrayList ;
    AdappterKhachsan adappterHinhanh;
    SliderView sliderView;
    Toolbar toolbar;
    int[] image={ R.drawable.ttchotel1, R.drawable.muonthanh1, R.drawable.terra1, R.drawable.woder1,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khachsan2);
        toolbar = findViewById(R.id.toobks);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        anhxa();
    }
    private void anhxa() {
        ImageArrayList = new ArrayList<>();
        gridView2 = (GridView) findViewById(R.id.griks);
        ImageArrayList.add(new Khachsan(R.drawable.ttchotel1,"Khách sạn TTC Hotel Premium","04, Nguyễn Thị Minh Khai, phường 1, TP.Đà Lạt.","02633 576 888","700.000đ"));
        ImageArrayList.add(new Khachsan(R.drawable.muonthanh1,"Khách sạn Mường Thanh Đà Lạt","42 Phan Bội Châu, phường 2, TP.Đà Lạt."," 02633 576 888","700.000đ"));
        ImageArrayList.add(new Khachsan(R.drawable.terra1,"Khách sạn Terracotta Hotel & Resort","Phân khu chức năng 7.9, KDL hồ Tuyền Lâm, TP.Đà Lạt","02633 576 888","700.000đ"));
        ImageArrayList.add(new Khachsan(R.drawable.woder1,"Khách sạn Dalat Wonder Resort","số 19 đường Hoa Hồng, hồ Tuyền Lâm, phường 4, TP.Đà Lạt","02633 576 888","700.000đ"));
        ImageArrayList.add(new Khachsan(R.drawable.king1,"Khách sạn Kings (King Hotel)","10 Bùi Thị Xuân, phường 3, TP.Đà Lạt.","02633 576 888","700.000đ"));

        adappterHinhanh = new AdappterKhachsan(R.layout.khachsan,ImageArrayList, KhachsanActivity.this);
        gridView2.setAdapter(adappterHinhanh);
        sliderView= findViewById(R.id.sliks);
        AdappterSlider adappterSlider = new AdappterSlider(image);
        sliderView.setSliderAdapter(adappterSlider);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        ArrayList<String> ksan1 = new ArrayList<>();
        String tenks1= "Khách sạn TTC Hotel Premium";
        String ksdiachi1 = "04, Nguyễn Thị Minh Khai, phường 1, TP.Đà Lạt.";
        String kssdt1 = "02633 576 888";
        String giaks1 = "700.000đ";
        String ksnd11 ="TTC Hotel Premium nằm ngay trung tâm thành phố, gần chợ Đà Lạt với thiết kế phòng và Suite sang trọng và đầy đủ các dịch vụ.";
        String ksnd21 ="Gồm 91 phòng được lót sàn bằng gỗ đánh bóng, khu vực sảnh là nơi đón khách trong không gian rộng cùng với kiến trúc hiện đại. Phòng hội nghị đạt chuẩn quốc tế được phủ sóng internet, có tầng hầm riêng để đậu xe. Nơi đây có thể ngắm nhìn khung cảnh hồ Xuân Hương và chợ Đà Lạt, thuận tiện cho việc mua sắm và các dịch vụ vui chơi ở thành phố.";
        int ksig11 = R.drawable.ttchotel1;
        int ksig21 = R.drawable.ttchotel2;
        int ksig31 = R.drawable.ttchotel3;

        ArrayList<String> ksan2 = new ArrayList<>();
        String tenks2= "Khách sạn Mường Thanh Đà Lạt";
        String ksdiachi2 = "42 Phan Bội Châu, phường 2, TP.Đà Lạt.";
        String kssdt2 = "02633 576 888";
        String giaks2 = "700.000đ";
        String ksnd12 ="Tọa lạc gần chợ Đà Lạt, hồ Xuân Hương cách đó 100m và cách vườn hoa thành phố 1,6km. Mường Thanh là cái tên nổi tiếng trên khắp cả nước với nội thất sang trọng, hiện đại. ";
        String ksnd22 ="Ngoài ra, các dịch vụ chu đáo như phòng thể dục, bể bơi trong nhà, phòng hội nghị, quầy bar luôn đáp ứng nhu cầu của quý khách. Bên cạnh đó, nhà hàng Âu, Á với các đầu bếp nhiều năm trong nghề và đội ngũ phục vụ chuyên nghiệp sẽ đem đến cho quý khách sự hài lòng khi chọn khách sạn Mường Thanh.";
        int ksig12 = R.drawable.muonthanh1;
        int ksig22 = R.drawable.muongthanh2;
        int ksig32 = R.drawable.muongthanh3;

        ArrayList<String> ksan3 = new ArrayList<>();
        String tenks3= "Khách sạn Terracotta Hotel & Resort";
        String ksdiachi3 = "Phân khu chức năng 7.9, KDL hồ Tuyền Lâm, TP.Đà Lạt";
        String kssdt3 = "02633 576 888";
        String giaks3 = "700.000đ";
        String ksnd13 ="Nằm ở vị trí đắc địa của Hồ Tuyền Lâm, mất 10 phút đi xe bus hoặc ô tô để đến trung tâm thành phố Đà Lạt, là địa điểm thuận lợi để dừng chân cho chuyến du lịch Đà Lạt. Với không gian rộng lớn thích hợp để tổ chức các sự kiện.";
        String ksnd23 ="Bao gồm 240 phòng và 21 villa. Cùng với rất nhiều các hạng mục giải trí trong khu resort: sân chơi tennis, sân bóng rổ, sân cầu lông, bàn bi da, bàn bi lắc. Hồ bơi trong nhà, khu Gym, nhà trò chơi dành cho trẻ em, spa & massage, phòng karaoke, khu tham quan vườn dâu…";
        int ksig13 = R.drawable.terra1;
        int ksig23 = R.drawable.terra2;
        int ksig33 = R.drawable.terra3;

        ArrayList<String> ksan4 = new ArrayList<>();
        String tenks4= "Khách sạn Dalat Wonder Resort";
        String ksdiachi4 = "số 19 đường Hoa Hồng, hồ Tuyền Lâm, phường 4, TP.Đà Lạt";
        String kssdt4 = "02633 576 888";
        String giaks4 = "700.000đ";
        String ksnd14 ="Được tọa lạc dọc theo một nhánh của hồ Tuyền Lâm. Khu nghỉ dưỡng đua vào hoạt động 149 phòng và villa theo phong cách Châu Âu. Với thiết kế đẹp và hiện đại hài hòa vào phong cảnh hữu tình. Môi trường và không khí ở đây tạo cho du khách một kì nghỉ yên tĩnh và cảnh quan tuyệt vời của “thành phố sương mù ngàn hoa”.";
        String ksnd24 ="Cho dù quý khách nghỉ dưỡng theo cặp đôi, hay với bạn bè và gia đình. Đặc biệt là hưởng tuần trăng mật thì chúng tôi chắc chắn rằng quý vị sẽ được tận hưởng  các dịch vụ thân thiện. Tận tâm thấu hiểu khách hàng và chuyên nghiệp của chúng tôi với những trải nghiệm đẳng cấp đáng nhớ.";
        int ksig14 = R.drawable.woder1;
        int ksig24 = R.drawable.woder2;
        int ksig34 = R.drawable.woder3;

        ArrayList<String> ksan5 = new ArrayList<>();
        String tenks5= "Khách sạn Kings (King Hotel)";
        String ksdiachi5 = "10 Bùi Thị Xuân, phường 3, TP.Đà Lạt.";
        String kssdt5 = "02633 576 888";
        String giaks5 = "700.000đ";
        String ksnd15 ="Nằm gần trung tâm thành phố, cách chợ khoảng 2 phút đi bộ. Với sự kết hợp hài hòa giữa nét cổ kính và hiện đại. Các dịch vụ phòng nghỉ, nhà hàng cùng các dịch vụ khác đạt chuẩn 4 sao sẽ đem lại sự hài lòng khi đến với Kings Hotel.";
        String ksnd25 ="Nghĩ dưỡng tại đây quý khách dễ dàng đi lại, tham quan các điểm du lịch và thưởng thức các món đặc sản của Đà Lạt.";
        int ksig15 = R.drawable.king1;
        int ksig25 = R.drawable.king2;
        int ksig35 = R.drawable.king3;

        Bundle k1= new Bundle();
        k1.putStringArrayList("khachsan",ksan1);
        k1.putString("tenks",tenks1);
        k1.putString("ksdiachi",ksdiachi1);
        k1.putString("kssdt",kssdt1);
        k1.putString("giaks",giaks1);
        k1.putString("ksnd1",ksnd11);
        k1.putString("ksnd2",ksnd21);
        k1.putInt("ksig1", ksig11);
        k1.putInt("ksig2", ksig21);
        k1.putInt("ksig3", ksig31);

        Bundle k2= new Bundle();
        k2.putStringArrayList("khachsan",ksan2);
        k2.putString("tenks",tenks2);
        k2.putString("ksdiachi",ksdiachi2);
        k2.putString("kssdt",kssdt2);
        k2.putString("giaks",giaks2);
        k2.putString("ksnd1",ksnd12);
        k2.putString("ksnd2",ksnd22);
        k2.putInt("ksig1", ksig12);
        k2.putInt("ksig2", ksig22);
        k2.putInt("ksig3", ksig32);

        Bundle k3= new Bundle();
        k3.putStringArrayList("khachsan",ksan3);
        k3.putString("tenks",tenks3);
        k3.putString("ksdiachi",ksdiachi3);
        k3.putString("kssdt",kssdt3);
        k3.putString("giaks",giaks3);
        k3.putString("ksnd1",ksnd13);
        k3.putString("ksnd2",ksnd23);
        k3.putInt("ksig1", ksig13);
        k3.putInt("ksig2", ksig23);
        k3.putInt("ksig3", ksig33);

        Bundle k4= new Bundle();
        k4.putStringArrayList("khachsan",ksan4);
        k4.putString("tenks",tenks4);
        k4.putString("ksdiachi",ksdiachi4);
        k4.putString("kssdt",kssdt4);
        k4.putString("giaks",giaks4);
        k4.putString("ksnd1",ksnd14);
        k4.putString("ksnd2",ksnd24);
        k4.putInt("ksig1", ksig14);
        k4.putInt("ksig2", ksig24);
        k4.putInt("ksig3", ksig34);

        Bundle k5= new Bundle();
        k5.putStringArrayList("khachsan",ksan5);
        k5.putString("tenks",tenks5);
        k5.putString("ksdiachi",ksdiachi5);
        k5.putString("kssdt",kssdt5);
        k5.putString("giaks",giaks5);
        k5.putString("ksnd1",ksnd15);
        k5.putString("ksnd2",ksnd25);
        k5.putInt("ksig1", ksig15);
        k5.putInt("ksig2", ksig25);
        k5.putInt("ksig3", ksig35);

        ArrayList<Bundle> bundleArrayList = new ArrayList<>();
        bundleArrayList.add(k1);
        bundleArrayList.add(k2);
        bundleArrayList.add(k3);
        bundleArrayList.add(k4);
        bundleArrayList.add(k5);
        gridView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(KhachsanActivity.this, FormKhachsanActivity.class);
                intent.putExtras(bundleArrayList.get(position));

                startActivity(intent);
            }

        });

    }
}