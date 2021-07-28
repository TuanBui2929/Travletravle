package com.example.travletravle.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.travletravle.Noidung_Baiviet;
import com.example.travletravle.R;
import com.example.travletravle.adappter.AdappterTintuc;
import com.example.travletravle.nameclass.TinTuc;

import java.util.ArrayList;


public class BaiVietFragment extends Fragment {
    ListView listView;
    ArrayList<TinTuc> baivietArrayList  = new ArrayList<>(); ;
    AdappterTintuc adappterHinhanh;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bai_viet, container, false);
        listView = (ListView) view  .findViewById(R.id.listviewbaiviet);
        baivietArrayList.add(new TinTuc(R.drawable.baiviet11,"Khám phá lịch sử Đà Lạt - tìm về miền đất ngập tràn sắc hoa nơi phố núi","29/5/2021"));
        baivietArrayList.add(new TinTuc(R.drawable.baiviet21,"Địa điểm vui chơi 'đẹp quên lối về' ở Đà Lạt","29/5/2021"));
        baivietArrayList.add(new TinTuc(R.drawable.baiviet31,"Cuối tuần trekking Langbiang, tắm thác lạnh 5 độ C","29/5/2021"));
        baivietArrayList.add(new TinTuc(R.drawable.baiviet41,"Ba quán bún thố cho chuyến đi Đà Lạt mùa mưa","29/5/2021"));
        baivietArrayList.add(new TinTuc(R.drawable.baiviet51,"Địa điểm vui chơi 'đẹp quên lối về' ở Đà Lạt","29/5/2021"));
        adappterHinhanh = new AdappterTintuc(R.layout.view_tin_tuc,baivietArrayList,getActivity());
        listView.setAdapter(adappterHinhanh);


        ArrayList<String> bviet1 = new ArrayList<>();
        String baiviet1 ="Khám phá lịch sử Đà Lạt - tìm về miền đất ngập tràn sắc hoa nơi phố núi\n";
        String ngaydang1 =" 29/05/2021";
        String nguoidang1 ="Biên soạn: Trung Nam";
        String baiviet11 ="Nằm trên cao nguyên Lâm Viên thuộc khu vực Tây Nguyên, Đà Lạt là thành phố du lịch nổi tiếng của tỉnh Lâm Đồng nước ta. \n" +
                "\n" +
                "Đà Lạt nằm cách TP HCM khoảng hơn 300km về phía Bắc, trong khi cách thủ đô Hà Nội tới 1.500km về phía Nam\n" +
                "\n" +
                "Đà Lạt có tổng diện tích gần 400km vuông, với độ cao khoảng 1.500m so với mực nước biển. Cùng với Buôn Ma Thuột, Đà Lạt là 1 trong 2 đô thị miền núi đông dân nhất cả nước.\n" +
                "\n" +
                "Nơi đây vốn là địa bàn cư trú từ thời xa xưa của các cư dân người Lạch, người Chil và người Srê thuộc dân tộc Cơ Ho. Mãi cho đến cuối thế kỉ XIX, khi người Pháp cho tìm kiếm một địa điểm nghỉ dưỡng ở Đông Dương thì nơi này mới được xây dựng và phát triển dần dần thành một đô thị phồn thịnh, hiện đại với biệt thự, khách sạn, trường học cùng vô số công sở. \n" +
                "\n" +
                "Đà Lạt sở hữu cho mình rất nhiều biệt danh khác nhau. Trong đó, mỗi cái tên đều gợi nhớ về một nét đặc điểm khó phai nhòa của nơi đây, tiêu biểu như: Thành phố ngàn hoa”, Thành phố sương mù, Thành phố tình yêu, Tiểu Paris phương Đông…\n";
        String baiviet21 ="Lịch sử kể lại rằng, vùng cao nguyên Lâm Viên trước kia vốn là địa bàn cư trú của các dân tộc ít người. Sau đó, đến khoảng cuối thế kỉ XIX mới được người Pháp khai phá, thám hiểm dần dần. \n" +
                "Năm 1893, Toàn quyền Đông Dương Jean-Marie de Lanessan đã giao nhiệm vụ cho bác sĩ Alexandre Yersin tiến hành khảo sát tuyến đường bộ từ Sài Gòn, xuyên qua vùng đất lâu đời của người Thượng và kết thúc ở một địa điểm thuộc bờ biển miền Trung. Trong chuyến hành trình của mình, Alexandre Yersin đã đặt chân tới cao nguyên Lâm Viên vào ngày 21/6/1893, đánh dấu bước đầu tiên trong quá trình hình thành và phát triển Đà Lạt sau này. \n" +
                "Sau đó, đến năm 1897, Toàn quyền Đông Dương tiếp theo là Paul Doumer đã gửi thư hỏi ý kiến bác sĩ Yersin trong quá trình tìm kiếm một địa điểm nghỉ dưỡng cho người Pháp ở Đông Dương. Cả hai đã đi đến thống nhất và quyết định đích thân đi khảo sát thực tế tại cao nguyên Lâm Viên. \n" +
                "Thời gian tiếp theo, Toàn quyền Đông Dương thay người kế vị, dự án xây dựng Đà Lạt theo đó cũng bị gián đoạn. Tuy nhiên, nhiều đoàn khảo sát vẫn được gửi đến cao nguyên Lâm Viên để nghiên cứu, khám phá dẫn đến việc phát triển dần dần mạng lưới giao thông tại Đà Lạt. \n" +
                "Đến thời kì chiến tranh thế giới lần thứ nhất, nhiều người Pháp tìm đến Đà Lạt do không thể trở về quê hương trong những kì nghỉ. Đến ngày 20/4/1916, thị tứ Đà Lạt được thành lập theo quyết định của Hội đồng Phụ chính thời vua Duy Tân. \n" +
                "Tiếp sau đó, Ernest Hébrard - kiến trúc sư người Pháp, được Toàn quyền Maurice Long bổ nhiệm làm chủ trì qui hoạch thị trấn Đà Lạt. Ông kết hợp những mẫu kiến trúc cổ điển châu Âu cùng với trang trí của mĩ thuật Việt Nam để tạo ra phong cách riêng cho thành phố Đà Lạt. \n" +
                "Được mệnh danh là “thủ đô mùa hè” của toàn Đông Dương, Đà Lạt bước vào giai đoạn phát triển cực thịnh trong những năm 1940. Nơi đây trở thành trung tâm nghỉ dưỡng, ";
        int igbaiviet11 = R.drawable.baiviet11;
        int igbaiviet21 = R.drawable.baiviet12;
        int igbaiviet31 = R.drawable.baiviet13;

        ArrayList<String> bviet2 = new ArrayList<>();
        String baiviet2 ="Đà Lạt, lạc giữa bềnh bồng trời mây trong mùa 'săn' đẹp nhất";
        String ngaydang2 =" 29/05/2021";
        String nguoidang2 ="Biên soạn: Danh Tuấn" ;
        String baiviet12 ="Khi các mùa hoa qua đi, cũng là lúc Đà Lạt bắt đầu vào mùa mưa, với đặc điểm thời tiết sáng nắng chiều mưa, cũng là lúc các tay máy đi săn mây, mùa đẹp nhất trong năm.\n" +
                "Mùa này sương kết lại, dường như ngày nào Đà Lạt cũng có sương mây lắng đọng, quyện với cây rừng, nhà cửa tạo thành bức tranh tuyệt đẹp, dưới ánh đèn và ráng trời, mây tạo thành những khối sắc màu tuyệt đẹp.\n" +
                "Buổi sáng khi mọi người còn đang an giấc, 3 giờ sáng, nhóm chúng tôi tập trung tại quán cà phê Carino, xuất phát theo hướng mà nhóm dự đoán sẽ có sương đẹp, thường thì chỉ chính xác khoảng 60%, vì mùa này hay có gió chướng thổi mạnh trên 7km, làm sương mây bốc lên, có những hôm sương bốc cao, phủ kín hết, kể cả những ngọn núi cao hơn 2000m, hôm đó người ta gọi là \"thất thủ\".\n";
        String baiviet22 ="Để săn được một bức ảnh đẹp lệ thuộc nhiều yếu tố như dự báo, kỹ thuật chụp ảnh, kinh nghiệm và may mắn nên mới gọi là \"săn mây\", nhưng nếu hội đủ sẽ có những bức ảnh để đời, có những khoảnh khắc chụp sau nhiều năm vẫn chưa thấy trở lại.\n" +
                "Ngày càng khó chụp vì Đà Lạt ngày một đô thị hóa, nhà lồng mọc lên quá nhanh, nhiều ngọn núi đang bị phá, sương giờ ít lắng vì không có cây giữ chân mây.\n" +
                "Nếu ai vẫn khắc khoải với mây Đà Lạt, thì hãy tranh thủ chụp thật nhiều, bởi vì với tốc độ đô thị hóa như hiện nay, bạn sẽ ngày càng có ít cơ hội tìm mây như tiên cảnh trên Đà Lạt.\n" +
                "Dưới đây là những biển mây Đà Lạt được chụp vào nhiều khoảng thời gian mùa \"săn mây\".\n";
        int igbaiviet12 = R.drawable.baiviet21;
        int igbaiviet22 = R.drawable.baiviet24;
        int igbaiviet32 = R.drawable.baiviet23;

        ArrayList<String> bviet3 = new ArrayList<>();
        String baiviet3 ="Ngắm Đà Lạt vào thu chìm trong biển sương mù";
        String ngaydang3 =" 29/05/2021";
        String nguoidang3 ="Biên soạn: Đăng Khoa";
        String baiviet13 ="Chuyến đi Đà Lạt đầu tháng 10, tôi trải nghiệm sâu sắc “cô nàng đỏng đảnh sáng nắng chiều mưa” trong cả 4 ngày ở xứ này. Sớm bình minh mơ màng tuyệt đẹp, sáng nắng chói chang, chiều bất ngờ mây đen kéo đến, mưa tầm tã, âm ỉ đến tối thì tạnh ráo.\n" +
                "\n" +
                "Ngày đầu di chuyển đến Đà Lạt, tôi thuê một chiếc xe cub màu vàng bắt mắt để làm phương tiện di chuyển và “đạo cụ chụp ảnh” cho chuyến khám phá đầy hứa hẹn của mình.\n" +
                "Trải nghiệm tôi mong đợi nhất khi đến xứ sở sương mù mùa này là ngắm vẻ đẹp trữ tình của thành phố trong ánh ban mai. Chọn ở tại một homestay trên đường Tô Hiệu, gần trung tâm thành phố, còn các điểm đón bình minh đều cách đó khoảng 10 km nhưng với háo hức trong lòng, tôi cảm thấy dường như hành trình chẳng quá xa xôi.\n" +
                "\n" +
                "Sau đêm đầu tiên nghỉ ngơi ở homestay, sáng sớm ngày thứ 2, tôi bắt đầu chuyến du ngoạn đến đồi Đa Phú cách trung tâm thành phố 10 km về phía Tây Bắc. Nơi đây cũng là điểm đến yêu thích nhất của tôi trong chuyến đi này.\n" +
                "Leo tới đỉnh núi vừa lúc mặt trời ló rạng, tôi ngẩn ngơ ngắm những tia nắng đầu tiên chiếu xuống nhành cây kẽ lá, đường mòn 2 bên rừng thông và cỏ ngậm sương óng ánh. Phía xa là tầng tầng lớp lớp núi chồng mây bồng bềnh phiêu lãng ôm lấy thành phố chìm trong sương phủ. Tôi như bị hút vào cảnh vật, thẫn thờ, say đắm mãi đến khi mặt trời lên cao.\n";
        String baiviet23 ="Điểm đón bình minh khác để lại ấn tượng sâu sắc không kém trong tôi là đồi Thiên Phúc Đức. Đường đến đồi này dễ đi hơn Đa Phú. Cảnh quan dọc hai bên đường đẹp tựa miền nông thôn châu Âu. Đồi Thiên Phúc Đức khá quang, chỉ có vài cây thông tách biệt, còn lại là bãi cỏ lau thấp. Qua lớp sương mỏng manh hòa với làn mây trắng, khung cảnh vấn vương vẻ bình yên đến lạ.\n" +
                "Tiến sâu về phía huyện Lạc Dương, tôi tìm đến cây thông cô đơn ở hồ Suối Vàng, điểm check-in nổi tiếng với những người mê mẩn một Đà Lạt lãng mạn. Đường đi không quá khó nhưng khá bụi bặm. Từ chỗ gửi xe, đi bộ qua con đường thông rất “tình”, bạn sẽ tới hồ Suối Vàng. Bạn tiếp tục đi cano qua phía bên kia bờ, đó là nơi có cây thông cô đơn, lẻ bóng giữa bãi cỏ hồng. Đến hồ Suối Vàng vào mùa cỏ hồng tháng 11, bạn có thể chiêm ngưỡng vẻ đẹp rực rỡ hơn nữa.\n" +
                "\n" +
                "Điều khiến tôi gặp khó khăn nhiều nhất trong chuyến đi lần này là tìm đường đến đồi Ngô Quyền, ngọn đồi chuyên chụp ảnh Đà Lạt khi lên đèn với view toàn cảnh thành phố từ trên cao. Tôi mất 2 buổi tối để tìm đường đến đồi, lạc từ hẻm này tới ngõ khác và khi tìm đến nơi, tôi chỉ muốn ngồi ngắm thành phố và tận hưởng phút giây đó mãi.\n" +
                "Theo chân người bạn mới quen ở Đà Lạt, tôi ghé thăm nhiều điểm nổi tiếng và góc lạ của “tiểu Paris giữa núi rừng Tây Nguyên” như phim trường Lavender, phân viện sinh học, quảng trường Lâm Viên, Trại Mát, các tiệm cà phê và homestay có khung cảnh nên thơ… và không quên nháy vài “pô ảnh” tại góc “Hồng Kông bên hông chợ Đà Lạt” nổi tiếng.\n" +
                "Với tôi, Đà Lạt tháng 10 thật tuyệt đẹp! Tôi gom nhặt từng chút mộng mơ của thành phố chìm trong sương phủ, cất giữ vẹn nguyên những rung cảm chan chứa trong mấy ngày phiêu du nơi đây và hẹn sẽ sớm ngày trở lại.\n";
        int igbaiviet13 = R.drawable.baiviet31;
        int igbaiviet23 = R.drawable.baiviet32;
        int igbaiviet33 = R.drawable.baiviet33;

        ArrayList<String> bviet4 = new ArrayList<>();
        String baiviet4 ="Cảnh thực đẹp như xứ cổ tích ở vùng ngoại ô Đà Lạt";
        String ngaydang4 =" 29/01/2021";
        String nguoidang4 ="Biên soạn: Trung Nam";
        String baiviet14 ="Tiên cảnh giữa đời thường\n" +
                "Sau những ngày đông, đường phố Đà Lạt rợp một sắc hồng nhẹ nhàng. Đó là đặc trưng của mai anh đào, loài hoa đã trở thành một nét chấm phá khiến bao du khách mê mẩn khi tới Đà Lạt. Nhiều người vẫn nhầm mai anh đào với hoa đào vì màu sắc có phần khá giống nhau và cũng thường nở dịp cận Tết Nguyên đán. Sắc hồng của mai anh đào dường như sinh ra để dành cho màu trời xanh lơ và những đám mây trắng thơ thẩn của Đà Lạt. \n" +
                "\n" +
                "Ở trung tâm thành phố, bạn sẽ khó cảm nhận vì những tòa nhà, khách sạn đang mọc lên từng ngày. Tuy nhiên, nếu chịu khó chạy xe ra vùng ngoại ô, bạn sẽ thấy trước mắt mình là cả một thế giới cổ tích. Những căn nhà nhỏ lợp mái tôn nằm bơ vơ một cõi, được phủ dưới tán cây mai anh đào bung sắc. Hoa cỏ dại mọc ven đường rung rinh trong ánh nắng se se lạnh đặc trưng. Tất cả tạo nên một bức tranh hoàn hảo về màu sắc tưởng chừng chỉ xuất hiện dưới nét vẽ của người họa sĩ đại tài.";
        String baiviet24 ="Cảnh thực như mơ\n" +
                "Vài năm trước, khi du lịch Đà Lạt vẫn chỉ quẩn quanh ở những địa điểm như hồ Tuyền Lâm, thung lũng tình yêu... nhiều người vẫn nghĩ về thành phố này là một nơi ảm đạm, chỉ hợp cho dưỡng già. Tuy nhiên, tiềm năng khai thác du lịch của Đà Lạt rõ ràng còn nhiều hơn thế. Khí hậu trong lành, người dân hiền hòa và những nét xưa cũ của Đà Lạt dần kéo du khách đến đông hơn. \n" +
                "\n" +
                "Nếu đến thành phố này vào những ngày cuối tuần, bạn có lẽ sẽ phải chịu cảnh tắc đường nhốn nháo ở khu trung tâm. Những khách sạn, homestay được thiết kế tỉ mẩn mọc lên như nấm sau mưa để đáp ứng nhu cầu ngày một cao của du khách. Nhưng sống trong thời hiện đại, nhiều người lại có nhu cầu tìm về những giá trị xưa cũ. \n" +
                "\n" +
                "Khung cảnh yên bình vùng ngoại ô Đà Lạt đem đến cảm giác như đang xem bộ phim chiếu rạp với gam màu xưa cũ, cảnh sắc bình yên còn thời gian thì ngưng đọng. Nếu không thích cái xô bồ của khu trung tâm, bạn có thể tìm đến các xã như Đạ Nhim, Long Lanh ở huyện Lạc Dương (Lâm Đồng), chỉ cách Đà Lạt khoảng 40 km đi về phía Nha Trang. \n" +
                "\n" +
                "Ở nơi mà du lịch hóa còn chưa thể với tới, cuộc sống nhẹ nhàng cứ từng ngày trôi qua. Cảnh sắc hữu tình với hoa cỏ, ánh nắng cùng những ngôi nhà nhỏ đủ khiến trái tim khô cứng cũng phải rung động vì cái đẹp \"thực mà như mơ\".";
        int igbaiviet14 = R.drawable.baiviet41;
        int igbaiviet24 = R.drawable.baiviet42;
        int igbaiviet34 = R.drawable.baiviet43;

        ArrayList<String> bviet5 = new ArrayList<>();
        String baiviet5 ="Hoa ban nhuộm trắng những góc phố Đà Lạt ngày cận Tết Nguyên đán";
        String ngaydang5 =" 29/05/2021";
        String nguoidang5 ="Biên soạn: Danh Tuấn";
        String baiviet15 ="Những ngày này, hoa ban đã nở rộ trắng xóa trên một số tuyến đường của Đà Lạt, hòa cùng không khí Tết khiến cho người dân địa phương lẫn du khách phấn khích.\n" +
                "\n" +
                "Vào độ tháng 1 – 2 dương lịch (Tến Nguyên đán), những con đường hoa ban trắng lại nở rộ tại Đà Lạt. Vốn được xem là biểu tượng của mùa xuân Tây Bắc nhưng về đến Đà Lạt, hoa ban góp phần tô điểm thêm cho vẻ đẹp dịu dàng, lãng mạn của thành phố hoa.\n" +
                "\n" +
                "Hoa ban là cây thân gỗ, cao khoảng 10 - 12m và thường rụng lá trong mùa đông. Đến khi hoa nở trong tiết xuân, cây gần như không còn lá khiến màu trắng của những cánh hoa càng được tôn lên, tương phản màu sắc với các cành, nhánh khẳng khiu.\n";
        String baiviet25 ="Hoa có mùi thơm nhẹ nhàng phảng phất trong gió, tô điểm cho khung cảnh lãng mạn những ngày giao mùa của thành phố hoa.\n" +
                "\n" +
                "Ở Đà Lạt những mùa hoa thường luân phiên nhau, cũng nhờ thế mà thành phố này luôn có điểm riêng đặc biệt thu hút du khách. Khi sắc hồng của mai anh đào đã tạm khép lại, hoa ban lại khiến cho người dân địa phương lẫn khách du lịch đứng ngồi không yên bởi vẻ đẹp của nó. Trong truyền thuyết của dân tộc Thái, hoa ban tượng trưng cho tình yêu trong trắng, thủy chung.\n" +
                "\n" +
                "Hoa ban được trồng hơn 12 năm nay tại Đà Lạt, du khách có thể chọn tham quan các tuyến đường như Quang Trung, Hoàng Văn Thụ, Trần Phú, nhà ga Đà Lạt, ngã tư Phan Chu Trinh hay nhà thờ Con Gà... Nếu có dịp đến thăm Đà Lạt vào dịp Tết này, bạn có thể trải nghiệm một chút xuân Tây Bắc ngay tại Đà Lạt.\n";
        int igbaiviet15 = R.drawable.baiviet53;
        int igbaiviet25 = R.drawable.baiviet52;
        int igbaiviet35 = R.drawable.baiviet51;


        Bundle b1= new Bundle();
        b1.putStringArrayList("arraybaiviet",bviet1);
        b1.putString("baiviet",baiviet1);
        b1.putString("ngaydang",ngaydang1);
        b1.putString("nguoidang",nguoidang1);
        b1.putString("baiviet1",baiviet11);
        b1.putString("baiviet2",baiviet21);
        b1.putInt("igbaiviet1", igbaiviet11);
        b1.putInt("igbaiviet2", igbaiviet21);
        b1.putInt("igbaiviet3", igbaiviet31);

        Bundle b2= new Bundle();
        b2.putStringArrayList("arraybaiviet",bviet2);
        b2.putString("baiviet",baiviet2);
        b2.putString("nguoidang",nguoidang2);
        b2.putString("baiviet1",baiviet12);
        b2.putString("baiviet2",baiviet22);
        b2.putInt("igbaiviet1", igbaiviet12);
        b2.putInt("igbaiviet2", igbaiviet22);
        b2.putInt("igbaiviet3", igbaiviet32);
        b2.putString("ngaydang",ngaydang2);

        Bundle b3= new Bundle();
        b3.putStringArrayList("arraybaiviet",bviet3);
        b3.putString("baiviet",baiviet3);
        b3.putString("nguoidang",nguoidang3);
        b3.putString("baiviet1",baiviet13);
        b3.putString("baiviet2",baiviet23);
        b3.putInt("igbaiviet1", igbaiviet13);
        b3.putInt("igbaiviet2", igbaiviet23);
        b3.putInt("igbaiviet3", igbaiviet33);
        b3.putString("ngaydang",ngaydang3);

        Bundle b4= new Bundle();
        b4.putStringArrayList("arraybaiviet",bviet1);
        b4.putString("baiviet",baiviet4);
        b4.putString("nguoidang",nguoidang4);
        b4.putString("baiviet1",baiviet14);
        b4.putString("baiviet2",baiviet24);
        b4.putInt("igbaiviet1", igbaiviet14);
        b4.putInt("igbaiviet2", igbaiviet24);
        b4.putInt("igbaiviet3", igbaiviet34);
        b4.putString("ngaydang",ngaydang4);

        Bundle b5= new Bundle();
        b5.putStringArrayList("arraybaiviet",bviet1);
        b5.putString("baiviet",baiviet5);
        b5.putString("nguoidang",nguoidang5);
        b5.putString("baiviet1",baiviet15);
        b5.putString("baiviet2",baiviet25);
        b5.putInt("igbaiviet1", igbaiviet15);
        b5.putInt("igbaiviet2", igbaiviet25);
        b5.putInt("igbaiviet3", igbaiviet35);
        b5.putString("ngaydang",ngaydang5);
        ArrayList<Bundle> bundleArrayList = new ArrayList<>();
        bundleArrayList.add(b1);
        bundleArrayList.add(b2);
        bundleArrayList.add(b3);
        bundleArrayList.add(b4);
        bundleArrayList.add(b5);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(BaiVietFragment.this.getActivity(), Noidung_Baiviet.class);
                intent.putExtras(bundleArrayList.get(position));

                startActivity(intent);
            }

        });
        return view;
        



      
    }
}