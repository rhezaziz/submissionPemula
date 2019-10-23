package com.example.rheza.karnivora;

import java.util.ArrayList;
import java.util.List;

public class karnivoraData {
    private static String [] namaHewan = {
            "Harimau",
            "Singa",
            "Beruang Madu",
            "Macan Dahan",
            "Serigala",
            "Cheetah",
            "Macan Tutul",
            "Burung Elang",
            "Ikan Hiu",
            "Komodo"
    };

    private static String [] detailHewan = {
            "Hutan dataran rendah sampai hutan pegunungan",
            "Hutan terbuka, semak belukar, dan padang rumput",
            "Daerah hujan tropis Asia Tenggara",
            "Hutan dataran rendah dan pegunungan",
            "Hutan terbuka, sabana dan tanah rawa",
            "Daerah yang kering dan padang rumput terbuka",
            "hutan tropis, gurun, savanah, pegunungan dan daerah pemukiman",
            "hutan dengan area pegunungan, perbukitan dan dataran tinggi dan bahkan dapat hidup hingga ketinggian 3.000 M.dpl",
            "Laut",
            "Pulau Komodo"

    };
    private static int [] gambarHewan = {
            R.drawable.harimau,
            R.drawable.singa,
            R.drawable.beruang_madu,
            R.drawable.macan_dahan,
            R.drawable.serigala,
            R.drawable.citah,
            R.drawable.macan_tutul,
            R.drawable.elang,
            R.drawable.hiu,
            R.drawable.komodo

    };
    private static String [] deskripsiHewan = {
            "   Harimau tergolong dalam hewan mamalia yang memiliki tulang belakang dan berdarah panas. Harimau adalah spesies kucing terbesar dari jenisnya, bahkan melebihi ukuran singa. Selain itu harimau juga termasuk kucing tercepat setelah saudaranya, cheetah.",
            "   Singa adalah salah satu spesies mamalia yang termasuk dalam keluarga felidae atau jenis kucing besar. Singa hidup dan berkembang biak dengan cara berkelompok, dengan satu jantan dan beberapa betina. Akan tetapi singa betina lebih produktif dalam berburu dan mencari mangsa.",
            "   Beruang madu termasuk hewan dari kelompok hewan ursidae yang merupakan hewan terkecil dari delapan jenis beruang yang ada di dunia. Beruang madu adalah hewan asli Bengkulu, sekaligus menjadi simbol daerah tersebut. Selain menjadi simbol daerah Bengkulu hewan ini juga menjadi maskot Kota Balikpapan.",
            "   Macan dahan adalah sejenis kucing yang berukuran sedang, dengan panjang tubuh hanya 95 cm. Hewan ini memiliki bulu berwarna kelabu kecoklatan dengan motif seperti awan dan bintik hitam di tubuhnya. Mereka memiliki kaki yang pendek, tetapi macam ini memiliki telapak kaki yang besar dan ekor yang panjang.",
            "   Serigala merupakan salah satu hewan yang termasuk dalam keluarga hewan mamalia sekaligus hewan karrnivora. Hewan ini salah satu jenis hewan karnivora yang memiliki tubuh yang cenderung kecil. Pada umumnya serigala memiliki bentuk dan ukuran tubuh sama seperti anjing.",
            "   Cheetah adalah salah satu hewan yang termasuk golongan kucing besar, selain itu citah juga termasuk hewan mamalia. Hewan ini berburu dengan menggunakan kecepatannya, tidak dengan mengitai atau secara bergerombol. Karena hewan ini adalah hewan tercepat dalam keluarga kucing besar.",
            "   Macan tutul adalah salah satu dari empat hewan yang termasuk dalam golongan kucing besar. Pada umumnya hewan ini memiliki ukuran besar, seperti singa atau pun harimau. Hewan ini memiliki bulu berwarna kuning dengan bintik-bintik berwarna hitam di sekujur tubuhnya.",
            "   Elang adalah satu satu hewan yang hidup dan berkembang biak di suluruh Indonesia. Elang adalah spesies burung pemangsa yang berasal dari suku accipitridae dari genus Aquila. Selain itu burung elang tujuan termasuk dalam kelompok hewan yang berdarah panas, dan hewan ovipar.",
            "   Ikan hiu adalah sekelompok ikan yang mempunyai kerangka tulang lengkap dan mempunyai bentuk tubuh ramping. Binatang ini bernafas dengan mengunakan lima liang insang bahkan kadang-kadang dengan enam sampai tujuh insang. Hal itu tergantung pada jenis spesies hiu tersebut.",
            "   Komodo adalah spesies kadal dan merupakan jenis kadal terbesar yang ada di dunia. Yang hidup di pulau komodo, komodo dewasa memiliki ukuran tubuh mencapai 2-3 meter. Karena memiliki ukuran tubuh yang besar mereka mampu memangsa hewan mamalia atau reptile lainnya."
    };
    static List<karnivora> getListData(){
        karnivora karni = null;
        List<karnivora> list = new ArrayList<>();
        for(int position = 0 ; position < namaHewan.length; position++ ){
            karni = new karnivora();
            karni.setNama(namaHewan[position]);
            karni.setDetail(detailHewan[position]);
            karni.setGambar(gambarHewan[position]);
            karni.setDeskirpsi(deskripsiHewan[position]);
            list.add(karni);
        }
        return list;
    }

}
