package com.example.travletravle.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.travletravle.Noidung_Tintuc;
import com.example.travletravle.R;
import com.example.travletravle.adappter.AdappterTintuc;
import com.example.travletravle.nameclass.TinTuc;

import java.util.ArrayList;
public class TinTucFragment extends Fragment {
    ListView listView;
    ArrayList<TinTuc>  tinTucArrayList  = new ArrayList<>(); ;
    AdappterTintuc adappterHinhanh;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if(view ==null) {

            view = inflater.inflate(R.layout.fragment_tin_tuc, container, false);
            listView = (ListView) view.findViewById(R.id.listviewtintuc);

            adappterHinhanh = new AdappterTintuc(R.layout.view_tin_tuc, getarraylist(), this.getActivity());
            listView.setAdapter(adappterHinhanh);
            return view;
        }
        return view;

    }

    private ArrayList<TinTuc> getarraylist()
    {
        tinTucArrayList.add(new TinTuc(R.drawable.ttuc1, "Lâm Đồng: Phát thông báo khẩn tìm người liên quan đến bệnh mắc Covid-19 có lịch trình dày đặc", "29/05/2021"));
        tinTucArrayList.add(new TinTuc(R.drawable.ttuc21, "Bệnh nhân COVID-19 liên quan hội thánh truyền giáo đi 12 điểm ở Đà Lạt", "28/5/2021"));
        tinTucArrayList.add(new TinTuc(R.drawable.ttuc31, "Đường cao tốc ở Lâm Đồng tiềm năng để phát triển", "27/05/2021"));
        tinTucArrayList.add(new TinTuc(R.drawable.ttuc41, "Xử lý tình trạng xây dựng công trình, làm nhà kính, nhà lưới trên đất lâm nghiệp", "26/05/2021"));
        tinTucArrayList.add(new TinTuc(R.drawable.ttuc51, "Ngang nhiên làm đường bê tông trong rừng thông Đà Lạt", "17/05/2021"));


        ArrayList<String> ttuc1 = new ArrayList<>();
        String tintuc1 ="Lâm Đồng: Phát thông báo khẩn tìm người liên quan đến bệnh mắc Covid-19 có lịch trình dày đặc";
        String ngaydangtintuc1 =" 29/05/2021";
        String nguoidangtintuc1 ="Biên soạn: Trung Nam";
        String tintuc11 ="Trung tâm kiểm soát bệnh tật tỉnh Lâm Đồng (CDC Lâm Đồng) và Cổng thông tin điện tử tỉnh Lâm Đồng phát đi thông báo khẩn số 1 về việc tìm những người tiếp xúc BN 6437 nhiễm Covid-19 liên quan Hội thánh truyền giáo Phục Hưng có lịch trình di chuyển đến 13 điểm trên địa bàn TP.Đà Lạt từ ngày 22 - 23.5.";
        String tintuc21 ="Vì vậy Trung tâm Kiểm soát bệnh tật tỉnh Lâm Đồng đề nghị những người liên quan liên hệ cơ sở y tế gần nhất, hoặc liên hệ số điện thoại đường dây nóng của Sở Y tế Lâm Đồng (0918316355 – 0914971889) hoặc Trung tâm Kiểm soát bệnh tật tỉnh Lâm Đồng (0918564072 – 02633816864). Bên cạnh đó cung cấp số điện thoại những người đã tiếp xúc với mình và khai báo y tế trực tuyến.\n" +
                "Trước tình hình dịch Covid-19 diễn biến phức tạp, chiều 28-5, UBND tỉnh Lâm Đồng đã ban hành văn bản số 3513, thành lập 5 chốt liên ngành kiểm soát phòng, chống dịch Covid-19 tại các cửa ngõ ra vào tỉnh Lâm Đồng.\n" +
                "Theo đó, 5 chốt kiểm soát phòng, chống dịch Covid-19 này lần lượt trên Quốc lộ 20 (Đồng Nai đi Lâm Đồng) đặt tại huyện Đạ Huoai; Bình Thuận đi Lâm Đồng trên tỉnh lộ 721 đặt tại huyện Đạ Huoai; Bình Thuận đi Lâm Đồng trên Quốc lộ 55 đặt tại huyện Bảo Lâm; Bình Thuận đi Lâm Đồng trên Quốc lộ 28 đặt tại địa bàn huyện Di Linh; Bình Thuận đi Lâm Đồng trên Quốc lộ 28B đặt tại địa bàn huyện Đức Trọng.\n" +
                "5 chốt kiểm soát phòng, chống dịch Covid-19 này hoạt động từ 7 giờ sáng ngày nay (29-5) cho đến khi có thông báo mới.\n";
        int igtintuc11 = R.drawable.ttuc1;
        int igtintuc21 = R.drawable.ttuc22;
        int igtintuc31 = R.drawable.ttuc2;

        ArrayList<String> ttuc2 = new ArrayList<>();
        String tintuc2 ="Bệnh nhân 6437 nhiễm Covid-19 liên quan Hội thánh truyền giáo Phục Hưng đến Đà Lạt du lịch";
        String ngaydangtintuc2 =" 28/05/2021";
        String nguoidangtintuc2 ="Biên soạn: Danh Tuấn";
        String tintuc12 ="Các cơ quan chức năng tỉnh Lâm Đồng đang thần tốc truy vết những người tiếp xúc BN 6437 nhiễm Covid-19  liên quan Hội thánh truyền giáo Phục Hưng ở TP.HCM đến TP.Đà Lạt du lịch.\n" +
                "Tối 28.5,  Trung tâm kiểm soát bệnh tật tỉnh Lâm Đồng (CDC Lâm Đồng) và Cổng thông tin điện tử tỉnh Lâm Đồng phát đi thông báo khẩn số 1 về việc tìm những người tiếp xúc BN 6437 nhiễm Covid-19 liên quan Hội thánh truyền giáo Phục Hưng có lịch trình di chuyển đến 13 điểm trên địa bàn TP.Đà Lạt từ ngày 22 - 23.5.\n" +
                "BN 6437 sống tại TP.HCM làm việc chung với BN 6301 (thành viên đến Hội thánh truyền giáo Phục Hưng). Khoảng 0 giờ ngày 22.5, BN 6437 cùng nhóm bạn 4 người đi xe khách Thành Bưởi - Lê Hồng Phong - Vĩnh Viễn - TP.HCM đi Đà Lạt (trên xe 34 giường). Đến khoảng 6 giờ cùng ngày, BN 6437 và nhóm bạn đến bến xe Thành Bưởi (số 6, Lữ Gia,P.9, TP.Đà Lạt).\n";
        String tintuc22 ="Trong thời gian ở Đà Lạt, BN 6437 cùng nhóm bạn đã đến 13 điểm tại Đà Lạt như: Chùa Linh Phong (P.10), thác Cam Ly (P.5), vườn hoa xương rồng Kombi Land Cofice (đèo Mimosa, P.3), quán lẩu gà Tao Ngộ (89 Hai bà Trưng, P.6), đạp xe đạp nước tại hồ Xuân Hương, đến quảng trường Lâm Viên, đường dốc chợ Đà Lạt, dịch vụ thuê xe máy (48 An Bình, P.3), đến 0 giờ ngày 23.5 thì đi xe Thành Bưởi về lại TP.HCM.\n" +
                "Tồi 28.5, các lực lượng chức năng của TP. Đà Lạt tổ chức truy vết những trường hợp có tiếp xúc với BN 6437 để thực hiện các biện pháp phòng dịch Covid-19.\n" +
                "CDC Lâm Đồng đề nghị những người liên quan đến BN 6437 (bệnh nhân liên quan đến Hội thánh truyền giáo Phục Hưng) theo lịch trình từ 0 giờ 00 ngày 22.5 đến 0 giờ 00 ngày 23.5 gọi đến cơ sở y tế gần nhất, khai báo y tế trực tuyến để phòng dịch Covid-19. Liên hệ số điện thoại đường dây nóng của Sở Y tế Lâm Đồng (0918316355 - 0914971889) hoặc CDC Lâm Đồng (0918564072 - 02633816864). Bên cạnh đó cung cấp số điện thoại những người đã tiếp xúc với mình và khai báo y tế trực tuyến để  phòng dịch Covid-19.\n";
        int igtintuc12 = R.drawable.ttuc21;
        int igtintuc22 = R.drawable.ttuc22;
        int igtintuc32 = R.drawable.ttuc23;

        ArrayList<String> ttuc3 = new ArrayList<>();
        String tintuc3 ="Đà Lạt: 76 trường hợp liên quan 3 ca nhiễm Covid-19 ở chung cư Sen Xanh";
        String ngaydangtintuc3 =" 27/05/2021";
        String nguoidangtintuc3 ="Biên soạn: Đăng Khoa";
        String tintuc13 ="Chiều 29.5, bác sĩ Nguyễn Đức Thuận, Giám đốc Sở Y tế Lâm Đồng, cho biết các cơ quan chức năng tỉnh Lâm Đồng xác định có 76 trường hợp liên quan 3 ca nhiễm Covid-19 cùng một gia đình ở chung cư Sen Xanh ( P.Hòa Thạnh, Q.Tân Phú, TP.HCM).\n" +
                "Như Thanh Niên đã phản ánh, Trung tâm Kiểm soát bệnh tật TP.HCM (HCDC) công bố các ca nhiễm Covid-19 liên quan đến Bệnh viện đa khoa Hoàn Mỹ Sài Gòn, trong đó có 3 ca dương tính Covid-19 ở chung cư Sen Xanh trong một gia đình, gồm: người chồng, người vợ đang mang thai 10 tuần và một người con là bé trai 3 tuổi.\n" +
                "Liên quan đến các trường hợp này, từ ngày 14 - 16.5. bà N.T.T. (ngụ P.12, TP.Đà Lạt), mẹ của người chồng, đến thăm con trai, con dâu và cháu ở chung cư Sen Xanh.\n";
        String tintuc23 ="Sáng 28.5, khi biết các con và cháu dương tính với Covid-19, bà T. đến Trạm Y tế P.12 chủ động khai báo y tế và lịch trình di chuyển từ ngày 14 - 28.5. Ngay trong ngày 28.5, bà T. được đưa đi cách ly để phòng chống Covid-19 tại Bệnh xá H32, thuộc Bộ Chỉ huy quân sự tỉnh Lâm Đồng và cho kết quả xét nghiệm âm tính với Covid-19 lần 1. Đến nay sức khỏe bà T. bình thường, không sốt, không ho, không rát họng.\n" +
                "Qua rà soát, các cơ quan chức năng truy vết được 76 trường hợp tiếp xúc gần với bà T. từ ngày 16 - 28.5 và buộc cách ly tại nhà để phòng chống dịch Covid-19. CDC Lâm Đồng lấy 37 mẫu xét nghiệm của các trường hợp tiếp xúc trực tiếp với bà T. và đều cho kết quả âm tính với Covid-19.\n" +
                "Như vậy ngoài 75 trường hợp F1 và 57 trường hợp F2 liên quan BN 6437 đến TP.Đà Lạt tham quan du lịch từ ngày 22 - 23.5 (BN 6437 liên quan chuỗi lây nhiễm ở Hội thánh truyền giáo Phục Hưng), tại TP.Đà Lạt còn có 76 trường hợp liên quan đến các ca nhiễm Covid-19 tại chung cư Sen Xanh. Tính đến chiều 29.5, trên địa bàn TP.Đà Lạt và tỉnh Lâm Đồng chưa phát hiện trường hợp nào dương tính với Covid- 19. Tỉnh Lâm Đồng đang cách ly 224 trường hợp, trong đó cách ly tại cơ sở y tế 9 trường hợp, cách ly tập trung 90 trường hợp và 125 trường hợp cách ly tại nhà.";
        int igtintuc13 = R.drawable.ttuc31;
        int igtintuc23 = R.drawable.ttuc32;
        int igtintuc33 = R.drawable.ttuc33;

        ArrayList<String> ttuc4 = new ArrayList<>();
        String tintuc4 ="Kỷ luật cảnh cáo cô giáo đánh học sinh lớp 2 bầm tím mông";
        String ngaydangtintuc4 =" 16/05/2021";
        String nguoidangtintuc4 ="Biên soạn: Trung Nam";
        String tintuc14 ="Ngày 17.5 ông Trần Đức Minh, Trưởng phòng GD-ĐT TP.Đà Lạt, cho biết, Hội đồng kỷ luật trường Tiểu học Trưng Vương đã có quyết định kỷ luật cô giáo L.T.B.L, chủ nhiệm lớp 2D, với hình thức cảnh cáo, vì cô có hành vi đánh bầm tím mông một học sinh trong lớp.\n" +
                "Bên cạnh hình thức kỷ luật cảnh cáo, cô L. không được phân công giảng dạy và làm chủ nhiệm lớp trong ít nhất 6 tháng và lùi thời hạn xét nâng lương, theo ông Minh.\n" +
                "Như Thanh Niên đã phản ánh, vào chiều 6.5, cô L.T.B.L, ôn tập cho học sinh lớp 2D để chuẩn bị cho kỳ kiểm tra cuối năm. Em P.H.K không hoàn thành bài tập dù đã được nhắc nhở nhiều lần nên cô dùng cán cây xúc rác đánh học sinh, làm bầm tím mông. Trước đó, cô L. cũng nhiều lần gửi tin nhắn đến phụ huynh, đề nghị nhắc nhở em K. làm bài vì kỳ kiểm tra cuối năm sắp đến.\n" +
                "Phát hiện con trai bị cô giáo đánh bầm tím mông, hai phụ huynh là bà Đ.T.U.G và ông P.H.T tìm đến nhà cô L. ở đường Cổ Loa, P.2 (Đà Lạt), hành hung cô giáo. Tại đây bà G. vừa chửi cô L. vừa quay phim phát trực tiếp trên mạng xã hội. Cô L. nhận sai và xin lỗi vợ chồng bà G. Tuy nhiên, bà G. vẫn lao vào dùng tay tát cô giáo L. nhiều cái, túm tóc và dùng chân đá vào người cô giáo L.\n";
        String tintuc24 ="Sau khi vụ việc xảy ra, Công an P.2 đã đến nhà cô L. lập biên bản ghi nhận vụ việc và chuyển hồ sơ lên Công an TP. Đà Lạt xử lý.\n" +
                "Trong bản tường trình, bà G. cho rằng bà lấy điện thoại quay phim làm bằng chứng và cô giáo giật điện thoại bỏ đi. Sau đó, cô giáo gọi hai người đàn ông đến cầm gạch xông vào đánh vợ chồng bà G. nên hai người bỏ chạy.\n" +
                "Bà G. thừa nhận bà \"không đúng, nhưng sự việc có nguyên nhân khiến tôi quá bức xúc không kiềm chế được\". \"Tôi làm vậy muốn nhắc cô giáo, cô có bị đau hay không, sao mà đánh con tôi đến mức như vậy. Tôi không đúng thì tôi đồng ý chịu xử lý của pháp luật, sai đến đâu tôi chịu đến đó”, theo bản tường trình của bà G.\n" +
                "Còn trong bản tường trình của mình, cô giáo L.T.B.L nhận thấy hành vi của mình là vi phạm đạo đức nhà giáo, xúc phạm đến thân thể học sinh. \"Tôi xin nhận hoàn toàn sai phạm của mình và chấp nhận việc xử lý của cấp trên”, theo cô L.\n" +
                "Chiều 17.5, lãnh đạo Công an Đà Lạt cho biết vẫn đang xác minh làm rõ vụ việc vợ chồng bà G. đến nhà cô giáo L. hành hung cô giáo sau khi cô đánh em K. bầm tím mông; đến nay vẫn chưa có kết luận nên chưa đưa ra hình thức xử lý.\n";
        int igtintuc14 = R.drawable.ttuc41;
        int igtintuc24 = R.drawable.ttuc42;
        int igtintuc34 = R.drawable.ttuc43;

        ArrayList<String> ttuc5 = new ArrayList<>();
        String tintuc5 ="Ngang nhiên làm đường bê tông trong rừng thông Đà Lạt";
        String ngaydangtintuc5 =" 17/05/2021";
        String nguoidangtintuc5 ="Biên soạn: Danh Tuấn";
        String tintuc15 ="Sáng 15-5, các đơn vị thuộc UBND TP Đà Lạt (Lâm Đồng) đã giải toả, thu hồi khu vực đất rừng vừa bị lấn chiếm, xây dựng đường bê tông.Cụ thể, tại khu vực lô c, khoảnh 3, tiểu khu 156b, lâm phần do Ban quản lý rừng Lâm Viên quản lý (thuộc địa bàn phường 10, TP Đà Lạt) các đối tượng đã sử dụng máy múc san gạt, giật cấp tạo mặt bằng ngay dưới tán thông.\n" +
                "Để tạo lối đi thuận tiện, các đối tượng còn cho đan sắt dày đặc dưới bề mặt đất để tăng độ chắc chắn khi đổ bê tông.\n";
        String tintuc25 ="Bước đầu, cơ quan chức năng xác định có khoảng 200m đường bê tông đã kịp hoàn thành, bề mặt rộng từ 2 – 4m, dày 10 – 20cm, khu vực rừng bị xâm phạm khoảng 900m2, trong đó có nhiều gốc thông bị chặt rễ, phủ đất đá lên trên.\n" +
                "Ngay sau khi ghi nhận vụ việc UBND TP Đà Lạt yêu cầu Hạt trưởng Hạt kiểm Lâm Đà Lạt; Trưởng ban Quản lý rừng Lâm Viên nghiêm túc rút kinh nghiệm trong việc không kịp thời phát giác vụ việc.\n" +
                "UBND TP Đà Lạt cũng chỉ đạo công an điều tra, xác minh đối tượng vi phạm, lập hồ sơ xử lý nghiêm theo quy định.\n";
        int igtintuc15 = R.drawable.ttuc51;
        int igtintuc25 = R.drawable.ttuc52;
        int igtintuc35 = R.drawable.ttuc53;

        Bundle t1= new Bundle();
        t1.putStringArrayList("arraytintuc",ttuc1);
        t1.putString("tintuc",tintuc1);
        t1.putString("ngaydangtintuc", ngaydangtintuc1);
        t1.putString("nguoidangtintuc", nguoidangtintuc1);
        t1.putString("nguoidang",nguoidangtintuc1);
        t1.putString("tintuc1",tintuc11);
        t1.putString("tintuc2",tintuc21);
        t1.putInt("igtintuc1", igtintuc11);
        t1.putInt("igtintuc2", igtintuc21);
        t1.putInt("igtintuc3", igtintuc31);

        Bundle t2= new Bundle();
        t2.putStringArrayList("arraytintuc",ttuc2);
        t2.putString("tintuc",tintuc2);
        t2.putString("ngaydangtintuc", ngaydangtintuc2);
        t2.putString("nguoidangtintuc",nguoidangtintuc2);
        t2.putString("tintuc1",tintuc12);
        t2.putString("tintuc2",tintuc22);
        t2.putInt("igtintuc1", igtintuc12);
        t2.putInt("igtintuc2", igtintuc22);
        t2.putInt("igtintuc3", igtintuc32);

        Bundle t3= new Bundle();
        t3.putStringArrayList("arraytintuc",ttuc3);
        t3.putString("tintuc",tintuc3);
        t3.putString("ngaydangtintuc", ngaydangtintuc3);
        t3.putString("nguoidangtintuc",nguoidangtintuc3);
        t3.putString("tintuc1",tintuc13);
        t3.putString("tintuc2",tintuc23);
        t3.putInt("igtintuc1", igtintuc13);
        t3.putInt("igtintuc2", igtintuc23);
        t3.putInt("igtintuc3", igtintuc33);

        Bundle t4= new Bundle();
        t4.putStringArrayList("arraytintuc",ttuc4);
        t4.putString("tintuc",tintuc4);
        t4.putString("ngaydangtintuc", ngaydangtintuc4);
        t4.putString("nguoidangtintuc",nguoidangtintuc4);
        t4.putString("tintuc1",tintuc14);
        t4.putString("tintuc2",tintuc24);
        t4.putInt("igtintuc1", igtintuc14);
        t4.putInt("igtintuc2", igtintuc24);
        t4.putInt("igtintuc3", igtintuc34);

        Bundle t5= new Bundle();
        t5.putStringArrayList("arraytintuc",ttuc5);
        t5.putString("tintuc",tintuc5);
        t5.putString("ngaydangtintuc", ngaydangtintuc5);
        t5.putString("nguoidangtintuc",nguoidangtintuc5);
        t5.putString("tintuc1",tintuc15);
        t5.putString("tintuc2",tintuc25);
        t5.putInt("igtintuc1", igtintuc15);
        t5.putInt("igtintuc2", igtintuc25);
        t5.putInt("igtintuc3", igtintuc35);

        ArrayList<Bundle> bundleArrayList = new ArrayList<>();
        bundleArrayList.add(t1);
        bundleArrayList.add(t2);
        bundleArrayList.add(t3);
        bundleArrayList.add(t4);
        bundleArrayList.add(t5);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(TinTucFragment.this.getActivity(), Noidung_Tintuc.class);
                intent.putExtras(bundleArrayList.get(position));

                startActivity(intent);
            }

        });
        return tinTucArrayList;


    }


}