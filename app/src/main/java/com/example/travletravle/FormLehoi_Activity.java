package com.example.travletravle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.travletravle.adappter.AdappterLeHoi;
import com.example.travletravle.nameclass.LeHoi;

import java.util.ArrayList;

public class FormLehoi_Activity extends AppCompatActivity {
    GridView gv;
    ArrayList<LeHoi> hinhAnhArrayList ;
    Toolbar toolbar1,toolbar;
    AdappterLeHoi adappterHinhanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_lehoi);
        toolbar = findViewById(R.id.toobarkhachsan);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getActionBar().setDisplayHomeAsUpEnabled(true);
        Anhxa();
    }
    void Anhxa()
    {
        hinhAnhArrayList = new ArrayList<>();
        gv = (GridView) findViewById(R.id.gridkhachsan);
        hinhAnhArrayList.add(new LeHoi(R.drawable.lehoicongchien,"Lễ hội Cồng Chiêng", "Lễ hội cồng chiêng là một lễ hội được tổ chức hàng năm theo hình thức luân phiên.","Tại các tỉnh có văn hóa cồng chiêng, trong đó có Lâm Đồng."));
        hinhAnhArrayList.add(new LeHoi(R.drawable.lehoitra,"Lễ hội Trà – Một lễ hội độc đáo ở Đà Lạt","Thường được tổ chức vào tháng 12 của năm.","Không gian lễ hội mở rộng tổ chức ở cả 3 địa bàn còn lại làm nghề trà là huyện Bảo Lâm, Di Linh, và Cầu Đất (Tp Đà Lạt)."));
        hinhAnhArrayList.add(new LeHoi(R.drawable.lehoithansuoi,"Lễ cúng thần suối","Lễ hội được tổ chức vào khoảng tháng 3 hằng năm với mục đích là tạ ơn thần nước mang mưa thuận gió hòa.","Lễ hội cổ truyền của người Mạ ở Tây Nguyên."));
        hinhAnhArrayList.add(new LeHoi(R.drawable.festivalhoa,"Festival Hoa","Lễ hội được tổ chức 2 năm 1 lần vào dịp cuối năm","Trung tâm thành phố Đà Lạt."));
        hinhAnhArrayList.add(new LeHoi(R.drawable.lehoibomung,"Lễ cúng Thần BơMung","Lễ cúng Bơ mung được tổ chức vào tầm tháng 2 âm lịch hàng năm, tập trung đông đủ người dân buôn làng tham gia lễ hội.","Lễ hội Đà Lạt cúng thần BơMung được tổ chức bởi người bản địa Chu Ru – tộc người thiểu số định cư lâu đời ở vùng đất cao nguyên với nghề làm ruộng là chính."));
        adappterHinhanh = new AdappterLeHoi(R.layout.viewlehoi ,hinhAnhArrayList, FormLehoi_Activity.this);
        gv.setAdapter(adappterHinhanh);


        ArrayList<String> lehoiList1 = new ArrayList<>();
        String list1 ="Lễ hội Cồng Chiêng";
        String ngay1="Lễ hội cồng chiêng là một lễ hội được tổ chức hàng năm theo hình thức luân phiên.";
        String diachi1="Tại các tỉnh có văn hóa cồng chiêng, trong đó có Lâm Đồng.";
        String ns11 ="Lễ hội văn hóa cồng chiêng Tây Nguyên đã được UNESCO công nhận là di sản truyền khẩu và phi vật thể nhân loại.";
        String ns21="Tại đây khi tham gia các ngày hội lớn ở Đà lạt bạn không chỉ có cơ hội tìm hiểu những nét văn hóa đặc sắc của các dân tộc, đồng bào Tây Nguyên mà còn góp phần vào việc tôn tạo và phát triển những giá trị văn hóa đó.";
        String ns31 ="Trong lễ hội cồng chiêng chính là phương tiện, là cầu nối duy nhất giữa con người với thần linh, giao hòa cùng đất trời. Tham dự những lễ hội này chắc chắn bạn sẽ được mở rộng tầm mắt cũng như trải nghiệm thêm nhiều nét văn hóa thú vị mà không nơi nào có được.";
        int  ig11 = R.drawable.lehoicongchien;
        int  ig21 = R.drawable.congchieng2;
        int  ig31 = R.drawable.congchieng3;

        ArrayList<String> lehoiList2 = new ArrayList<>();
        String list2 ="Lễ hội Trà – Một lễ hội độc đáo ở Đà Lạt";
        String ngay2="Thường được tổ chức vào tháng 12 của năm.";
        String diachi2="Không gian lễ hội mở rộng tổ chức ở cả 3 địa bàn còn lại làm nghề trà là huyện Bảo Lâm, Di Linh, và Cầu Đất (Tp Đà Lạt).";
        String ns12 ="Là một trong những lễ hội lớn và độc đáo ở Đà Lạt, lễ hội trà được tổ chức hằng năm nhằm hưởng ứng phong trào cung ứng nguồn nguyên liệu tươi sạch do các doanh nghiệp trà đảm nhận";
        String ns22="Hằng năm với các chủ đề được đưa ra thì lễ hội bao gồm các hoạt động nghệ thuật cùng hội thi hái trà cùng sắc màu Tây Nguyên rồi hội thi về kiến thức trà và cuối cùng là giọng hát trà…";
        String ns32 ="Ngày hội là nơi để thể hiện lòng tự hào của người dân đất trà ở vùng đất Đà Lạt mộng mơ, đây cũng là thời gian thích hợp để các doanh nghiệp quảng bá thương hiệu, học hỏi kinh nghiệm sản xuất, kinh doanh và tạo điều kiện để thu hút vốn đầu tư của các doanh nghiệp thế giới trong bối cảnh kinh tế hội nhập. Khi tham gia lễ hội lớn ở Đà Lạt này bạn nhớ mua chút trà đặc sản về làm quà cho người thân và bạn bè nhé.";
        int ig12 = R.drawable.lehoitra;
        int ig22 = R.drawable.lehoitra2;
        int ig32 = R.drawable.lehoitra3;

        ArrayList<String> lehoiList3 = new ArrayList<>();
        String list3 ="Lễ cúng thần suối";
        String ngay3=": Lễ hội được tổ chức vào khoảng tháng 3 hằng năm với mục đích là tạ ơn thần nước mang mưa thuận gió hòa.";
        String diachi3="Lễ hội cổ truyền của người Mạ ở Tây Nguyên.";
        String ns13 ="Lễ hội cúng thần suối ở Lâm Đồng nhằm mục đích để tạ ơn thần nước đã mang lại may mắn mưa thuận gió hòa. Đây là một trong những lễ hội đặc sắc nhất ở Đà Lạt mà bạn có thể tham dự vào cuối tháng 3 hàng năm.";
        String ns23="Sau khi thu hoạch vụ mùa người dân thường chọn ngày để dọn suối, soạn máng nước và làm thịt lợn, thịt gà để tạ ơn thần linh. ";
        String ns33 ="Đến tham dự ngày hội này bạn sẽ có được cái nhìn thân thiện và tổng quát hơn về văn hóa của người dân Tây Nguyên nói chung cũng như người Đà Lạt nói riêng.";
        int ig13 = R.drawable.lehoithansuoi;
        int ig23 = R.drawable.lehoithansuoi2;
        int ig33 = R.drawable.lehoithansuoi3;

        ArrayList<String> lehoiList4 = new ArrayList<>();
        String list4 ="Festival Hoa";
        String ngay4="Lễ hội được tổ chức 2 năm 1 lần vào dịp cuối năm";
        String diachi4="Trung tâm thành phố Đà Lạt";
        String ns14 ="Từ năm 2005 nhằm tôn vinh người trồng hoa, nên cứ 2 năm một lần người dân ở đây lại tổ chức một lễ hội vô cùng long trọng “festival Hoa Đà Lạt” vào dịp cuối năm để phục vụ du khách cũng như tôn vinh nghề trồng hoa ở đây.";
        String ns24="Sân khấu chính nơi diễn ra lễ hội thường được đặt ở gần hồ Xuân Hương với các màn biểu diễn vô cùng hấp dẫn của hàng ngàn diễn viên chuyên nghiệp và quần chúng. Bên cạnh các tiết mục khai mạc, bế mạc, các tiết mục văn nghệ đặc sắc thì tới với “festival Hoa Đà Lạt” bạn còn có thể tham gia các trường trình hấp dẫn khác như: Hội chợ triển lãm hoa, diễu hành hoa trên đường phố với nhiều hoa lớn nhỏ, hội chợ thương mại, lễ hội tình yêu và lễ cưới tập thể của những đôi uyên ương từ mọi miền của đất nước tập trung về đây, lễ hội rượu vang, chương trình chinh phục đỉnh Langbiang…";
        String ns34 ="Để chuẩn bị cho lễ hội thì người Đà Lạt thường mất rất nhiều thời gian và công sức để trang trí tô điểm những con phố, tuyến đường trở nên lung linh lộng lẫy hơn bao giờ hết. Tham dự lễ hội lớn ở Đà Lạt này chắc chắn sẽ mang lại cho bạn những trải nghiệm thú vị không bao giờ quên.";
        int ig14 = R.drawable.festivalhoa;
        int ig24 = R.drawable.festivalhoa2;
        int ig34 = R.drawable.festivalhoa3;

        ArrayList<String> lehoiList5 = new ArrayList<>();
        String list5 ="Lễ cúng Thần BơMung";
        String ngay5="Lễ cúng Bơ mung được tổ chức vào tầm tháng 2 âm lịch hàng năm, tập trung đông đủ người dân buôn làng tham gia lễ hội. ";
        String diachi5="Lễ hội Đà Lạt cúng thần BơMung được tổ chức bởi người bản địa Chu Ru – tộc người thiểu số định cư lâu đời ở vùng đất cao nguyên với nghề làm ruộng là chính.";
        String ns15 ="Lễ hội Đà Lạt cúng thần BơMung được tổ chức bởi người bản địa Chu Ru – tộc người thiểu số định cư lâu đời ở vùng đất cao nguyên với nghề làm ruộng là chính. Dân làng có làm mương phai, đường dẫn nước từ sông suối vào ruộng cho cây tốt tươi bội thu lúa mới, hoa màu trĩu quả. ";
        String ns25="Vào ngày lễ từ sáng sớm dân làng tập trung phía trước sân đình Bơmung. Nam nữ thanh niên sẽ xếp hàng hai bên để làm nghi thức cúng lễ. Mỗi bên cầm một gặp gà cúng tạ Yàng ban cho điều tốt lành, dân làng khỏe mạnh, gia đình ấm no, bình an. Mỗi nhà dân tự mang ra đóng góp tự nguyện gà vịt, xôi, rượu cần, bánh trái đủ loại mời quan khách. ";
        String ns35 ="Lễ vật dâng thần linh thì người dân thường cúng dê, chủ làng cúng ngựa đều là con vật tượng trưng cho chăn nuôi thuận lợi. Làm lễ cúng xong thì mọi người tập trung mổ trâu bò lợn gà cùng ăn uống tại nhà chung. Đây cũng là dịp mọi người ngồi lại cùng nhau trò chuyện, thiết chặt tình hàng xóm yêu thương, gần gũi nhau hơn.";
        int ig15 = R.drawable.lehoibomung;
        int ig25 = R.drawable.lehoibomung2;
        int ig35 = R.drawable.lehoibomung3;

        Bundle l1= new Bundle();
        l1.putStringArrayList("array",lehoiList1);
        l1.putString("list",list1);
        l1.putString("ngay", ngay1);
        l1.putString("diachi", diachi1);
        l1.putString("ns1",ns11);
        l1.putInt("ig1",ig11);
        l1.putString("ns2",ns21);
        l1.putInt("ig2",ig21);
        l1.putString("ns3",ns31);
        l1.putInt("ig3",ig31);

        Bundle l2= new Bundle();
        l2.putStringArrayList("array",lehoiList2);
        l2.putString("list",list2);
        l2.putString("ngay", ngay2);
        l2.putString("diachi", diachi2);
        l2.putString("ns1",ns12);
        l2.putInt("ig1",ig12);
        l2.putString("ns2",ns22);
        l2.putInt("ig2",ig22);
        l2.putString("ns3",ns32);
        l2.putInt("ig3",ig32);


        Bundle l3= new Bundle();
        l3.putStringArrayList("array",lehoiList3);
        l3.putString("list",list3);
        l3.putString("ngay", ngay3);
        l3.putString("diachi", diachi3);
        l3.putString("ns1",ns13);
        l3.putInt("ig1",ig13);
        l3.putString("ns2",ns23);
        l3.putInt("ig2",ig23);
        l3.putString("ns3",ns33);
        l3.putInt("ig3",ig33);

        Bundle l4= new Bundle();
        l4.putStringArrayList("array",lehoiList4);
        l4.putString("list",list4);
        l4.putString("ngay", ngay4);
        l4.putString("diachi", diachi4);
        l4.putString("ns1",ns14);
        l4.putInt("ig1",ig14);
        l4.putString("ns2",ns24);
        l4.putInt("ig2",ig24);
        l4.putString("ns3",ns34);
        l4.putInt("ig3",ig34);

        Bundle l5= new Bundle();
        l5.putStringArrayList("array",lehoiList5);
        l5.putString("list",list5);
        l5.putString("ngay", ngay5);
        l5.putString("diachi", diachi5);
        l5.putString("ns1",ns15);
        l5.putInt("ig1",ig15);
        l5.putString("ns2",ns25);
        l5.putInt("ig2",ig25);
        l5.putString("ns3",ns35);
        l5.putInt("ig3",ig35);

        ArrayList<Bundle> bundleArrayList = new ArrayList<>();
        bundleArrayList.add(l1);
        bundleArrayList.add(l2);
        bundleArrayList.add(l3);
        bundleArrayList.add(l4);
        bundleArrayList.add(l5);


        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FormLehoi_Activity.this, LeHoiActivity.class);
                intent.putExtras(bundleArrayList.get(position));

                startActivity(intent);
            }
        });

    }
}