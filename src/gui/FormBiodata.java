package gui;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;


public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel textnama;
    private JLabel textnim;
    private JLabel textJenjangPendidikan;
    private JLabel textFakultas;
    private JLabel textJurusan;
    private JLabel textTahunMasuk;
    private JLabel textJenisKelamin;
    private JLabel textNoUrutMahasiswa;
    private JButton ButtonOk;


    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil data dari teksNama
                String nama = textNama.getText();
                //Mengambil data dari tekNim
                String nim = textNim.getText();
                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                //Tampilkan output ke Biodata
                textnama.setText(nama);
                textnim.setText(nim);
                textJenjangPendidikan.setText(mhs.JenjangPendidikan());
                textFakultas.setText(mhs.MenentukanFakultas());
                textJurusan.setText(mhs.MenentukanJurusan());
                textTahunMasuk.setText(mhs.TahunMasuk());
                textJenisKelamin.setText(mhs.JenisKelamin());
                textNoUrutMahasiswa.setText(mhs.NomorUrutMahasiswa());

            }

            });

        }



    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
