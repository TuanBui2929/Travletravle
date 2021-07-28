package com.example.travletravle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.travletravle.adappter.AdappterDiemden;
import com.example.travletravle.adappter.AdappterSlider;
import com.example.travletravle.nameclass.Diemden;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class DiemdenActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Diemden> ImageArrayList ;
    AdappterDiemden adappterHinhanh;
    SliderView sliderView;
    Toolbar toolbar;
    int[] image={ R.drawable.cafe1, R.drawable.amazing1, R.drawable.quangtruong1, R.drawable.langbiang1,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diemden);
        toolbar = findViewById(R.id.toolbardd);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        anhxa();
    }
    private void anhxa() {
        ImageArrayList = new ArrayList<>();
        gridView = (GridView) findViewById(R.id.griddd);
        ImageArrayList.add(new Diemden(R.drawable.cafe1,"Dalat Golf Café", "14 Đống Đa, Phường 3, Thành phố Đà Lạt."));
        ImageArrayList.add(new Diemden(R.drawable.amazing1,"Amazing Coffee Đà Lạt","02 Đống Đa – Phường 3 – Đà Lạt"));
        ImageArrayList.add(new Diemden(R.drawable.quangtruong1,"Quảng trường Lâm Viên","Trần Quốc Toản, Phường 1, Thành phố Đà Lạt."));
        ImageArrayList.add(new Diemden(R.drawable.langbiang1,"Núi Lang Biang","Lạc Dương, tỉnh Lâm Đồng"));
        ImageArrayList.add(new Diemden(R.drawable.culan1,"Làng Cù Lần","ĐT722, Lát, Lạc Dương, Lâm Đồng"));
        ImageArrayList.add(new Diemden(R.drawable.dau1,"Vườn dâu biofresh Đà Lạt","Gần ngay khu du lịch Hồ Than Thở đường Hồ Xuân Hương phường 10 Đà Lạt"));
        ImageArrayList.add(new Diemden(R.drawable.suquan1,"XQ Sử Quán","258 Mai Anh Đào, phường 9, Đà Lạt"));
        ImageArrayList.add(new Diemden(R.drawable.thunglung1,"Thung lũng Tình Yêu","số 7 đường Mai Anh Đào, phường 8, thành phố Đà Lạt."));
        ImageArrayList.add(new Diemden(R.drawable.doiche1,"Đồi Chè Cầu Đất", " Phát Chi, Thành phố Đà Lạt, Lâm Đồng"));
        ImageArrayList.add(new Diemden(R.drawable.thac1,"Thác Datanla", " QL20 Đèo Prenn, Phường 3, Thành phố Đà Lạt, Lâm Đồng"));

        adappterHinhanh = new AdappterDiemden(R.layout.viewdiemden,ImageArrayList, DiemdenActivity.this);
        gridView.setAdapter(adappterHinhanh);
        sliderView= findViewById(R.id.sliderdd);
        AdappterSlider adappterSlider = new AdappterSlider(image);
        sliderView.setSliderAdapter(adappterSlider);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();


        ArrayList<String> diemden1 = new ArrayList<>();
        String title1= "Dalat Golf Café";
        String diachidiemden1 = "14 Đống Đa, Phường 3, Thành phố Đà Lạt.";
        String sodienthoai1 = "02633 503535";
        String thongtin11 ="Không phải đi quá xa để tìm cho mình một không gian có thể thu trọn thành phố Đà Lạt vào tầm mắt. Dù bạn đến Dalat Golf bất kỳ thời điểm nào đều có thể thoải mái tận hưởng, buổi sáng sương mù bao phủ, buổi chiều hoàng hôn ngập tràn nắng vàng ấm áp, một ngày nắng trong xanh hay một chiều mưa buồn.";
        String thongtin21 ="Tuy đơn giản nhưng không kém phần sang trọng, menu đa dạng, phong phú, đội ngũ nhân viên chuyên nghiệp, nhiệt tình, bãi đậu xe rộng rãi thoải mái, tất cả đều tạo nên sức cuốn hút riêng dành cho Dalat Golf.";
        int ig11 = R.drawable.cafe1;
        int ig21 = R.drawable.cafe2;
        int ig31 = R.drawable.cafe3;

        ArrayList<String> diemden2 = new ArrayList<>();
        String title2= "Amazing Coffee Đà Lạt";
        String diachidiemden2 = "02 Đống Đa – Phường 3 – Đà Lạt";
        String sodienthoai2 = "02633 50 35 35";
        String thongtin12 ="Trong tiết trời se se lạnh của Đà Lạt ngồi bên khung cửa sổ thơ mộng, phóng tầm mắt ngắm view thành phố từ trên cao đẹp bất kể ngày đêm thì chắc hẳn ai cũng sẽ bị si mê. Nằm ngay đầu cửa ngõ vào thành phố cùng view đắt giá nhìn thẳng bến xe liên tỉnh Đà Lạt.\n" +
                "Không gian quán được décor đơn giản và nhẹ nhàng nhưng cũng không kém phần ấm cúng. Ngồi đây ngắm mây, ngắm trời, ngắm toàn cảnh thành phố Đà Lạt từ trên cao, luyên thuyên vài ba câu chuyện, chắc hẳn tâm trạng sẽ tốt hơn rất nhiều.\n";
        String thongtin22 ="Một Amazing hiện đại vẫn toát ra vẻ lãng mạn tự nhiên vốn có, sẽ là một nơi thật chill để bạn relax đấy.";
        int ig12 = R.drawable.amazing1;
        int ig22 = R.drawable.amazing2;
        int ig32 = R.drawable.amazing3;

        ArrayList<String> diemden3 = new ArrayList<>();
        String title3= "Quảng trường Lâm Viên";
        String diachidiemden3 = "Trần Quốc Toản, Phường 1, Thành phố Đà Lạt.";
        String sodienthoai3 = "077254235";
        String thongtin13 ="Sức hút kỳ lạ của công trình độc đáo này đã tạo nên một diện mạo mới cho thành phố mộng mơ Đà Lạt. Được xây dựng từ đầu năm 2016, Quảng trường Lâm Viên nhanh chóng trở thành điểm tới hấp dẫn không chỉ du khách trong nước và quốc tế mà còn là điểm sống ảo của giới trẻ lui tới đây.";
        String thongtin23 ="Được mệnh danh là “đóa hoa dã quỳ khổng lồ của Đà Lạt” thật không có một nơi nào có thể sánh bằng. Với diện tích 72.000m2 đã mang tới một không gian rộng lớn với nhiều hoạt động giải trí thu hút du khách. ";
        int ig13 = R.drawable.quangtruong1;
        int ig23 = R.drawable.lamvien2;
        int ig33 = R.drawable.lamvien3;

        ArrayList<String> diemden4 = new ArrayList<>();
        String title4= "Núi Lang Biang";
        String diachidiemden4 = "Lạc Dương, tỉnh Lâm Đồng";
        String sodienthoai4 = "02633 50 35 35";
        String thongtin14 ="Nằm ở độ cao 2167m so với mặt biển. Nhìn từ xa, du khách sẽ thấy Núi Lang Biang có 2 ngọn núi mà người dân nơi đây đăt tên là “ Núi Ông và Núi Bà”. Sở dĩ có tên gọi này bởi trong đó còn ẩn chứa một câu truyện truyền thuyết về một tình yêu say đắm của chàng Lang và nàng Biang. Chính vì điều này lại càng khiến du khách cảm thấy tò mò khi đến đây.";
        String thongtin24 ="Du khách ngỡ như mình đang lạc vào thiên đường thần tiên với những hàng cây thông và hoa dại trải dài 2 bên đường. Càng lên cao, khung cảnh càng trở nên rộng lớn bao trùm cả bầu trời với những áng mây trôi lững lờ, những màn sương mù bao phủ núi đồi tạo cảm giác như du khách với thiên nhiên Lang Biang gần gũi nhau hơn bao giờ hết. Thật chẳng dễ dàng gì khi chụp lại được những khoảnh khắc tuyệt vời khi thả hồn mình ở nơi đây.";
        int ig14 = R.drawable.langbiang1;
        int ig24 = R.drawable.langbiang2;
        int ig34 = R.drawable.langbiang3;

        ArrayList<String> diemden5 = new ArrayList<>();
        String title5= "Làng Cù Lần";
        String diachidiemden5 = "ĐT722, Lát, Lạc Dương, Lâm Đồng";
        String sodienthoai5 = "02633 50 40 33";
        String thongtin15 ="Càng đi sâu vào trong những con đường nhỏ phủ đầy sắc hoa, du khách sẽ bất ngờ trước chiếc cầu treo nối vắt ngang qua dòng suối nhỏ dẫn vào làng. Cũng chính nơi đây tổ chức rất nhiều hoạt động ngoài trời như thả diều, leo núi, bắt cá hay thậm chí là chơi trò chơi đua xe jeep mạo hiểm với giá vé tương ứng là 140.000 đồng/người lớn. Cảm giác yên bình nhưng cũng rất thú vị thật khiến cho du khách tham lam muốn giữ trọn khoảnh khắc này bên mình.";
        String thongtin25 ="Dành trọn một buổi tối nơi đây, cắm trại và ăn đồ nướng cùng dốc bầu tâm sự với bạn bè hay gia đình giữa không gian bao la rộng lớn của thiên nhiên núi rừng, hít hà không khí trong lành kèm theo một chút se se lạnh Đà Lạt mang đến cho du khách cảm giác sảng khoái, mọi muộn phiền như được tan biến đi.";
        int ig15 = R.drawable.culan1;
        int ig25 = R.drawable.culan2;
        int ig35 = R.drawable.culan3;

        ArrayList<String> diemden6 = new ArrayList<>();
        String title6= "Vườn dâu biofresh Đà Lạt";
        String diachidiemden6 = "Gần ngay khu du lịch Hồ Than Thở đường Hồ Xuân Hương phường 10 Đà Lạt";
        String sodienthoai6 = "02632 56 40 23";
        String thongtin16 ="Đến Đà Lạt, du khách nào cũng muốn được  nhìn thấy những khu vườn dâu tây chín mọng. Vốn là một đặc sản nổi tiếng của Đà Lạt, chỉ cần đến đây, du khách sẽ thấy đâu đâu cũng có trái dâu tay chín đỏ.\n" +
                "\n" +
                "Lạc vào khu vườn dâu tây, du khách sẽ choáng ngợp với không gian rộng lớn, thích thú ngắm nhìn trái dâu tây chín ẩn mình trong chiếc lá xanh. Dâu tây ở đây được trồng trên giàn hoặc theo kiểu luống. Du khách có thể chọn hái những trái dâu tây tùy thích.\n";
        String thongtin26 ="Bật mí để hái được những trái dâu tây ngon, du khách nên chọn những quả dâu tây ẩn mình trong lá, quả căng mọng, chín đỏ. Chắc chắn bạn sẽ thưởng thức được những trái dâu ngon cũng như mang về làm quà cho gia đình hay bạn bè của mình.";
        int ig16 = R.drawable.dau1;
        int ig26 = R.drawable.dau2;
        int ig36 = R.drawable.dau3;

        ArrayList<String> diemden7 = new ArrayList<>();
        String title7= "XQ Sử Quán";
        String diachidiemden7 = "258 Mai Anh Đào, phường 9, Đà Lạt";
        String sodienthoai7 = "02632 56 78 90";
        String thongtin17 ="Choáng ngợp với không gian của nghề thêu và ngắm nhìn những tác phẩm nghệ thuật được thêu rất tinh tế bởi bàn tay của người nghệ nhân. Du khách như ngập chìm vào những câu chuyện huyền thoại, những câu chuyện mang đậm dấu ấn cổ kính và được biết thêm nhiều nét văn hóa truyền thống.";
        String thongtin27 ="XQ Sử Quán Đà Lạt có rất nhiều khu vực như: khu vực truyền thống, khu vực phát tích, khu vực nghệ thuật của người địa phương. Mỗi một khu vực du khách đến sẽ ngỡ như lạc vào thiên đường của mỗi một nét đẹp văn hóa nghề thêu khác nhau. Từ những câu chuyện liên quan đến nghề thêu rồi tới nghệ thuật thêu tranh phong cảnh thậm chí là trưng bày những tác phẩm đặc sắc.\n" +
                "\n" +
                "Tham quan một vòng XQ Sử Quán, thưởng thức những chương trình biểu diễn nghệ thuật cuối tuần hay dạo một vòng ẩm thực những món ăn dân gian được chế biến khéo léo qua các nghệ nhân mang đến cho du khách những giây phút tuyệt vời khi lạc vào đây.\n";
        int ig17 = R.drawable.suquan1;
        int ig27 = R.drawable.suquan2;
        int ig37 = R.drawable.suquan3;

        ArrayList<String> diemden8 = new ArrayList<>();
        String title8= "Thung lũng Tình Yêu";
        String diachidiemden8 = "số 7 đường Mai Anh Đào, phường 8, thành phố Đà Lạt.";
        String sodienthoai8 = "02732 65 87 92";
        String thongtin18 ="Không chỉ là một thành phố mộng mơ mà Đà Lạt còn là điểm đến của nhiều cặp đôi yêu nhau. Thung lũng Tình Yêu là một trong những thắng cảnh thu hút du khách đến Đà Lạt.";
        String thongtin28 ="Thung lũng Tình Yêu là một điểm đến thích hợp cho du khách check-in những bức ảnh đẹp hay những đôi lứa yêu nhau tới đây ngắm cảnh, chụp ảnh, viết những lời nguyện ước treo lên cây tại thung lũng.\n" +
                "\n" +
                "Viết những lời nguyện ước treo lên cây tại thung lũng Tình Yêu (Ảnh sưu tầm)\n" +
                "Nhắc đến tên Thung lũng Tình Yêu không chỉ mang ý nghĩa tình yêu đất nước, tình yêu thiên nhiên mà đó còn là tình yêu đôi lứa dành cho nhau.";
        int ig18 = R.drawable.thunglung1;
        int ig28 = R.drawable.thunglung2;
        int ig38 = R.drawable.thunglung3;

        ArrayList<String> diemden9 = new ArrayList<>();
        String title9= "Đồi Chè Cầu Đất";
        String diachidiemden9 = "Phát Chi, Thành phố Đà Lạt, Lâm Đồng";
        String sodienthoai9 = "02733 584 025";
        String thongtin19 ="Những đồi chè xanh thẳm, trải dài ngút ngàn – Đồi Chè Cầu Đất đang là điểm đến yêu thích của du khách khi đến với Đà Lạt.";
        String thongtin29 ="Điểm đầu tiên thu hút du khách đó chính là hình ảnh những cô công nhân đang lượm lá chè, hái những trái chè nhỏ, xinh nằm gọn lòng bàn tay. Đứng giữa đồi chè bao la, rộng lớn ngắm nhìn màu trắng tinh khôi của hoa chè, tận hưởng không khí trong lành mát mẻ như muốn níu chân con người đến nơi đây.";
        int ig19 = R.drawable.doiche1;
        int ig29 = R.drawable.doiche2;
        int ig39 = R.drawable.doiche3;

        ArrayList<String> diemden10 = new ArrayList<>();
        String title10= "Thác Datanla";
        String diachidiemden10 = " 15 Đường Trần Phú, Phường 3, Thành phố Đà Lạt, Lâm Đồng";
        String sodienthoai10 = "02733 314 265";
        String thongtin110 ="Datanla là một trong những ngọn thác lớn của Đà Lạt. Du khách đến đây không chỉ choáng ngợp trước vẻ đẹp thơ mộng của thác Datanla mà còn được mạo hiểm với những trò chơi thú vị.";
        String thongtin210 ="Những dòng thác lúc nhẹ nhàng, lúc thì lại dữ dội chảy qua ghềnh đá nhấp nhô tung bọt trắng xóa như bực tức điều gì đó. Du khách còn được trải nghiệm những trò chơi như trươt máng với giá vé 40.000 đồng/người hay thưởng ngoạn cáp treo ngắm khung cảnh thiên nhiên thơ mộng chỉ với 50.000 đồng/chiều. Mạo hiểm hơn là đu dây vượt thác, nghe thì có vẻ sợ nhưng lại mang đến cho du khách cảm giác gần gũi với thiên nhiên hơn lúc nào hết.";
        int ig110 = R.drawable.thac1;
        int ig210 = R.drawable.thac2;
        int ig310 = R.drawable.thac3;


        Bundle d1= new Bundle();
        d1.putStringArrayList("array",diemden1);
        d1.putString("title",title1);
        d1.putString("diachidiemden",diachidiemden1);
        d1.putString("sodienthoai",sodienthoai1);
        d1.putString("thongtin1",thongtin11);
        d1.putString("thongtin2",thongtin21);
        d1.putInt("ig1", ig11);
        d1.putInt("ig2", ig21);
        d1.putInt("ig3", ig31);

        Bundle d2= new Bundle();
        d2.putStringArrayList("array",diemden2);
        d2.putString("title",title2);
        d2.putString("diachidiemden",diachidiemden2);
        d2.putString("sodienthoai",sodienthoai2);
        d2.putString("thongtin1",thongtin12);
        d2.putString("thongtin2",thongtin22);
        d2.putInt("ig1", ig12);
        d2.putInt("ig2", ig22);
        d2.putInt("ig3", ig32);

        Bundle d3= new Bundle();
        d3.putStringArrayList("array",diemden3);
        d3.putString("title",title3);
        d3.putString("diachidiemden",diachidiemden3);
        d3.putString("sodienthoai",sodienthoai3);
        d3.putString("thongtin1",thongtin13);
        d3.putString("thongtin2",thongtin23);
        d3.putInt("ig1", ig13);
        d3.putInt("ig2", ig23);
        d3.putInt("ig3", ig33);

        Bundle d4= new Bundle();
        d4.putStringArrayList("array",diemden4);
        d4.putString("title",title4);
        d4.putString("diachidiemden",diachidiemden4);
        d4.putString("sodienthoai",sodienthoai4);
        d4.putString("thongtin1",thongtin14);
        d4.putString("thongtin2",thongtin24);
        d4.putInt("ig1", ig14);
        d4.putInt("ig2", ig24);
        d4.putInt("ig3", ig34);


        Bundle d5= new Bundle();
        d5.putStringArrayList("array",diemden5);
        d5.putString("title",title5);
        d5.putString("diachidiemden",diachidiemden5);
        d5.putString("sodienthoai",sodienthoai5);
        d5.putString("thongtin1",thongtin15);
        d5.putString("thongtin2",thongtin25);
        d5.putInt("ig1", ig15);
        d5.putInt("ig2", ig25);
        d5.putInt("ig3", ig35);

        Bundle d6= new Bundle();
        d6.putStringArrayList("array",diemden6);
        d6.putString("title",title1);
        d6.putString("diachidiemden",diachidiemden6);
        d6.putString("sodienthoai",sodienthoai6);
        d6.putString("thongtin1",thongtin16);
        d6.putString("thongtin2",thongtin26);
        d6.putInt("ig1", ig16);
        d6.putInt("ig2", ig26);
        d6.putInt("ig3", ig36);

        Bundle d7= new Bundle();
        d7.putStringArrayList("array",diemden7);
        d7.putString("title",title7);
        d7.putString("diachidiemden",diachidiemden7);
        d7.putString("sodienthoai",sodienthoai7);
        d7.putString("thongtin1",thongtin17);
        d7.putString("thongtin2",thongtin27);
        d7.putInt("ig1", ig17);
        d7.putInt("ig2", ig27);
        d7.putInt("ig3", ig37);

        Bundle d8= new Bundle();
        d8.putStringArrayList("array",diemden8);
        d8.putString("title",title8);
        d8.putString("diachidiemden",diachidiemden8);
        d8.putString("sodienthoai",sodienthoai8);
        d8.putString("thongtin1",thongtin18);
        d8.putString("thongtin2",thongtin28);
        d8.putInt("ig1", ig18);
        d8.putInt("ig2", ig28);
        d8.putInt("ig3", ig38);

        Bundle d9= new Bundle();
        d9.putStringArrayList("array",diemden9);
        d9.putString("title",title9);
        d9.putString("diachidiemden",diachidiemden9);
        d9.putString("sodienthoai",sodienthoai9);
        d9.putString("thongtin1",thongtin19);
        d9.putString("thongtin2",thongtin29);
        d9.putInt("ig1", ig19);
        d9.putInt("ig2", ig29);
        d9.putInt("ig3", ig39);

        Bundle d10= new Bundle();
        d10.putStringArrayList("array",diemden10);
        d10.putString("title",title10);
        d10.putString("diachidiemden",diachidiemden10);
        d10.putString("sodienthoai",sodienthoai10);
        d10.putString("thongtin1",thongtin110);
        d10.putString("thongtin2",thongtin210);
        d10.putInt("ig1", ig110);
        d10.putInt("ig2", ig210);
        d10.putInt("ig3", ig310);


        ArrayList<Bundle> bundleArrayList = new ArrayList<>();
        bundleArrayList.add(d1);
        bundleArrayList.add(d2);
        bundleArrayList.add(d3);
        bundleArrayList.add(d4);
        bundleArrayList.add(d5);
        bundleArrayList.add(d6);
        bundleArrayList.add(d7);
        bundleArrayList.add(d8);
        bundleArrayList.add(d9);
        bundleArrayList.add(d10);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(DiemdenActivity.this, FormDiadiem_Activity.class);
                intent.putExtras(bundleArrayList.get(position));

                startActivity(intent);
            }

        });
    }

}