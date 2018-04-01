package com.example.egi_fcb.asmaulhusna.activity;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;
import com.example.egi_fcb.asmaulhusna.activity.ActivityAsmaulHusna;
import com.example.egi_fcb.asmaulhusna.R;

public class ActivityAsmaulHusnaDetail extends AppCompatActivity {
    TextView ayat,arti;
    JustifiedTextView infolengkap, keterangan, meneladani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmaul_husna_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collab);
        collapsingToolbar.setExpandedTitleGravity(Gravity.BOTTOM);

        ayat = (TextView) findViewById(R.id.tv_ayat);
        arti = (TextView) findViewById(R.id.tv_arti);
        infolengkap = (JustifiedTextView) findViewById(R.id.infolengkap);
        keterangan = (JustifiedTextView) findViewById(R.id.keterangan);
        meneladani = (JustifiedTextView) findViewById(R.id.meneladani);

        Intent mIntent = getIntent();
        int position = mIntent.getIntExtra("position", 0);
        String ayat1 = mIntent.getStringExtra("ayat");
        String bacaan = mIntent.getStringExtra("bacaan");
        String arti1 = mIntent.getStringExtra("arti");

        if (position == 0) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 1) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah memiliki gelar Ar-Rahman, yang berarti Maha Pemurah (The Most Beneficent). " +
                    "Allah adalah Tuhan Yang Maha Pemurah kepada semua makhluk ciptaan-Nya, baik yang gaib maupun " +
                    "yang terlihat oleh mata kita.");

            keterangan.setText("Barang siapa membaca Ya Rahmaan sebanyak 100 kali tiap selesai mengerjakan sholat " +
                    "fardhu, maka dengan izin Allah akan hilanglah sifat lalai dan lupa dalam dirinya.");

            meneladani.setText("Allah memberikan rezeki kepada makhluk-makhluk-Nya tanpa pilih kasih. " +
                    "Kita juga bisa meneladani sifat Ar Rahman tersebut dengan cara berbuat baik kepada teman, " +
                    "tidak menyiksa hewan dan lain sebagainya.\n" +
                    "\n" +
                    "Dengan meneladani sifat Ar-Rahman tersebut maka kita bisa menjadi pribadi yang suka menolong sesama.");
        } else if (position == 2) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Ar-Rahim (The Most Merciful), yaitu Allah Maha Penyayang. " +
                    "Allah sangat menyayangi hamba-hamba-Nya yang beriman, Allah juga senantiasa menolong " +
                    "orang-orang soleh, karena Allah sangat menyayangi mereka.");

            keterangan.setText("Barang siapa takut terjerumus kepada perbuatan yang tidak disukainya, maka " +
                    "hendaklah ia berdzikir dengan membaca Ya Rahmaan Ya Rahiim sebanyak 100 kali setiap " +
                    "selesai mengerjakan sholat fardhu. \n" +
                    "\n" +
                    "Barang siapa yang membaca Ya Rahiim sebanyak 100 kali setelah mengerjakan sholat subuh, " +
                    "niscaya dia akan mendapatkan kasih sayang dari semua makhluk dan terhindar dari " +
                    "semua bencana dan malapetaka.");

            meneladani.setText("Kita bisa meneladani sifat Ar-Rahim tersebut dengan cara mengasihi dan menyayangi " +
                    "keluarga, teman, tetangga-tetangga kita serta orang-orang yang dekat dengan kita. " +
                    "Jangan pernah ragu untuk menolong mereka, membantunya jika kesusahan dan tidak menyakiti hatinya dengan sengaja.\n" +
                    "\n" +
                    "Dan semoga kita juga termasuk dalam orang-orang yang disayangi oleh Allah SWT. Aamiin yaa Rabbal Alamiin.");
        } else if (position == 3) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Malik yang memiliki makna (The King) atau Yang Maha Merajai atau " +
                    "Raja dari segala raja. Allah adalah Raja penguasa alam semesta, Dialah yang memiliki " +
                    "kekuasaan di langit dan di bumi.");

            keterangan.setText("Barang siapa membaca ism ini dengan rutin tiap hari pada waktu matahari " +
                    "tergelincir sebanyak 100 kali niscaya hatinya akan menjadi bersih, dan lenyaplah segala kekotorannya.\n" +
                    "\n" +
                    "Barang siapa membacanya sesudah terbit fajar sebanyak 120 kali, maka Allah akan " +
                    "memberinya kekayaan dan karunia-Nya, baik dengan sebab – sebab maupun dengan pintu yang dibukakan Allah SWT atasnya.");

            meneladani.setText("Lalu bagaimana cara kita untuk meneladani sifat Al-Malik ini? " +
                    "caranya adalah cukup kita menjadi 'raja' bagi diri kita sendiri. Kita harus menjadi " +
                    "'raja' diri kita sendiri dan bisa mengendalikan hawa dan nafsu kita agar tidak " +
                    "dikuasai dan diperintah oleh hawa nafsu tersebut.\n" +
                    "\n" +
                    "Dengan menjadi 'raja' untuk diri kita sendiri, maka kita bisa rajin untuk beribadah " +
                    "dan menyembah raja yang sebenarnya, yakni Allah SWT, Raja dari segala raja.");

        } else if (position == 4) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Maha Suci (The Most Holy) dari hal-hal yang buruk. " +
                    "Sebagai manusia, kita tentu tidak memiliki hak untuk mengklaim bahwa diri kita " +
                    "adalah suci, karena kita semua tak lepas dari salah, khilaf dan dosa.");

            keterangan.setText("Jika seseorang yang memiliki hati yang bersih membaca yaa Qudduus sebanyak " +
                    "100 kali setiap hari, hatinya akan terbebas dari semua pikiran dan perhatian yang " +
                    "menimbulkan kesulitan, kekhawatiran, dan penderitaan bagi diri kita sendiri.");

            meneladani.setText("Namun untuk meneladani sifat Allah yang satu ini, kita memiliki banyak " +
                    "cara yakni salah satunya dengan cara menjaga diri dari prasangka buruk kepada siapapun. " +
                    "Jangan mengejek teman dan menyakiti hatinya, dan tetaplah berpikir positf.");
        } else if (position == 5) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah adalah Maha Pemberi Kedamaian bagi para makhluk-makhluk-Nya yang " +
                    "senantiasa berdoa dan memohon perlindungan kepada-Nya. Dengan memohon perlindungan " +
                    "kepada Allah SWT, maka Allah akan memberikan kedamaian kedalam hati kita dan membuat kita " +
                    "jauh dari rasa gundah dan gelisah.");

            keterangan.setText("Jika ism ini dibacakan sebanyak 136 kali dengan suara keras sekedar bisa " +
                    "didengar oleh si sakit, sambil mengangkat tangan diatas kepala si sakit, Insya Allah " +
                    "orang yang sakit itu akan sembuh dengan izin Allah SWT.\n" +
                    "\n" +
                    "Barang siapa yang membaca ism ini terus menerus, Allah akan melindunginya dari semua bencana dan bahaya.");

            meneladani.setText("Dengan menjaga kedamaian dan keselamatan antar sesama, maka kita telah meneladani sifat Allah yang satu ini. " +
                    "Contohnya adalah dengan tidak jahil dan usil kepada teman, mencegah terjadinya perkelahian dan sebagainya.");
        } else if (position == 6) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Mu'min, yaitu Yang Maha Pemberi Keamanan kepada semua " +
                    "makhluk-Nya. Ketika kita menghadapi sebuah urusan, serahkan saja semua itu kepada " +
                    "Allah, kita hanya perlu meyakini bahwa Allah pasti akan memberikan jalan yang terbaik untuk kita semua.");

            keterangan.setText("Barang siapa yang membaca Asma Allah ini sebanyak 630 kali pada saat mengalami ketakutan, " +
                    "Allah akan melindunginya dari semua bencana, kecelakaan dan kerugian.");

            meneladani.setText("Dengan menyerahkan segala urusan kepada Allah SWT, maka kita akan mendapatkan rasa aman " +
                    "yang tak terkira dan membuat diri kita menjadi merasa aman dan tentram.");
        } else if (position == 7) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Al-Muhaimin memiliki makna Yang Maha Memelihara, " +
                    "Allah adalah Yang Maha Memelihara kehidupan makhluk-makhluk-Nya. " +
                    "Misalnya adalah Allah yang mengatur terjadinya siang dan malam, panas dan hujan, dan sebagainya.");

            keterangan.setText("Barang siapa membaca Asma Allah ini sebanyak 100 sesudah mandi dan sholat dua " +
                    "rakaat ditempat yang sunyi dengan memusatkan perhatian kepada Allah SWT, niscaya Allah akan " +
                    "menyucikan lahir dan batinnya.\n" +
                    "\n" +
                    "Allah SWT juga akan memperlihatkan kepadanya hal yang ghaib jika Asma Allah ini dibaca sebanyak 115 kali.");

            meneladani.setText("Segala bentuk keseimbangan alam ini sudah diatur oleh Allah SWT " +
                    "dengan sedemikian rupa untuk memelihara makhluk-makhluk-Nya agar tetap hidup dengan aman dan tentram.");
        } else if (position == 8) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Aziz, yaitu Yang Maha Perkasa. Di alam semesta yang " +
                    "sangat luas ini, hanya Allah lah yang menguasainya. Sehingga tidak mungkin " +
                    "ada yang bisa untuk menandingi keperkasaan Allah atas segala ciptaan-Nya.");

            keterangan.setText("Barang siapa yang berdzikir dengan Asma Allah ini selama 40 hari, " +
                    "tiap harinya sebanyak 40 kali, niscaya Allah akan menolongnya dan memuliakannya, " +
                    "sehingga ia tidak lagi membutuhkan bantuan seorang makhluk pun.");

            meneladani.setText("Allah adalah Raja dari segala raja, Dialah penguasa alam " +
                    "semesta dan juga pemilik dari segala kemuliaan. Hanya Allah yang Maha Perkasa " +
                    "dan tidak ada yang setara dengan Dia.");
        } else if (position == 9) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Jabbar atau Maha Pemaksa, dengan begitu tidak ada satupun " +
                    "yang bisa untuk mengingkari bahkan menunda kehendak Allah SWT. Karena, " +
                    "kekuasaan Allah sangatlah besar dan mutlak.");

            keterangan.setText("Barang siapa dengan sungguh – sungguh beriman kepada kekuatan Allah yang " +
                    "tak terkalahkan itu dan mengharapkan kekuatan dapat membaca yaa Jabbaar sebanyak 21 " +
                    "kali di pagi dan sore hari, Insya Allah dia akan terhindar dari ancaman orang – orang yang zalim.\n" +
                    "\n" +
                    "Barang siapa yang membaca Asma Allah ini sebanyak 226 kali di setiap pagi dan sore hari, " +
                    "dia akan diselamatkan dari kezaliman penguasa dan orang – orang yang kejam, baik didarat " +
                    "maupun dilaut, di dalam perjalanan maupun di tempat kediaman.");

            meneladani.setText("Sehingga jika Allah sudah berkehendak, maka hal itu tidak mungkin bisa diingkari. " +
                    "Segala makhluk yang ada di langit dan di bumi ini semuanya tidak bisa mengingkari " +
                    "kehendak Allah SWT, sehingga kita semua harus tunduk dan patuh kepada-Nya.");
        } else if (position == 10) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu adalah pemilik dari segala keagungan, " +
                    "sehingga Dia disebut juga dengan Al-Mutakabbir. Segala kebesaran, " +
                    "kekuasaan dan segala keagungan yang ada di alam semesta ini adalah hanyalah milik Allah semata.");

            keterangan.setText("Jika seseorang membaca yaa Mutakabbir sebanyak 10 kali sebelum bersebadan dengan istrinya, " +
                    "niscaya mereka akan mendapatkan anak yang sholeh.");

            meneladani.setText("Keagungan dari para pemimpin terbaik di dunia ini tidak ada apa-apanya jika dibandingkan dengan " +
                    "keagungan Allah SWT, sang pemilik segala keagungan yang ada di dunia ini.");
        } else if (position == 11) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Al-Khaliq sendiri memiliki makna yaitu Sang Maha Pencipta. Allah adalah pencipta " +
                    "langit dan bumi, alam semesta beserta isinya. Kita semua ini adalah termasuk dalam ciptaan Allah SWT.");

            keterangan.setText("Jika Asma Allah ini dibaca ditengah malam dan memahami maknanya di dalam hatinya, " +
                    "niscaya Allah akan secara khusus akan menciptakan untuknya seorang malaikat yang akan mendoakannya " +
                    "hingga akhir zaman. Juga berguna untuk menerangi hati dan wajah.\n" +
                    "\n" +
                    "Siapa yang membaca Asma Allah ini sebanyak 100 kali selama 7 hari, ia akan dilindungi dari " +
                    "semua malapetaka, Insya Allah.");

            meneladani.setText("Allah juga yang menciptakan para malaikat, akhirat serta surga dan neraka. " +
                    "Sehingga Allah disebut sebagai Sang Khaliq, yaitu Maha Pencipta.");
        } else if (position == 12) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Bari, yaitu artinya adalah Allah adalah Maha Mengadakan. " +
                    "Allah telah menciptakan alam semesta ini beserta isinya yang semula berasal dari ketiadaan " +
                    "lalu diciptakannya alam semesta ini menjadi ada.");

            keterangan.setText("Jika Seorang wanita yang mandul berpuasa selama 7 hari dan setiap hari " +
                    "setelah berbuka dengan air kemudian membaca Yaa Baari’uu yaa Mushawwiru sebanyak " +
                    "21 kali, Allah SWT akan mengaruniakan kepadanya seorang anak lelaki, Insya Allah.\n" +
                    "\n" +
                    "Barang siapa membaca Asma Allah ini selama 7 hari berturut – turut sebanyak 100 " +
                    "kali maka ia akan selamat dari bencana.");

            meneladani.setText("Sehingga kita semua tahu bahwa Allah SWT adalah Al-Bari, yakni yang " +
                    "Maha Mengadakan. Semua yang ada di alam semesta ini tidaklah muncul dengan " +
                    "sendirinya, melainkan atas kuasa Allah SWT yang membuat, membentuk dan menciptakan ini semua.");
        } else if (position == 13) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Al-Mushawwir adalah salah satu sifat Allah yakni Maha Pembentuk. " +
                    "Dialah yang membentuk rupa makhluk-makhluk-Nya baik yang gaib maupun yang terlihat oleh mata manusia.");

            keterangan.setText("Jika seorang wanita yang tidak dapat memiliki anak dan percaya bahwa hanya Allah – " +
                    "lah Yang Maha Pencipta, kemudian dia berpuasa selama 7 hari dan setiap berbuka puasa membaca " +
                    "yaa Khaaliq yaa Baarii’ yaa Mushawwir sebanyak 21 kali diatas segelas air dan berbuka puasa dengan " +
                    "meminum air ini, Insya Allah dia akan memiliki anak.");

            meneladani.setText("Malaikat, jin, manusia, dan segala mahluk ciptaan Allah memiliki bentuk yang " +
                    "sedemikian rupa karena sudah menjadi kehendak Allah SWT. Dengan bentuk yang berbeda-beda " +
                    "ini sehingga kita bisa membedakan mana itu tumbuhan, hewan dan lain sebagainya.");
        } else if (position == 14) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Ghaffar, Al-Ghaffar sendiri memiliki makna yakni Maha Pengampun. " +
                    "Allah akan mengampuni hamba-hamba-Nya yang telah berbuat dosa jika mereka sudah bertaubat " +
                    "dengan sungguh-sungguh dan berjanji tidak akan mengulangi perbuatan tersebut.");

            keterangan.setText("Barang siapa yang membaca Asma Allah ini sebanyak 100 kali setelah sholat Jumat, " +
                    "maka segala dosa – dosanya akan diampuni pada minggu sebelumnya.");

            meneladani.setText("Kita bisa meneladani sifat Ghaffar ini dengan cara memaafkan kesalahan orang lain kepada kita. " +
                    "Jangan menaruh dendam, karena hal itu justru bisa membuat susah diri kita sendiri.");
        } else if (position == 15) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Qahhar, yang memiliki makna Maha Penakluk. Allah itu " +
                    "Maha Penakluk atau Maha Menaklukkan segalanya, termasuk alam semesta ini.");

            keterangan.setText("Jika seseorang yang memiliki niat ikhlas di dalam hatinya untuk " +
                    "membebaskan diri dari kekuasaan hawa nafsu dan dari hasrat duniawi itu " +
                    "mengingat dan membaca yaa Qahhaar sesering mungkin, niscaya dia akan dapat mengendalikan hawa nafsunya.\n" +
                    "\n" +
                    "Berkhasiat untuk menghilangkan rasa cinta berlebihan kepada dunia dan pengagungan " +
                    "selain kepada Allah SWT di dalam hati. Barang siapa membiasakan berdzikir dengan " +
                    "Asma Allah ini, maka ia akan mendapatkan hal itu dan akan menang atas seterunya.");

            meneladani.setText("Kita bisa meneladani sifat Al-Qahhar ini dengan cara belajar " +
                    "untuk menaklukkan hawa dan nafsu dalam kehidupan sehari-hari agar kita tidak dikendalikan oleh hawa nafsu tersebut.");
        } else if (position == 16) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Wahhab, artinya Maha Pemberi karunia kepada seluruh makhluk-Nya. " +
                    "Coba lihat tubuh kita, ada hidung, telinga, mata, kaki, tangan dan kaki serta yang lain sebagainya.");

            keterangan.setText("Orang yang ditimpa kemiskinan hendaknya selalu membaca Asma Allah ini atau " +
                    "menuliskannya untuk dikenakan sebagai ta’wiz. Atau membacanya sebanyak 40 kali dalam " +
                    "sujud terakhir dalam sholat Dhuha. Insya Allah, ia akan terbebas dari kemiskinan melalui " +
                    "jalan yang tidak disangka – sangka.\n" +
                    "\n" +
                    "Jika seseorang mempunyai hajat, khusus agar hajatnya terkabul, hendaknya melakukan " +
                    "sujud dihalaman rumah atau masjid kemudian membaca Asma Allah ini 100 kali, Insya Allah hajatnya akan terkabul.\n" +
                    "\n" +
                    "Jika seseorang ingin meningkatkan kehidupan material maupun spiritualnya, hendaklah ia " +
                    "sholat malam dua rakaat selama tiga atau tujuh hari berturut – turut, dengan memanjatkan tangan " +
                    "kepada Allah dan membaca yaa Wahhaab sebanyak 100 kali sebelum dia memohonkan kebutuhannya, niscaya Allah " +
                    "akan mengabulkan doanya.");

            meneladani.setText("Itu semua adalah karunia dari Allah SWT untuk kita semua sebagai bentuk " +
                    "kasih sayang Allah kepada para makhluk ciptaan-Nya.");
        } else if (position == 17) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Ar-Razzaq, yakni Yang Maha Pemberi Rezeki. Allah memberikan " +
                    "rezeki kepada makhluk-makhluk-Nya, kita tidak perlu takut untuk kekurangan atau kehilangan rezeki.");

            keterangan.setText("Jika seseorang benar – benar percaya bahwa rezeki kita berasal dari Allah " +
                    "dan bahwa rumah tangganya membutuhkan rezeki tersebut, maka setiap selesai melaksanakan " +
                    "sholat subuh dia dapat membaca yaa Razzaaq sebanyak 10 kali di keempat sudut rumahnya, " +
                    "dimulai dari sudut kanan dan menghadap kiblat. Allah akan menambahkan rezeki keluarganya.\n" +
                    "\n" +
                    "Orang yang menuliskan Asma Allah ini dan menggantungkannya ditempat mereka bekerja. " +
                    "Insya Allah akan bertambah sukses.\n" +
                    "\n" +
                    "Membaca yaa Razzaaq sebanyak 100 kali setelah sholat jumat akan membantu orang yang mengalami stres dan depresi.");

            meneladani.setText("Yakinlah jika semua ini adalah milik Allah SWT, dan Allah itu adalah Ar-Razzaq, " +
                    "Sang Pemberi Rezeki. Untuk itu, kita juga harus bisa berbagi rezeki yang kita miliki dengan " +
                    "sesama agar kita bisa meneladani sifat Ar-Razzaq yang dimiliki Allah SWT.");
        } else if (position == 18) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Fattah, maksudnya adalah Allah Maha Pembuka Pintu Rahmat " +
                    "bagi hamba-hamba-Nya yang beriman dan percaya kepada-Nya. Saat kita menghadapi " +
                    "masalah, berdoalah hanya kepada Allah SWT.");

            keterangan.setText("Barang siapa yang meletakkan tangan kanannya didada setelah sholat " +
                    "subuh dan membaca Asma Allah ini sebanyak 70 kali, Insya Allah hatinya akan bersih " +
                    "dari khayalan, kejahatan, egoisme, amarah dan kekotoran yang lainnya. Menerangi jiwanya dan memudahkan urusannya.");

            meneladani.setText("Karena Dialah yang akan memberikan rahmat kepada kita semua dan " +
                    "memberikan jalan keluar terbaik untuk mengatasi masalah tersebut.");
        } else if (position == 19) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Apa sih di dunia ini yang tidak diketahui oleh Allah? Hal itulah yang" +
                    " membuat Allah disebut sebagai Al-Alim, yang memiliki makna sebagai Yang Maha Mengetahui.");

            keterangan.setText("Barang siapa membaca Asma Allah ini sebanyak 100 kali secara rutin setiap " +
                    "selesai sholat fardhu, maka ia akan memperoleh kemampuan untuk melihat hal – hal tertentu " +
                    "yang luput dari perhatian orang dan memiliki iman yang kuat. Di samping itu, hatinya akan " +
                    "dipenuhi dengan ma’rifatullahi (mengenal Allah).\n" +
                    "\n" +
                    "Jika seseorang melazinkan membaca Asma Allah ini sebanyak 150 kali setiap hati, " +
                    "niscaya pemikiran dan pemahamannya akan bertambah.");

            meneladani.setText("Allah mengetahui segalanya, baik yang terlihat maupun yang tidak terlihat. " +
                    "Ilmu Allah itu tidak terbatas, sedangkan manusia hanya memiliki pengetahuan yang sangat sedikit.");
        } else if (position == 20) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Yang Maha Menyempitkan, itulah Al-Qabidh. Maksudnya, Allah itu bisa " +
                    "menyempitkan atau menahan sesuatu sesuai dengan kehendak-Nya.");

            keterangan.setText("Yaa Qaabidh adalah dzikir malaikat maut, Izrail. Barang siapa dizalimi " +
                    "disarankan membaca yaa Qaabidh sebanyak 903 kali, maka si zalim maupun kezaliman itu " +
                    "akhirnya akan hancur atau orang itu dilindungi dari keduanya.\n" +
                    "\n" +
                    "Barang siapa menuliskan ism Al-Qaabidh pada empat puluh keping roti selama 40 hari, " +
                    "maka ia tidak akan merasakan sakitnya penyakit dan diselamatkan dari lapar, haus, luka dan sebagainya.");

            meneladani.setText("Allah bisa menyempitkan rezeki seseorang sesuai dengan kehendak-Nya, bisa meluaskan rezeki " +
                    "seseorang sesuai dengan kehendak-Nya. Untuk itu, kita harus senantiasa bersyukur " +
                    "atas rezeki yang telah Allah berikan kepada kita semua.");
        } else if (position == 21) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Selain memiliki sifat Al-Qabudh, Allah juga memiliki sifat Al-Basith. " +
                    "Artinya adalah Allah itu Maha Melapangkan. Allah bisa melapangkan apapun bagi siapa saja yang Allah kehendaki.");

            keterangan.setText("Yaa Baasith adalah dzikir malaikat peniup sangkakala, Israfil. Barang " +
                    "siapa terbiasa membaca Asma Allah ini niscaya ia akan beroleh kedamaian di dalam hatinya, " +
                    "terbebas dari stress dan berbagai persoalan, penghasilannya bertambah, dicintai dan dihargai dan" +
                    " dapat memberikan kebahagiaan kepada orang lain.");

            meneladani.setText("Allah bisa melapangkan rezeki bagi siapa saja yang Allah kehendaki, " +
                    "dan bisa menyempitkannya sesuai yang Allah kehendaki pula");
        } else if (position == 22) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Khafidh, maksudnya adalah Allah Maha Merendahkan " +
                    "siapapun yang dikehendaki-Nya sesuai dengan kebijaksanaan-Nya.");

            keterangan.setText("Barang siapa membaca yaa Khaafidh sebanyak 500 kali, maka semua hajatnya " +
                    "akan dipenuhi Allah dan menghilangkan semua kesulitannya, Insya Allah.\n" +
                    "\n" +
                    "Orang yang berpuasa selama tiga hari dan pada hari yang keempat membaca Asma Allah " +
                    "ini 70 kali ketika duduk menyendiri, ia akan memperoleh kemenangan atas musuhnya, Insya Allah.\n" +
                    "\n" +
                    "Barang siapa yang membaca Asma Allah ini sebanyak 889 kali pada waktu yang tepat, " +
                    "niscaya dia tidak akan dikalahkan oleh semua musuhnya.\n" +
                    "\n" +
                    "Jika sebuah kelompok yang diancam oleh musuh berpuasa selama tiga hari dan pada hari " +
                    "keempat mereka berkumpul untuk membaca yaa Khaafidh sebanyak 7.000 kali yang dibagi sesuai " +
                    "dengan jumlah mereka, maka Allah akan menjaga mereka serta merendahkan musuh mereka.");

            meneladani.setText("Misalnya, Allah bisa merendahkan orang-orang kafir yang ingkar" +
                    " kepadanya dengan menurunkan azab dunia kepada mereka berupa bencana, wabah penyakit, dan lain sebagainya.");
        } else if (position == 23) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Maksudnya adalah Allah itu yang Maha Meninggikan, Allah bisa meninggikan " +
                    "derajat siapa saja yang Allah kehendaki sesuai dengan kebijaksanaan-Nya.");

            keterangan.setText("Jika orang yang berkeinginan untuk menjadi tinggi di kalangan manusia, " +
                    "hanya untuk menolong dan membimbing mereka ke jalan yang benar, membaca yaa Raafi’ " +
                    "100 kali siang dan malam, niscaya kedudukan yang tinggi dan kekuatan akan diperolehnya.\n" +
                    "\n" +
                    "Barang siapa membaca Yaa Raafi’ sebanyak 70 kali, niscaya ia akan selamat dari " +
                    "gangguan orang – orang yang aniaya.\n" +
                    "\n" +
                    "Orang yang membaca Asma Allah ini 100 kali di tengah malam pada tanggal ke -14 " +
                    "bulan Qamariyah, Allah SWT akan mengaruniakan kecukupan kepadanya dan tidak berhajat kepada makhluk, Insya Allah.");

            meneladani.setText("Misalnya, Allah akan meninggikan derajat orang-orang yang beriman dan bertakwa kepada-Nya.");
        } else if (position == 24) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Mu'izz yaitu yang Maha Memuliakan makhluk-Nya. " +
                    "Dia bisa memuliakan siapa saja yang Dia kehendaki sesuai dengan kebijaksanaan-Nya.");

            keterangan.setText("Jika seseorang yang merasa kaya tanpa berharta, yang menjadi kuat tanpa " +
                    "senjata dan otot dan mampu mengesampingkan egonya dalam usahanya untuk membantu orang " +
                    "lain, harus berhadapan dengan musuh yang kuat dan teraniaya, maka dia dapat membaca " +
                    "Yaa Mu’izzu sesudah sholat malam pada hari minggu dan kamis. Dia akan terhindar dari " +
                    "rasa takut dan terlihat perkasa di mata musuh – musuhnya.\n" +
                    "\n" +
                    "Jika Asma Allah ini dibaca 40 kali setelah sholat maghrib setiap Senin dan Jumat, " +
                    "Allah SWT akan mengaruniakan kepada orang yang membacanya kemuliaan dan kehormatan, " +
                    "dan Allah akan menanamkan rasa takut ke dalam hati seluruh makhluk kepadanya, Insya Allah.");

            meneladani.setText("Hanya Allah-lah yang bisa melakukan hal-hal yang demikian. " +
                    "Sebab, hanya Dia sumber segala kemuliaan itu semua.");
        } else if (position == 25) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Mudzil, yaitu Allah adalah Yang Maha Menghinakan. " +
                    "Allah bisa menghinakan siapa saja yang Dia kehendaki.");

            keterangan.setText("Barang siapa membaca ism Yaa Mudzillu sebanyak 75 kali kemudian ia berdoa " +
                    "didalam sujudnya dan berkata, “Ya Allah, lindungilah aku " +
                    "dari kejahatan si Fulan”, niscaya ia akan bebas dari dalam penjaranya dan akan " +
                    "selamat dari gangguan orang – orang yang dengki dan aniaya.");

            meneladani.setText("Misalnya, Allah bisa saja menghinakan orang-orang jahat yang sering " +
                    "merugikan orang lain dengan cara memberikannya kemalangan dan lain sebagainya");
        } else if (position == 26) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu As-Sami', yaitu artinya Allah itu Maha Mendengar. " +
                    "Allah Maha Mendengar segala sesuatu, meskipun itu hanyalah sebuah niat dan hanya " +
                    "kita ucapkan di dalam hati.");

            keterangan.setText("Barang siapa membaca Yaa Samii’ pada hari kamis sesudah sholat Dhuha " +
                    "sebanyak 50 kali atau 500 kali, maka ia akan menjadi seorang yang makbul doanya.\n" +
                    "\n" +
                    "Jika seseorang membaca Asma Allah ini sebanyak 100 kali pada hari kamis antara " +
                    "sholat sunnah dan sholat fardhu pada saat subuh, maka Allah SWT akan mengaruniakan " +
                    "rahmat istimewa kepadanya, Insya Allah.");

            meneladani.setText("Untuk itu, kita harus menjauhkan diri dari segala prasangka-prasangka dan niat " +
                    "buruk, karena Allah pasti mendengar segala sesuatu yang kita ucapkan baik hanya dalam hati.");
        } else if (position == 27) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Bashir, artinya adalah Allah itu Maha Melihat segala " +
                    "sesuatu. Kita sebagai manusia hanya memiliki penglihatan yang terbatas.");

            keterangan.setText("Orang yang membaca Yaa Bashiir sebanyak 100 kali setelah sholat jumat " +
                    "secara istiqamah, Allah WT akan mengaruniakan kepadanya penglihatan (mata) yang " +
                    "tajam dan cahaya dalam hatinya. Insya Allah.\n" +
                    "\n" +
                    "Jika suatu pekerjaan tidak diniatkan untuk diri sendiri melainkan karena Allah, " +
                    "kemudian orang tersebut membaca yaa Allaah yaa Bashiir sebanyak 100 kali sebelum " +
                    "sholat jumat, niscaya Allah akan menggembirakan orang itu dengan kasih sayang-Nya " +
                    "dan memberikannya keberhasilan dalam pekerjaan yang diniatkannya itu.");

            meneladani.setText("Namun Allah bisa melihat segala sesuatu baik dimasa lalu, masa sekarang " +
                    "dan masa yang akan datang. Allah selalu mengawasi kita semua, sehingga jangan pernah " +
                    "kita berfikir jika kita melakukan kejahatan yang tidak orang lain lihat maka tidak ada " +
                    "yang bisa mengetahui kejahatan itu. Karena Allah itu Maha Melihat.");
        } else if (position == 28) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Hakam, maksudnya adalah Allah yang menetapkan hukum. " +
                    "Hukum di dunia dan di akhirat sudah Allah tetapkan");

            keterangan.setText("Barang siapa berdzikir dengan Asma Allah ini sebanyak 99 kali pada akhir " +
                    "malam dalam keadaan wudhu dan mengkonsenterasikan pikiran maka Allah akan menjadikan " +
                    "batinnya sebagai tempat rahasia – rahasia ketuhanan dan hatinya akan dipenuhi dengan cahaya.");

            meneladani.setText("Sebagaimana Allah telah menetapkan mana yang halal dan haram bagi " +
                    "manusia sebagai petunjuk bagi manusia dalam menjalani kehidupan.");
        } else if (position == 29) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Adl, artinya adalah Allah itu Maha Adil kepada seluruh " +
                    "makhluk-makhluk-Nya. Keadilan Allah bersifat sempurna dan berlaku untuk semua ciptaan-Nya.");

            keterangan.setText("Barang siapa menulis (dengan za’faran atau dengan isyarat jari) Asma Allah " +
                    "ini di atas 20 potong roti pada malam atau siang hari jumat, kemudian memakannya, " +
                    "maka Allah SWT akan menjadikan seluruh makhluk tunduk kepadanya, Insya Allah.");

            meneladani.setText("Oleh karena itu, jika kita mendapatkan perlakuan yang tidak adil dari " +
                    "manusia, maka berdoalah kepada Allah yang Maha Adil untuk meminta keadilan tersebut.");
        } else if (position == 30) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Lathif, maksudnya adalah Allah itu Maha Lembut kepada " +
                    "siapapun yang dikehendaki-Nya. Dia memberikan anugerah kepada manusia dengan " +
                    "cara yang lembut dan halus sehingga kadang sering kali tidak disadari oleh mereka yang menerimanya.");

            keterangan.setText("Barang siapa yang membaca Asma Allah ini sebanyak 133 kali setiap hari, " +
                    "Allah SWT akan mengaruniakan kepadanya rezeki yang berlimpah.\n" +
                    "\n" +
                    "Siapa saja yang ditimpa kesulitan hendaknya berwudhu dengan benar kemudian mengerjakan " +
                    "sholat sunat dua rakaat, kemudian sambil meniatkan maksudnya dan membaca Asma Allah ini 100 kali, " +
                    "maka Allah SWT akan memberikan jalan keluar dari kesulitannya itu, Insya Allah.\n" +
                    "\n" +
                    "Membaca Yaa Lathiif sebanyak 129 kali akan menolong orang yang mengalami depresi dan stres.");

            meneladani.setText("Untuk meneladani sifat Allah yang Maha Lembut ini, kita bisa melakukannya " +
                    "dengan cara bersikap lembut kepada siapapun terutama kepada orangtua dan saudara-saudara kita.");
        } else if (position == 31) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Khabir, artinya adalah Allah itu Maha Mengetahui segala " +
                    "sesuatu. Bahkan Dia bisa mengetahui segala sesuatu yang kita sembunyikan dari-Nya.");

            keterangan.setText("Barang siapa berdzikir dengan Asma Allah ini selama 7 hari maka akan datang " +
                    "kepadanya ruhaniah (sebangsa malaikat) yang akan memberitahukan kepadanya berita – " +
                    "berita tentang kejadian yang berlansung pada tahun itu, atau berita tentang raja – raja " +
                    "atau berita tentang hati dan lain – lain.");

            meneladani.setText("Kita tidak bisa menyembunyikan atau merahasiakan apapun dari Allah. " +
                    "Di alam semesta ini tidak ada yang luput dari pengetahuan Allah SWT.");
        } else if (position == 32) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Halim, yang bermakna Sang Maha Penyantun. Allah adalah " +
                    "Maha Penyantun kepada semua makhluk-Nya. Termasuk kepada orang-orang yang tidak percaya kepada-Nya.");

            keterangan.setText("Jika seseorang yang pemarah membaca yaa Haliim sebanyak 88 kali pada " +
                    "saat amarahnya nyaris memuncak, niscaya marahnya akan reda.");

            meneladani.setText("Sejatinya, Allah tidak langsung memberikan azab kepada orang-orang yang " +
                    "ingkar kepada-Nya. Namun biasanya Allah akan memberikan kesempatan kepada mereka" +
                    " untuk bertaubat dan memperbaiki kesalahannya.");
        } else if (position == 33) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Azhim, artinya adalah Allah itu adalah Yang Maha Agung. " +
                    "Bahkan keagungan Allah ini sungguh tidak terkira.");

            keterangan.setText("Barang siapa berdzikir dengan Asma Allah ini sebanyak 12 kali, " +
                    "niscaya ia akan selamat dari segala sesuatu.");

            meneladani.setText("Jika kita melihat alam semesta ini pasti kita akan sangat kagum dengan " +
                    "keagungan Allah ini. Bagaimana kita melihat langit seolah-olah tidak bertepi, " +
                    "bintang-bintang yang berhamburan di angkasa, serta begitu luasnya samudera yang bisa kita lihat.");
        } else if (position == 34) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Al-Ghafur itu artinya Yang Maha Pengampun. Ya, Allah itu Maha Pengampun. " +
                    "Allah akan mengampuni hamba-hamba-Nya yang mau bertaubat dan memperbaiki kesalahannya.");

            keterangan.setText("Jika Seseorang merasa berdosa dan oleh karenanya merasa berat di dalam hatinya, " +
                    "dengan membaca yaa Ghafuur sebanyak 100 kali setelah sholat jumat, penderitaannya akan hilang " +
                    "dan jika Allah menghendaki, Dia akan mengampuni dosa itu");

            meneladani.setText("Kita sebagai manusia harus percaya bahwa Allah itu Maha Pengampun, " +
                    "oleh karena itu kita harus senantiasa mengucapkan istighfar dan memohon ampunan kepada Allah SWT.");
        } else if (position == 35) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Asy-Syakur yang memiliki maknya Yang Maha Menghargai. " +
                    "Allah itu sangat menghargai amal perbuatan makhluk-makhluk-Nya.");

            keterangan.setText("Barang siapa membaca Asma Allah ini setiap hari sebanyak 41 kali untuk " +
                    "mengatasi masalah keuangan, jasmani, ruhani, pikiran dan sebagainya. Insya Allah masalah tersebut akan segera teratasi.");

            meneladani.setText("Allah akan membalas amal baik yang kita lakukan meskipun itu adalah " +
                    "amalan yang kecil dan sepele sekalipun. Karena dimata Allah segala perbuatan itu pantas untuk mendapatkan balasan.");
        } else if (position == 36) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Aliyy, apa itu Al-Aliyy? artinya yaitu Allah adalah Yang Maha Tinggi. " +
                    "Allah itu Maha Tinggi kedudukannya, sehingga tidak akan ada yang mampu menyamai atau melampaui-Nya.");

            keterangan.setText("Seseorang yang membaca Asma Allah ini setiap hari secara istiqamah dan membawa " +
                    "serta tulisan tersebut dalam badannya, maka derajatnya akan ditinggikan dan dikaruniai kemakmuran, " +
                    "dan semua hajatnya akan terpenuhi, Insya Allah.");

            meneladani.setText("");
        } else if (position == 37) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Kabir, artinya adalah Allah itu Maha Besar dan kebesaran-Nya sungguh tidak terkira.\n" +
                    "\n" +
                    "Allah tidak bergantung kepada apapun dan siapapun, justru semua itulah yang bergantung kepada Allah SWT sang Maha Kuasa.");

            keterangan.setText("Jika seseorang dipecat dari jabatannya, hendaknya ia berpuasa selama tujuh hari dan setiap " +
                    "hari membaca yaa kabiir anta al-ladzii laa tahdi ‘uquul li washfi ‘azamatih (“Wahai Yang Maha Besaar " +
                    "Yang tak dapat dilukiskan akal”) sebanyak 1.000 kali, maka jabatannya tersebut akan kembali kepadanya, " +
                    "disamping itu ia akan memperoleh kemuliaan dan kehormatan, Insya Allah.");

            meneladani.setText("");
        } else if (position == 38) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("Allah itu Al-Hafizh artinya yaitu Allah yang Maha Memelihara semua " +
                    "ciptaan-Nya. Siapakah yang memelihara alam semesta ini dari kerusakan dan kehancuran jika bukan Allah SWT?\n" +
                    "\n" +
                    "Allah lah Al-Hafizh, Yang Maha Memelihara.");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 39) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 40) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 41) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 42) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 43) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 44) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 45) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 46) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 47) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 48) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 49) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 50) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 51) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 52) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 53) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 54) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 55) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 56) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 57) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 58) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 59) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 60) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 61) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 62) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 63) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 64) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 65) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 66) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 67) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 68) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 69) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 70) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 71) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 72) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 73) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 74) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 75) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 76) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 77) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 78) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 79) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 80) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 81) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 82) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 83) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 84) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 85) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 86) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 87) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 88) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 89) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 90) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 91) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 92) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 93) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 94) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 95) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 96) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 97) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 98) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        } else if (position == 99) {
            collapsingToolbar.setTitle(bacaan);

            ayat.setText(ayat1);
            arti.setText(arti1);

            infolengkap.setText("");

            keterangan.setText("");

            meneladani.setText("");
        }
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), ActivityAsmaulHusna.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            Intent myIntent = new Intent(getApplicationContext(), ActivityAsmaulHusna.class);
            startActivityForResult(myIntent, 0);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
