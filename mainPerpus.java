package tugasPemlan2;

import java.util.Scanner;

public class mainPerpus {
        public static void main(String[] args) {
                perpustakaan buku = new perpustakaan("Judul Default", "Penulis Default", "Tahun pembuatan Default",
                                "Sinopsis Default");
                Scanner scn = new Scanner(System.in);
                boolean ulangi = true;

                System.out.println("\n------------------------------");
                System.out.println("\nPERPUSTAKAAN");
                System.out.println("\nSELAMAT DATANG DI PERPUSTAKAAN SI-C");
                System.out.println("---------------------------------");
                do {
                        System.out.println("Terdapat beberapa kategori buku di perpustakaan ini, yaitu:\n");
                        System.out.println("1. Filsafat");
                        System.out.println("2. Teknologi");
                        System.out.println("3. Agama");
                        System.out.println("4. Sejarah");
                        System.out.println("5. Psikologi");
                        System.out.println("6. Politik");
                        System.out.println("7. Fiksi\n");
                        System.out.print("Silahkan masukkan kode kategori buku yang ingin Anda cari: ");

                        int kode = scn.nextInt();
                        if (kode == 1) {
                                perpustakaan bukufilsafat1 = new perpustakaan("Meditations", "Marcus Aurelius",
                                                "121-180 AD",
                                                " Buku ini berisi pemikiran-pemikiran filsafat dari Marcus Aurelius. ");
                                perpustakaan bukufilsafat2 = new perpustakaan("Sophie's World", "Jostein Gaarder",
                                                "1991",
                                                " Sebuah novel filsafat yang mengajarkan sejarah filsafat kepada seorang gadis remaja.");
                                perpustakaan bukufilsafat3 = new perpustakaan("Thus Spoke Zarathustra",
                                                "Friedrich Nietzsche", "1883",
                                                " Karya utama Friedrich Nietzsche yang mengajukan gagasan tentang kehendak kuat dan superman.");
                                perpustakaan bukufilsafat4 = new perpustakaan("The Republic", "Plato", "c. 380 BC",
                                                " Dialog filosofis yang menggambarkan pembentukan negara ideal.");
                                perpustakaan bukufilsafat5 = new perpustakaan("Being and Time", "Martin Heidegger",
                                                "1927",
                                                " Karya utama Martin Heidegger yang membahas tentang eksistensi manusia.");

                                perpustakaan[] bukuArrayfilsafat = { bukufilsafat1, bukufilsafat2, bukufilsafat3,
                                                bukufilsafat4, bukufilsafat5 };
                                buku.displayBuku(bukuArrayfilsafat);
                        } else if (kode == 2) {
                                perpustakaan bukuteknologi1 = new perpustakaan(
                                                "The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution",
                                                "Walter Isaacson", "2014",
                                                " Buku ini menceritakan tentang sejarah awal perkembangan teknologi digital.");
                                perpustakaan bukuteknologi2 = new perpustakaan("Sapiens: A Brief History of Humankind",
                                                "Yuval Noah Harari", "2011",
                                                " Sebuah tinjauan sejarah manusia dari zaman prasejarah hingga masa kini.");
                                perpustakaan bukuteknologi3 = new perpustakaan(
                                                "Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future",
                                                "Ashlee Vance", "2015",
                                                " Biografi tentang kehidupan dan karya Elon Musk, pengusaha dan inovator terkemuka.");
                                perpustakaan bukuteknologi4 = new perpustakaan(
                                                "The Shallows: What the Internet Is Doing to Our Brains",
                                                "Nicholas Carr ", "2010",
                                                " Buku ini mengungkap dampak penggunaan internet terhadap otak manusia.");
                                perpustakaan bukuteknologi5 = new perpustakaan(
                                                "The Age of Surveillance Capitalism: The Fight for a Human Future at the New Frontier of Power",
                                                "Shoshana Zuboff", "2019",
                                                " Analisis tentang dampak kapitalisme pengawasan terhadap masyarakat dan individu.");

                                perpustakaan[] bukuArrayteknologi = { bukuteknologi1, bukuteknologi2, bukuteknologi3,
                                                bukuteknologi4, bukuteknologi5 };
                                buku.displayBuku(bukuArrayteknologi);
                        } else if (kode == 3) {
                                perpustakaan bukuagama1 = new perpustakaan("The Bible", "(Alkitab)",
                                                "Berbagai kitab, berbagai waktu penulisan",
                                                "Kumpulan kitab suci Kristen yang berisi ajaran dan cerita tentang kehidupan dan ajaran Yesus Kristus");
                                perpustakaan bukuagama2 = new perpustakaan("The Quran", "(Al-quran)", "mulai 610 M",
                                                " Kitab suci dalam agama Islam yang dianggap sebagai wahyu Allah yang diberikan kepada Nabi Muhammad.");
                                perpustakaan bukuagama3 = new perpustakaan("The Tao Te Ching", "Lao Tzu",
                                                "Diperkirakan abad ke-6 atau ke-4 SM",
                                                " Karya klasik dalam filsafat Taoisme yang berisi ajaran tentang jalan hidup yang benar.");
                                perpustakaan bukuagama4 = new perpustakaan("The Bhagavad Gita", "(kitab hindu)",
                                                "(Diperkirakan abad ke-5 SM)",
                                                " Salah satu bagian dari epik Mahabharata yang mengandung ajaran-ajaran etika, filsafat, dan spiritualitas Hindu.");
                                perpustakaan bukuagama5 = new perpustakaan("The Tibetan Book of Living and Dying",
                                                "Sogyal Rinpoche", "1992",
                                                " Buku yang membahas ajaran-ajaran tentang kematian dan kehidupan menurut tradisi spiritual Tibet.");

                                perpustakaan[] bukuArrayagama = { bukuagama1, bukuagama2, bukuagama3, bukuagama4,
                                                bukuagama5 };
                                buku.displayBuku(bukuArrayagama);
                        } else if (kode == 4) {
                                perpustakaan bukusejarah1 = new perpustakaan(
                                                "Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond",
                                                "1997",
                                                " Buku ini membahas peran geografi, biologi, dan kebijakan dalam perkembangan peradaban manusia.");
                                perpustakaan bukusejarah2 = new perpustakaan("A People's History of the United States",
                                                "Howard Zinn", "1980",
                                                " Sebuah narasi sejarah Amerika Serikat yang melibatkan perspektif dari masyarakat biasa.");
                                perpustakaan bukusejarah3 = new perpustakaan(
                                                "The Silk Roads: A New History of the World", "Peter Frankopan", "2015",
                                                " Buku ini menelusuri sejarah peradaban dunia dengan menyoroti peran penting jalur-jalur perdagangan.");
                                perpustakaan bukusejarah4 = new perpustakaan(
                                                "1491: New Revelations of the Americas Before Columbus",
                                                "Charles C. Mann", "2005",
                                                " Buku ini menggali pengetahuan baru tentang peradaban Amerika sebelum kedatangan Christopher Columbus.");
                                perpustakaan bukusejarah5 = new perpustakaan("SPQR: A History of Ancient Rome",
                                                "Mary Beard", "2015",
                                                " Sebuah kajian mendalam tentang sejarah Kekaisaran Romawi dari berbagai aspek kehidupan sosial, politik, dan budaya.");

                                perpustakaan[] bukuArraysejarah = { bukusejarah1, bukusejarah2, bukusejarah3,
                                                bukusejarah4, bukusejarah5 };
                                buku.displayBuku(bukuArraysejarah);

                        } else if (kode == 5) {
                                perpustakaan bukupsikologi1 = new perpustakaan("Thinking, Fast and Slow",
                                                "Daniel Kahneman", "2011",
                                                " Buku ini membahas proses berpikir manusia, termasuk cara pikiran manusia bekerja dan mengambil keputusan.");
                                perpustakaan bukupsikologi2 = new perpustakaan(
                                                "The Power of Habit: Why We Do What We Do in Life and Business",
                                                "Charles Duhigg", "2012",
                                                " Buku ini menjelaskan tentang kebiasaan, bagaimana terbentuk, dan bagaimana mengubahnya.");
                                perpustakaan bukupsikologi3 = new perpustakaan("Man's Search for Meaning",
                                                "Viktor E. Frankl", "1946",
                                                " Karya yang menggambarkan pengalaman seorang psikiater dalam kamp konsentrasi Nazi dan pencariannya akan makna hidup.");
                                perpustakaan bukupsikologi4 = new perpustakaan(
                                                "Quiet: The Power of Introverts in a World That Can't Stop Talking",
                                                "Susan Cain", "2012",
                                                " Buku ini membahas kekuatan introvert dalam dunia yang cenderung menghargai kepribadian ekstrovert.");
                                perpustakaan bukupsikologi5 = new perpustakaan(
                                                "Flow: The Psychology of Optimal Experience", "Mihaly Csikszentmihalyi",
                                                "1990",
                                                " Buku ini membahas tentang pengalaman aliran (flow) yang menghasilkan kepuasan dan kebahagiaan maksimal.");

                                perpustakaan[] bukuArraypsikologi = { bukupsikologi1, bukupsikologi2, bukupsikologi3,
                                                bukupsikologi4, bukupsikologi5 };
                                buku.displayBuku(bukuArraypsikologi);

                        } else if (kode == 6) {
                                perpustakaan bukupolitik1 = new perpustakaan("The Prince", "Niccolò Machiavelli",
                                                "1532",
                                                " Karya ini membahas politik dan pemerintahan, dengan fokus pada pertimbangan-pertimbangan praktis dan realitas kekuasaan.");
                                perpustakaan bukupolitik2 = new perpustakaan("The Communist Manifesto",
                                                "Karl Marx dan Friedrich Engels", "1848",
                                                " Manifesto politik yang menguraikan teori dasar Marxisme dan menyerukan revolusi proletar.");
                                perpustakaan bukupolitik3 = new perpustakaan("Democracy in America",
                                                "Alexis de Tocqueville", "1835",
                                                " Analisis tentang sistem politik Amerika Serikat oleh penulis Prancis pada abad ke-19.");
                                perpustakaan bukupolitik4 = new perpustakaan("The End of History and the Last Man",
                                                "Francis Fukuyama", "1992",
                                                " Buku ini mengajukan teori tentang akhir sejarah dan munculnya 'manusia terakhir' dalam arti ideologis.");
                                perpustakaan bukupolitik5 = new perpustakaan("The Origins of Totalitarianism",
                                                "Hannah Arendt", "1951",
                                                " Analisis tentang munculnya rezim totaliter di Eropa pada abad ke-20.");

                                perpustakaan[] bukuArraypolitik = { bukupolitik1, bukupolitik2, bukupolitik3,
                                                bukupolitik4, bukupolitik5 };
                                buku.displayBuku(bukuArraypolitik);

                        } else if (kode == 7) {
                                perpustakaan bukufiksi1 = new perpustakaan("1984", "George Orwell", "1949",
                                                " Novel distopia yang menggambarkan masyarakat terkendali oleh pemerintahan otoriter yang memantau setiap gerak langkah warganya.");
                                perpustakaan bukufiksi2 = new perpustakaan("Brave New World", "Aldous Huxley", "1949",
                                                " Novel distopia yang menggambarkan masyarakat yang dikuasai oleh teknologi dan kepuasan materi.");
                                perpustakaan bukufiksi3 = new perpustakaan("The Handmaid's Tale", "Margaret Atwood",
                                                "1985",
                                                " Novel distopia yang menggambarkan masyarakat di mana wanita diatur oleh kekuasaan totaliter yang membungkam kebebasan mereka.");
                                perpustakaan bukufiksi4 = new perpustakaan("The Lord of the Rings", "J.R.R Tolkien",
                                                "1954",
                                                " Trilogi epik fantasi yang mengisahkan tentang perjalanan sebuah cincin ajaib dan pertempuran antara kebaikan dan kejahatan.");
                                perpustakaan bukufiksi5 = new perpustakaan("To Kill a Mockingbird", "Harper Lee",
                                                "1960",
                                                " Novel tentang rasial dan keadilan yang mengisahkan perjalanan seorang gadis kecil di Alabama, AS.");

                                perpustakaan[] bukuArrayfiksi = { bukufiksi1, bukufiksi2, bukufiksi3, bukufiksi4,
                                                bukufiksi5 };
                                buku.displayBuku(bukuArrayfiksi);
                        }
                        System.out.println("apakaha anda ingin mencari buku lagi? (ya/tidak)");
                        String jawab = scn.next();
                        ulangi = jawab.equalsIgnoreCase("ya");
                        if (!ulangi) {
                                System.out.println("\nTerima kasih atas kunjungan Anda!");
                        }

                } while (ulangi);

                scn.close();

        }
}
