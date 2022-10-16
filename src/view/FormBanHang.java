/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DomainModel.ChiTietSanPham;
import Service.ChucVuService;
import Service.CuaHangService;
import Service.DongSPService;
import Service.HoaDonChiTietServiceImpl;
import Service.KhachHangService;
import Service.MauSacService;
import Service.NSXService;
import Service.SanPhamService;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DomainModel.ChucVu;
import DomainModel.CuaHang;
import DomainModel.DongSP;
import DomainModel.HoaDon;
import DomainModel.HoaDonChiTiet;
import DomainModel.KhachHang;
import DomainModel.MauSac;
import DomainModel.NSX;
import DomainModel.NhanVien;
import DomainModel.SanPham;
import Service.ChiTietSPService;
import Service.ChiTietSPServiceImpl;
import Service.ChucVuServiceImpl;
import Service.CuaHangServiceImpl;
import Service.DongSPServiceImpl;
import Service.HoaDonService;
import Service.HoaDonServiceImpl;
import Service.KhachHangServiceImpl;
import Service.MauSacServiceImpl;
import Service.NSXServiceImpl;
import Service.NhanVienService;
import Service.NhanVienServiceImpl;
import Service.SanPhamServiceImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class FormBanHang extends javax.swing.JFrame {

    private DefaultTableModel modelCV;
    private List<ChucVu> lstcv;
    private ChucVuService service;

    private DefaultTableModel modelMS;
    private List<MauSac> lstms;
    private MauSacService srvMS;

    private DefaultTableModel modelNSX;
    private List<NSX> lstNSX;
    private NSXService srvNSX;

    private DefaultTableModel modelSP;
    private List<SanPham> lstSP;
    private SanPhamService srvSP;

    private DefaultTableModel modelDSP;
    private List<DongSP> lstDSP;
    private DongSPService srvDSP;

    private DefaultTableModel modelCH;
    private List<CuaHang> lstCH;
    private CuaHangService srvCH;

    private DefaultTableModel modelKH;
    private List<KhachHang> lstKH;
    private KhachHangService srvKH;

    private DefaultTableModel modelHDCT;
    private List<HoaDonChiTiet> lstHDCT;
    private HoaDonChiTietServiceImpl srvHDCT;

    private DefaultTableModel modelNV;
    private List<NhanVien> lstNV;
    private NhanVienService srvNV;
    
    private DefaultTableModel modelHD;
    private List<HoaDon> lstHD;
    private HoaDonService srvHD;
    
    private DefaultTableModel modelCTSP;
    private List<ChiTietSanPham> lstCTSP;
    private ChiTietSPService srvCTSP;
    

    /**
     * Creates new form FormBanHang
     */
    public FormBanHang() {
        initComponents();
        service = new ChucVuServiceImpl();
        lstcv = service.getList();
        modelCV = (DefaultTableModel) tblChucVu.getModel();

        srvMS = new MauSacServiceImpl();
        lstms = srvMS.getList();
        modelMS = (DefaultTableModel) tbMauSac.getModel();

        srvNSX = new NSXServiceImpl();
        lstNSX = srvNSX.getList();
        modelNSX = (DefaultTableModel) tblNSX.getModel();

        srvSP = new SanPhamServiceImpl();
        lstSP = srvSP.getList();
        modelSP = (DefaultTableModel) tblSanPham.getModel();

        srvDSP = new DongSPServiceImpl();
        lstDSP = srvDSP.getList();
        modelDSP = (DefaultTableModel) tblDongSP.getModel();

        srvCH = new CuaHangServiceImpl();
        lstCH = srvCH.getList();
        modelCH = (DefaultTableModel) tblCuaHang.getModel();

        srvKH = new KhachHangServiceImpl();
        lstKH = srvKH.getList();
        modelKH = (DefaultTableModel) tblKh.getModel();
        
        srvHDCT = new HoaDonChiTietServiceImpl();
        lstHDCT = srvHDCT.getList();
        modelHDCT = (DefaultTableModel) tblHDCT.getModel();

        srvNV = new NhanVienServiceImpl();
        lstNV = srvNV.getList();
        modelNV = (DefaultTableModel) tblNV.getModel();
        
        srvHD = new HoaDonServiceImpl();
        lstHD = srvHD.getList();
        modelHD = (DefaultTableModel) TBHD.getModel();
        
        srvCTSP = new ChiTietSPServiceImpl();
        lstCTSP = srvCTSP.getList();
        modelCTSP = (DefaultTableModel) tbCHiTiet.getModel();
        
        
        

        loadTableChucVu();
        loadTableMauSac();
        loadTableNSX();
        loadTableSanPham();
        loadTableDongSP();
        loadTableCuaHang();
        loadTableKhachHang();
        loadTableHoaDonChiTiet();
        loadTableNhanVien();
        loadTableHoaDon();
        loadTableChitietSp();
    }

    private void loadTableChucVu() {
        modelCV.setRowCount(0);
        for (ChucVu x : lstcv) {
            Object row[] = new Object[]{
                x.getId(),
                x.getMa(),
                x.getTen()
            };
            modelCV.addRow(row);
        }
    }

    private void loadTableMauSac() {
        modelMS.setRowCount(0);
        for (MauSac x : lstms) {
            Object row[] = new Object[]{
                x.getIdMS(),
                x.getMaMS(),
                x.getTenMS()
            };
            modelMS.addRow(row);
        }
    }
    
    private void loadTableChitietSp() {
        modelCTSP.setRowCount(0);
        for (ChiTietSanPham x : lstCTSP) {
            Object row[] = new Object[]{
                x.getId(),
                x.getIdSP(),
                x.getIdNSX(),
                x.getIdMausac(),
                x.getIdDongiasp(),
                x.getNamBH(),
                x.getMota(),
                x.getSoluongton(),
                x.getGianhap(),
                x.getGiaban()
            };
            modelCTSP.addRow(row);
        }

    }
    private void loadTableHoaDon(){
        modelHD.setRowCount(0);
        for (HoaDon x : lstHD) {
            Object row[] = new Object[]{
                x.getId(),
                x.getIdKH(),
                x.getIdNV(),
                x.getMa(),
                x.getNgaytao(),
                x.getNgaythanhtoan(),
                x.getNgayship(),
                x.getNgaynhan(),
                x.getTinhtrang(),
                x.getTennguoinhan(),
                x.getDiachi(),
                x.getSdt()
            };
            modelHD.addRow(row);
        }
    }

    private void loadTableNSX() {
        modelNSX.setRowCount(0);
        for (NSX x : lstNSX) {
            Object row[] = new Object[]{
                x.getIdNSX(),
                x.getMaNSX(),
                x.getTenNSX()
            };
            modelNSX.addRow(row);
        }
    }

    private void loadTableSanPham() {
        modelSP.setRowCount(0);
        for (SanPham x : lstSP) {
            Object row[] = new Object[]{
                x.getIdsp(),
                x.getMasp(),
                x.getTensp()
            };
            modelSP.addRow(row);
        }
    }

    private void loadTableDongSP() {
        modelDSP.setRowCount(0);
        for (DongSP x : lstDSP) {
            Object row[] = new Object[]{
                x.getIdDG(),
                x.getMaDG(),
                x.getTenDG()
            };
            modelDSP.addRow(row);
        }
    }

    private void loadTableCuaHang() {
        modelCH.setRowCount(0);
        for (CuaHang x : lstCH) {
            Object row[] = new Object[]{
                x.getIdch(),
                x.getMach(),
                x.getTench(),
                x.getDiachi(),
                x.getThanhpho(),
                x.getQuocgia()
            };
            modelCH.addRow(row);
        }
    }

    private void loadTableKhachHang() {
        modelKH.setRowCount(0);
        for (KhachHang x : lstKH) {
            Object row[] = new Object[]{
                x.getIdkh(),
                x.getMakh(),
                x.getTenkh(),
                x.getTendem(),
                x.getHo(),
                x.getNgaySinh(),
                x.getSdt(),
                x.getDiachi(),
                x.getThanhpho(),
                x.getQuocgia(),
                x.getMatkhau()
            };
            modelKH.addRow(row);
        }
    }

    private void loadTableHoaDonChiTiet(){
        modelHDCT.setRowCount(0);
       for (HoaDonChiTiet x : lstHDCT) {
            Object row[] = new Object[]{
                x.getId(),
                x.getIdChiTietSP(),
                x.getSoluong(),
                x.getDongia()
            };
            modelHDCT.addRow(row);
        }
}  
    
    private void loadTableNhanVien() {
        modelNV.setRowCount(0);
        for (NhanVien x : lstNV) {
            Object row[] = new Object[]{
                x.getIdnv(),
                x.getManv(),
                x.getTennv(),
                x.getTendem(),
                x.getHo(),
                x.getGioitinh(),
                x.getNgaysinh(),
                x.getDiachi(),
                x.getSdt(),
                x.getMatkhau(),
                x.getIdCH(),
                x.getIdCH(),
                x.getTrangThai() == 0 ? "Còn" : "Không",
            };
            modelNV.addRow(row);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblIDCuaHang = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTenCuaHang = new javax.swing.JTextField();
        txthanhPhoCH = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblCuaHang = new javax.swing.JTable();
        txtMaCuaHang = new javax.swing.JTextField();
        txtDCCH = new javax.swing.JTextField();
        txtQuocGiaCH = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblIDChucVu = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtTenChucVu = new javax.swing.JTextField();
        txtMaChucVu = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblChucVu = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtTenmau = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMauSac = new javax.swing.JTable();
        btnThemMau = new javax.swing.JButton();
        btnSuaMau = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        btnXoaMau = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblIDMau = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMamau = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txtTenNSX = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNSX = new javax.swing.JTable();
        btnThemNSX = new javax.swing.JButton();
        btnSuaNSX = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        btnXoaNSX = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblIDNSX = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtMaNSX = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtTenSanPham = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblIDSanPham = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        txtTenDongSP = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDongSP = new javax.swing.JTable();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        lblIDDongSP = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtMaDongSP = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblIDKh = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txttenKH = new javax.swing.JTextField();
        txtTenDemKH = new javax.swing.JTextField();
        txtHoKH = new javax.swing.JTextField();
        txtNgaySinhKH = new javax.swing.JTextField();
        txtSDTKH = new javax.swing.JTextField();
        txtDCKH = new javax.swing.JTextField();
        txtTpKH = new javax.swing.JTextField();
        txtQGKH = new javax.swing.JTextField();
        txtMKKH = new javax.swing.JTextField();
        btnThemKH = new javax.swing.JButton();
        btnSuaKh = new javax.swing.JButton();
        btnXoaKh = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblKh = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblIDHDCT = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtDonGiaHDCT = new javax.swing.JTextField();
        txtSoLuongHDCT = new javax.swing.JTextField();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblHDCT = new javax.swing.JTable();
        lblIDCTSP = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        lblIDNV = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtTenDemNV = new javax.swing.JTextField();
        txtNSinhNv = new javax.swing.JTextField();
        txtGioiTinh = new javax.swing.JTextField();
        txtHoNV = new javax.swing.JTextField();
        txtDiaChiNv = new javax.swing.JTextField();
        txtMatkhauNv = new javax.swing.JTextField();
        txtSDTNV = new javax.swing.JTextField();
        txtIDBC = new javax.swing.JTextField();
        cbcIDCH = new javax.swing.JComboBox<>();
        cbcIDCV = new javax.swing.JComboBox<>();
        btnThemNV = new javax.swing.JButton();
        btnSuaNV = new javax.swing.JButton();
        btnXoaNV = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblNV = new javax.swing.JTable();
        rdCon = new javax.swing.JRadioButton();
        rdKhong = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        lblIDHoaDon = new javax.swing.JLabel();
        txtIDHDKh = new javax.swing.JTextField();
        txtIdHDNV = new javax.swing.JTextField();
        txtmaHD = new javax.swing.JTextField();
        txtNgayShipHD = new javax.swing.JTextField();
        txtNgayThanhToanHD = new javax.swing.JTextField();
        txtNgayTaohd = new javax.swing.JTextField();
        txtDiachiHd = new javax.swing.JTextField();
        txtTennguoinha = new javax.swing.JTextField();
        txtNgayNhaHD = new javax.swing.JTextField();
        txtSDtHoaDon = new javax.swing.JTextField();
        rdThanhToan = new javax.swing.JRadioButton();
        rdCho = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        TBHD = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        lblIDCHiTiet = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        lblIDNSXCT = new javax.swing.JLabel();
        lblidSPCT = new javax.swing.JLabel();
        lblIDMSCT = new javax.swing.JLabel();
        txtMota = new javax.swing.JTextField();
        txtNam = new javax.swing.JTextField();
        txtGiaNHap = new javax.swing.JTextField();
        txtgiaBan = new javax.swing.JTextField();
        txtSOluong = new javax.swing.JTextField();
        lblIDSPCT = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbCHiTiet = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        lblIDGioHangCT = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        txtDonGiaKHiGiam = new javax.swing.JTextField();
        txtSoLuongGHCT = new javax.swing.JTextField();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblGHCT = new javax.swing.JTable();
        lblIDCTSPGH = new javax.swing.JLabel();
        txtDonGiaGHCT = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        lblIDGH = new javax.swing.JLabel();
        lblIDKHGH = new javax.swing.JLabel();
        lblidNVGH = new javax.swing.JLabel();
        txtMaGH = new javax.swing.JTextField();
        txtNgayTaoGH = new javax.swing.JTextField();
        txtNgayTTGH = new javax.swing.JTextField();
        txtDCGH = new javax.swing.JTextField();
        txtSDTGH = new javax.swing.JTextField();
        txtTNNGH = new javax.swing.JTextField();
        rdGiao = new javax.swing.JRadioButton();
        rdChua = new javax.swing.JRadioButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        tbGH = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jButton27.setText("THOÁT");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        lblIDCuaHang.setText("-");

        jLabel20.setText("Tên");

        jLabel21.setText("Mã");

        txthanhPhoCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthanhPhoCHActionPerformed(evt);
            }
        });

        tblCuaHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MÃ", "TÊN", "Địa Chỉ", "Thành Phố", "Quốc Gia"
            }
        ));
        tblCuaHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuaHangMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblCuaHang);

        txtMaCuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaCuaHangActionPerformed(evt);
            }
        });

        txtDCCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDCCHActionPerformed(evt);
            }
        });

        txtQuocGiaCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuocGiaCHActionPerformed(evt);
            }
        });

        jLabel22.setText("Thành Phố");

        jLabel23.setText("Địa Chỉ");

        jLabel24.setText("Quốc Gia");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenCuaHang))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuocGiaCH, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(txthanhPhoCH, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(lblIDCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(txtDCCH, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addGap(36, 36, 36)
                .addComponent(btnXoa)
                .addGap(47, 47, 47)
                .addComponent(jButton27)
                .addGap(76, 76, 76))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblIDCuaHang)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDCCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txthanhPhoCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtTenCuaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuocGiaCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnThem)
                    .addComponent(jButton27))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Cửa Hàng", jPanel2);

        jButton1.setText("THÊM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SỬA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("THOÁT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("XÓA");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        lblIDChucVu.setText("-");

        jLabel18.setText("Tên");

        jLabel19.setText("Mã");

        txtMaChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaChucVuActionPerformed(evt);
            }
        });

        tblChucVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "MÃ", "TÊN"
            }
        ));
        tblChucVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChucVuMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblChucVu);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(18, 18, 18)
                            .addComponent(txtTenChucVu))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addGap(18, 18, 18)
                            .addComponent(txtMaChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(lblIDChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(387, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(36, 36, 36)
                .addComponent(jButton4)
                .addGap(47, 47, 47)
                .addComponent(jButton3)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblIDChucVu))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtMaChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtTenChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Chức Vụ", jPanel1);

        tbMauSac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Mã", "Tên"
            }
        ));
        tbMauSac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMauSacMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbMauSac);

        btnThemMau.setText("THÊM");
        btnThemMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMauActionPerformed(evt);
            }
        });

        btnSuaMau.setText("SỬA");
        btnSuaMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaMauActionPerformed(evt);
            }
        });

        jButton8.setText("THOÁT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        btnXoaMau.setText("XÓA");
        btnXoaMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaMauActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        lblIDMau.setText("-");

        jLabel6.setText("TÊN");

        jLabel7.setText("MÃ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenmau, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtMamau)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(lblIDMau, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(btnThemMau)
                        .addGap(30, 30, 30)
                        .addComponent(btnSuaMau)
                        .addGap(35, 35, 35)
                        .addComponent(btnXoaMau)
                        .addGap(57, 57, 57)
                        .addComponent(jButton8))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblIDMau))
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMamau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTenmau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemMau)
                    .addComponent(btnSuaMau)
                    .addComponent(btnXoaMau)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Màu Sắc", jPanel3);

        tblNSX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Mã", "Tên"
            }
        ));
        tblNSX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNSXMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblNSX);

        btnThemNSX.setText("THÊM");
        btnThemNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNSXActionPerformed(evt);
            }
        });

        btnSuaNSX.setText("SỬA");
        btnSuaNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaNSXActionPerformed(evt);
            }
        });

        jButton13.setText("THOÁT");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        btnXoaNSX.setText("XÓA");
        btnXoaNSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNSXActionPerformed(evt);
            }
        });

        jLabel8.setText("ID");

        lblIDNSX.setText("-");

        jLabel9.setText("TÊN");

        jButton15.setText("CLEAR");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel10.setText("MÃ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txtMaNSX)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(lblIDNSX, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnThemNSX)
                        .addGap(30, 30, 30)
                        .addComponent(btnSuaNSX)
                        .addGap(35, 35, 35)
                        .addComponent(btnXoaNSX)
                        .addGap(27, 27, 27)
                        .addComponent(jButton15)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblIDNSX))
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTenNSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNSX)
                    .addComponent(btnSuaNSX)
                    .addComponent(btnXoaNSX)
                    .addComponent(jButton15)
                    .addComponent(jButton13))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("NSX", jPanel4);

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Mã", "Tên"
            }
        ));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblSanPham);

        jButton16.setText("THÊM");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("SỬA");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("THOÁT");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("XÓA");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel11.setText("ID");

        lblIDSanPham.setText("-");

        jLabel12.setText("TÊN");

        jButton20.setText("CLEAR");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel13.setText("MÃ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtMaSanPham)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(lblIDSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton16)
                        .addGap(30, 30, 30)
                        .addComponent(jButton17)
                        .addGap(35, 35, 35)
                        .addComponent(jButton19)
                        .addGap(27, 27, 27)
                        .addComponent(jButton20)
                        .addGap(18, 18, 18)
                        .addComponent(jButton18))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblIDSanPham))
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton19)
                    .addComponent(jButton20)
                    .addComponent(jButton18))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Sản Phẩm", jPanel5);

        tblDongSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Mã", "Tên"
            }
        ));
        tblDongSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDongSPMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblDongSP);

        jButton21.setText("THÊM");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("SỬA");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText("THOÁT");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText("XÓA");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel14.setText("ID");

        lblIDDongSP.setText("-");

        jLabel15.setText("TÊN");

        jButton25.setText("CLEAR");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jLabel16.setText("MÃ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenDongSP, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(txtMaDongSP)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(lblIDDongSP, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton21)
                        .addGap(30, 30, 30)
                        .addComponent(jButton22)
                        .addGap(35, 35, 35)
                        .addComponent(jButton24)
                        .addGap(27, 27, 27)
                        .addComponent(jButton25)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblIDDongSP))
                .addGap(31, 31, 31)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaDongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(31, 31, 31)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTenDongSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jButton22)
                    .addComponent(jButton24)
                    .addComponent(jButton25)
                    .addComponent(jButton23))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dòng SP", jPanel10);

        jLabel3.setText("ID");

        lblIDKh.setText("-");

        jLabel17.setText("Mã");

        jLabel25.setText("Tên");

        jLabel26.setText("Ngày Sinh");

        jLabel27.setText("Họ");

        jLabel28.setText("Tên Đệm");

        jLabel29.setText("Quốc Gia");

        jLabel30.setText("Thành Phố");

        jLabel31.setText("Địa Chỉ");

        jLabel32.setText("SDT");

        jLabel33.setText("Mật Khẩu");

        txtHoKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoKHActionPerformed(evt);
            }
        });

        txtNgaySinhKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhKHActionPerformed(evt);
            }
        });

        btnThemKH.setText("Thêm");
        btnThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKHActionPerformed(evt);
            }
        });

        btnSuaKh.setText("Sửa");
        btnSuaKh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaKhActionPerformed(evt);
            }
        });

        btnXoaKh.setText("Xóa");
        btnXoaKh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhActionPerformed(evt);
            }
        });

        tblKh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MÃ", "Tên", "Tên Đệm", "Họ", "Ngày sinh", "SDT", "Địa Chỉ", "Thành Phố", "Quốc Gia", "Mật Khẩu"
            }
        ));
        tblKh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblKh);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblIDKh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txttenKH))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnThemKH)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTenDemKH)
                                    .addComponent(txtHoKH)
                                    .addComponent(txtNgaySinhKH, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel33)
                                        .addComponent(jLabel29)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel32))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtSDTKH))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDCKH, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtQGKH)
                                            .addComponent(txtTpKH)
                                            .addComponent(txtMKKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(btnSuaKh)
                                .addGap(64, 64, 64)
                                .addComponent(btnXoaKh))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(lblIDKh))
                            .addComponent(txtSDTKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel28)
                            .addComponent(txtTenDemKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDCKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(txtHoKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTpKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29)
                                .addComponent(txtNgaySinhKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQGKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtMKKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txttenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemKH)
                            .addComponent(btnSuaKh)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaKh)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Khách Hàng", jPanel11);

        jLabel4.setText("ID Hóa Đơn");

        lblIDHDCT.setText("-");

        jLabel35.setText("ID Chi Tiết SP");

        jLabel36.setText("Đơn Giá");

        jLabel37.setText("Số Lượng");

        jButton32.setText("Thêm");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setText("Sửa");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setText("Xóa");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        tblHDCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Hóa Đơn", "ID Chi Tiết SP", "Số Lượng", "Đơn Giá"
            }
        ));
        tblHDCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDCTMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tblHDCT);

        lblIDCTSP.setText("-");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(30, 30, 30)
                                        .addComponent(lblIDHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblIDCTSP, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel36)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtDonGiaHDCT))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSoLuongHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton32)
                        .addGap(90, 90, 90)
                        .addComponent(jButton33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton34)
                        .addGap(116, 116, 116))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel37)
                    .addComponent(lblIDHDCT)
                    .addComponent(txtSoLuongHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(txtDonGiaHDCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDCTSP))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton32)
                    .addComponent(jButton34)
                    .addComponent(jButton33))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hóa Đơn CT", jPanel12);

        jLabel34.setText("ID");

        lblIDNV.setText("-");

        jLabel39.setText("IDGUIBC");

        jLabel40.setText("MÃ");

        jLabel41.setText("TÊN");

        jLabel42.setText("TÊN ĐỆM");

        jLabel43.setText("ĐỊA CHỈ");

        jLabel44.setText("IDCV");

        jLabel45.setText("IDCH");

        jLabel46.setText("MẬT KHẨU");

        jLabel47.setText("SĐT");

        jLabel48.setText("NGÀY SINH");

        jLabel49.setText("GIỚI TÍNH");

        jLabel50.setText("HỌ");

        jLabel51.setText("TRẠNG THÁI");

        cbcIDCH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cửa hàng giày dép", "Cửa hàng quần áo", "Cửa hàng gia dụng", " " }));

        cbcIDCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThemNV.setText("Thêm");
        btnThemNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNVActionPerformed(evt);
            }
        });

        btnSuaNV.setText("Sửa");

        btnXoaNV.setText("Xóa");

        tblNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Mã", "Tên", "Tên Đệm", "Họ", "Giới tính", "Ngày sinh", "Địa chỉ", "Số điện thoại", "Mật khẩu", "ID CH", "ID CV", "Trạng Thái"
            }
        ));
        tblNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNVMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tblNV);

        buttonGroup1.add(rdCon);
        rdCon.setText("Còn");

        buttonGroup1.add(rdKhong);
        rdKhong.setText("Không");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnThemNV)
                                .addGap(29, 29, 29)
                                .addComponent(btnSuaNV)
                                .addGap(32, 32, 32)
                                .addComponent(btnXoaNV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel43))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTenDemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel48))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel40)
                                                    .addComponent(jLabel34)
                                                    .addComponent(jLabel41))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblIDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(30, 30, 30)))
                                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                                        .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel50)
                                            .addComponent(jLabel49))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNSinhNv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtHoNV, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiaChiNv))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel51)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel44)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel45)
                                        .addComponent(jLabel46)
                                        .addComponent(jLabel47)))
                                .addGap(66, 66, 66)))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addComponent(rdCon)
                                .addGap(32, 32, 32)
                                .addComponent(rdKhong))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMatkhauNv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbcIDCH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSDTNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbcIDCV, javax.swing.GroupLayout.Alignment.LEADING, 0, 166, Short.MAX_VALUE)
                                .addComponent(txtIDBC, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane10)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(lblIDNV))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(txtSDTNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel40)
                    .addComponent(jLabel50)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatkhauNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel41)
                    .addComponent(jLabel49)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcIDCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLabel42)
                    .addComponent(jLabel48)
                    .addComponent(txtTenDemNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNSinhNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbcIDCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel43)
                    .addComponent(txtDiaChiNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDBC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(rdCon)
                    .addComponent(rdKhong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNV)
                    .addComponent(btnSuaNV)
                    .addComponent(btnXoaNV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nhân Viên", jPanel13);

        jLabel38.setText("ID");

        jLabel52.setText("ID Nv");

        jLabel53.setText(" ID Kh");

        jLabel54.setText("SĐT");

        jLabel55.setText("Ngày ship");

        jLabel56.setText("Ngày thanh toán");

        jLabel57.setText("Ngày tạo");

        jLabel58.setText(" Địa chỉ");

        jLabel59.setText("Tên người nhận");

        jLabel60.setText("Tình trạng");

        jLabel61.setText("Ngày nhận");

        jLabel62.setText("Mã");

        lblIDHoaDon.setText("-");

        buttonGroup1.add(rdThanhToan);
        rdThanhToan.setText("Thanh Toán");

        buttonGroup1.add(rdCho);
        rdCho.setText("Chờ thanh toán");

        jButton5.setText("Thêm");

        jButton6.setText("Sửa");

        jButton7.setText("Xóa");

        TBHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ID KH", "ID NV", "MÃ", "NGÀY TẠO", "NGÀY THANH TOÁN", "NGÀY SHIP", "NGÀY NHẬN", "TÌNH TRẠNG", "TÊN NGƯỜI NHẬN", "ĐỊA CHỈ", "SĐT"
            }
        ));
        jScrollPane11.setViewportView(TBHD);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(jLabel62)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtmaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(lblIDHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel61))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel52))
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtIdHDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIDHDKh, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jButton6)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel14Layout.createSequentialGroup()
                                                    .addComponent(jLabel56)
                                                    .addGap(18, 18, 18))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton7)
                                                        .addComponent(jLabel55))
                                                    .addGap(27, 27, 27)))
                                            .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addComponent(jLabel57)
                                                .addGap(72, 72, 72)))
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNgayTaohd)
                                            .addComponent(txtNgayThanhToanHD, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtNgayShipHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING))))))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(rdThanhToan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(rdCho))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(txtSDtHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(txtNgayNhaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDiachiHd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTennguoinha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButton5))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel61)
                    .addComponent(lblIDHoaDon)
                    .addComponent(txtNgayNhaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel60)
                        .addComponent(txtNgayTaohd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdThanhToan)
                        .addComponent(rdCho))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(txtIDHDKh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel56)
                    .addComponent(txtTennguoinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayThanhToanHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(jLabel55)
                            .addComponent(txtDiachiHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayShipHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(txtIdHDNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(txtmaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSDtHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton7)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hóa Đơn", jPanel14);

        jLabel63.setText("IDSP");

        jLabel64.setText("IDMS");

        jLabel65.setText("IDDSP");

        jLabel66.setText("NĂM BH");

        jLabel67.setText("GIÁ BÁN");

        jLabel68.setText("GIÁ NHẬP");

        jLabel69.setText("SỐỢNG TỒN");

        jLabel70.setText("MÔ TẢ");

        lblIDCHiTiet.setText("-");

        jLabel72.setText("ID");

        jLabel73.setText("IDNSX");

        lblIDNSXCT.setText("-");

        lblidSPCT.setText("-");

        lblIDMSCT.setText("-");

        lblIDSPCT.setText("-");

        jButton9.setText("THÊM");

        jButton10.setText("SỬA");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("XÓA");

        tbCHiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbCHiTiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCHiTietMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tbCHiTiet);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(lblIDSPCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel69))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addGap(44, 44, 44)
                                .addComponent(lblIDCHiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addComponent(jButton9)
                                        .addGap(54, 54, 54)
                                        .addComponent(jButton10))
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                            .addComponent(jLabel73)
                                            .addGap(22, 22, 22)
                                            .addComponent(lblIDNSXCT, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel15Layout.createSequentialGroup()
                                            .addComponent(jLabel63)
                                            .addGap(31, 31, 31)
                                            .addComponent(lblidSPCT, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel64)
                                            .addComponent(jLabel65)))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton11)))))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMota, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(txtNam))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel68)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblIDMSCT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSOluong, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(txtGiaNHap)
                    .addComponent(txtgiaBan))
                .addGap(76, 76, 76))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDCHiTiet)
                    .addComponent(jLabel72)
                    .addComponent(jLabel64)
                    .addComponent(lblIDMSCT))
                .addGap(30, 30, 30)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(lblidSPCT)
                    .addComponent(jLabel65)
                    .addComponent(jLabel69)
                    .addComponent(txtSOluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIDSPCT))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73)
                            .addComponent(lblIDNSXCT)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jLabel68)
                            .addComponent(txtGiaNHap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel67)
                    .addComponent(txtgiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Chi Tiết SP", jPanel15);

        jLabel83.setText("ID Giỏ hàng");

        lblIDGioHangCT.setText("-");

        jLabel84.setText("ID Chi Tiết SP");

        jLabel85.setText("Đơn Giá");

        jLabel86.setText("Số Lượng");

        jButton35.setText("Thêm");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setText("Sửa");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setText("Xóa");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        tblGHCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Hóa Đơn", "ID Chi Tiết SP", "Số Lượng", "Đơn Giá", "Đơn Giá kHi Giảm"
            }
        ));
        tblGHCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGHCTMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tblGHCT);

        lblIDCTSPGH.setText("-");

        jLabel87.setText("ĐG Khi Giảm");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(jLabel83)
                                        .addGap(30, 30, 30)
                                        .addComponent(lblIDGioHangCT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(jLabel84)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblIDCTSPGH, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(jLabel85)
                                        .addGap(31, 31, 31)
                                        .addComponent(txtDonGiaGHCT))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(jLabel86)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSoLuongGHCT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel87)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDonGiaKHiGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jButton35)
                        .addGap(90, 90, 90)
                        .addComponent(jButton36)
                        .addGap(86, 86, 86)
                        .addComponent(jButton37)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(jLabel86)
                    .addComponent(lblIDGioHangCT)
                    .addComponent(txtSoLuongGHCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(jLabel84)
                            .addComponent(lblIDCTSPGH)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDonGiaGHCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton35)
                            .addComponent(jButton37)
                            .addComponent(jButton36)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDonGiaKHiGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 863, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Giỏ Hàng CT", jPanel16);

        jLabel71.setText("ID");

        jLabel74.setText("NGÀY TẠO");

        jLabel75.setText("TÌNH TRẠNG");

        jLabel76.setText("ID NV");

        jLabel77.setText("MÃ");

        jLabel78.setText("SĐT");

        jLabel79.setText("ĐỊA CHỈ");

        jLabel80.setText("TÊN NGƯỜI NHẬN");

        jLabel81.setText("NGÀY THANH TOÁN");

        jLabel82.setText("ID KH");

        lblIDGH.setText("-");

        lblIDKHGH.setText("-");

        lblidNVGH.setText("-");

        buttonGroup1.add(rdGiao);
        rdGiao.setText("Đã Giao");

        buttonGroup1.add(rdChua);
        rdChua.setText("Chưa Giao");

        jButton12.setText("Thêm");

        jButton14.setText("Sửa");

        jButton26.setText("Xóa");

        tbGH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ID KH", "ID NV", "Mã", "Ngày tạo", "Ngày thanh toán", "Tên NN", "Địa Chỉ", "SDT", "Tình Trạng"
            }
        ));
        jScrollPane13.setViewportView(tbGH);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jLabel76)
                            .addComponent(jLabel82)
                            .addComponent(jLabel77))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblIDGH, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(lblIDKHGH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(txtMaGH)
                                .addGap(211, 211, 211))
                            .addComponent(lblidNVGH, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayTaoGH, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addGap(54, 54, 54)
                                .addComponent(jButton14)
                                .addGap(61, 61, 61)
                                .addComponent(jButton26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTNNGH, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayTTGH, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDCGH, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSDTGH, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(rdGiao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdChua)))
                        .addGap(33, 33, 33))))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel81)
                    .addComponent(lblIDGH)
                    .addComponent(txtNgayTTGH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(jLabel82)
                    .addComponent(lblIDKHGH)
                    .addComponent(txtTNNGH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(lblidNVGH))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel77)
                            .addComponent(txtMaGH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(txtNgayTaoGH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel79)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDCGH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel78)
                            .addComponent(txtSDTGH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdGiao)
                            .addComponent(rdChua))))
                .addGap(35, 35, 35)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(jButton26)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Giỏ hàng", jPanel17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String mess = service.deleteSrv(lblIDChucVu.getText());
        JOptionPane.showMessageDialog(this, mess);
        lstcv = service.getList();
        loadTableChucVu();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbMauSacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMauSacMouseClicked
        // TODO add your handling code here:
        int row = tbMauSac.getSelectedRow();
        String idms = tbMauSac.getValueAt(row, 0).toString();
        String mams = tbMauSac.getValueAt(row, 1).toString();
        String tenms = tbMauSac.getValueAt(row, 2).toString();

        lblIDMau.setText(idms);
        txtMamau.setText(mams);
        txtTenmau.setText(tenms);
    }//GEN-LAST:event_tbMauSacMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnXoaMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaMauActionPerformed
        // TODO add your handling code here:
        String mess = srvMS.deleteSrv(lblIDMau.getText());
        JOptionPane.showMessageDialog(this, mess);
        lstms = srvMS.getList();
        loadTableMauSac();
    }//GEN-LAST:event_btnXoaMauActionPerformed

    private void tblNSXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNSXMouseClicked
        // TODO add your handling code here:
        int row = tblNSX.getSelectedRow();
        String id = tblNSX.getValueAt(row, 0).toString();
        String ma = tblNSX.getValueAt(row, 1).toString();
        String ten = tblNSX.getValueAt(row, 2).toString();

        lblIDNSX.setText(id);
        txtMaNSX.setText(ma);
        txtTenNSX.setText(ten);
    }//GEN-LAST:event_tblNSXMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void btnXoaNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNSXActionPerformed
        // TODO add your handling code here:
        String mess = srvNSX.deleteSrv(lblIDNSX.getText());
        JOptionPane.showMessageDialog(this, mess);
        lstNSX = srvNSX.getList();
        loadTableNSX();
    }//GEN-LAST:event_btnXoaNSXActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        int row = tblSanPham.getSelectedRow();
        String id = tblSanPham.getValueAt(row, 0).toString();
        String ma = tblSanPham.getValueAt(row, 1).toString();
        String ten = tblSanPham.getValueAt(row, 2).toString();

        lblIDSanPham.setText(id);
        txtMaSanPham.setText(ma);
        txtTenSanPham.setText(ten);
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        String mess = srvSP.delete(lblIDSanPham.getText());
        JOptionPane.showMessageDialog(this, mess);
        lstSP = srvSP.getList();
        loadTableSanPham();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void tblDongSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDongSPMouseClicked
        // TODO add your handling code here:
        int row = tblDongSP.getSelectedRow();
        String id = tblDongSP.getValueAt(row, 0).toString();
        String ma = tblDongSP.getValueAt(row, 1).toString();
        String ten = tblDongSP.getValueAt(row, 2).toString();

        lblIDDongSP.setText(id);
        txtMaDongSP.setText(ma);
        txtTenDongSP.setText(ten);
    }//GEN-LAST:event_tblDongSPMouseClicked

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
//        boolean check = srvDSP.deleteSrv(lblIDDongSP.getText());
//        if (check) {
//            JOptionPane.showMessageDialog(this, "Xóa thành công");
//            lstDSP = srvDSP.getSrv();
//            loadTableDongSP();
//        }else{
//            JOptionPane.showMessageDialog(this, "Xóa thất bại");
//            
//        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void txtMaChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaChucVuActionPerformed

    public SanPham getFormSP() {
        String idSP = this.lblIDSanPham.getText();
        String maSP = this.txtMaSanPham.getText();
        String tenSp = this.txtTenSanPham.getText();
        if (txtMaSanPham.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã không để trống");
        } else if (txtTenSanPham.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên không để trống");
        }
        SanPham sp = new SanPham(idSP, maSP, tenSp);
        return sp;
    }
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        String mess = srvSP.add(getFormSP());
        JOptionPane.showMessageDialog(this, mess);
        lstSP = srvSP.getList();
        loadTableSanPham();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
//        // TODO add your handling code here:
        String mess = srvSP.update(lblIDSanPham.getText(), getFormSP());
        JOptionPane.showMessageDialog(this, mess);
        lstSP = srvSP.getList();
        loadTableSanPham();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void tblChucVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChucVuMouseClicked
        // TODO add your handling code here:
        int row = tblChucVu.getSelectedRow();
        String id = tblChucVu.getValueAt(row, 0).toString();
        String ma = tblChucVu.getValueAt(row, 1).toString();
        String ten = tblChucVu.getValueAt(row, 2).toString();

        lblIDChucVu.setText(id);
        txtMaChucVu.setText(ma);
        txtTenChucVu.setText(ten);
    }//GEN-LAST:event_tblChucVuMouseClicked
    public MauSac getFormMS() {
        String id = this.lblIDMau.getText();
        String ma = this.txtMamau.getText();
        String ten = this.txtTenmau.getText();
        if (txtMamau.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã không để trống");
        } else if (txtTenmau.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên không để trống");
        }
        MauSac ms = new MauSac(id, ma, ten);
        return ms;
    }
    private void btnThemMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMauActionPerformed
        // TODO add your handling code here:
        String mess = srvMS.add(getFormMS());
        JOptionPane.showMessageDialog(this, mess);
        lstms = srvMS.getList();
        loadTableMauSac();
    }//GEN-LAST:event_btnThemMauActionPerformed

    private void btnSuaMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaMauActionPerformed
        // TODO add your handling code here:
        String mess = srvMS.update(lblIDMau.getText(), getFormMS());
        JOptionPane.showMessageDialog(this, mess);
        lstms = srvMS.getList();
        loadTableMauSac();
    }//GEN-LAST:event_btnSuaMauActionPerformed
    public NSX getFormNSX() {
        String id = this.lblIDNSX.getText();
        String ma = this.txtMaNSX.getText();
        String ten = this.txtTenNSX.getText();
        if (txtMaNSX.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã không để trống");
        } else if (txtTenNSX.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên không để trống");
        }
        NSX nsx = new NSX(id, ma, ten);
        return nsx;
    }
    private void btnThemNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNSXActionPerformed
        // TODO add your handling code here:
        String mess = srvNSX.add(getFormNSX());
        JOptionPane.showMessageDialog(this, mess);
        lstNSX = srvNSX.getList();
        loadTableNSX();
    }//GEN-LAST:event_btnThemNSXActionPerformed
    public ChucVu getFormCV() {
        String id = this.lblIDChucVu.getText();
        String ma = this.txtMaChucVu.getText();
        String ten = this.txtTenChucVu.getText();
        if (txtMaChucVu.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã không để trống");
        } else if (txtTenChucVu.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên không để trống");
        }
        ChucVu cv = new ChucVu(id, ma, ten);
        return cv;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        boolean check = service.add(getFormCV());
//        if (check) {
//            JOptionPane.showMessageDialog(this, "Thêm thành công");
//            lstcv = service.getList();
//            loadTableChucVu();
//        }else{
//            JOptionPane.showMessageDialog(this, "Thêm thất bại");
//            
//        }
        String mess = service.add(getFormCV());
        JOptionPane.showMessageDialog(this, mess);
        lstcv = service.getList();
        loadTableChucVu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String mess = service.update(lblIDChucVu.getText(), getFormCV());
        JOptionPane.showMessageDialog(this, mess);
        lstcv = service.getList();
        loadTableChucVu();
    }//GEN-LAST:event_jButton2ActionPerformed
    public DongSP getFormDSP() {
        String id = this.lblIDDongSP.getText();
        String ma = this.txtMaDongSP.getText();
        String ten = this.txtTenDongSP.getText();
        if (txtMaDongSP.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã không để trống");
        } else if (txtTenDongSP.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên không để trống");
        }
        DongSP dsp = new DongSP(id, ma, ten);
        return dsp;
    }
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
//        boolean check = srvDSP.insertSrv(getFormDSP());
//        if (check) {
//            JOptionPane.showMessageDialog(this, "Thêm thành công");
//            lstDSP = srvDSP.getSrv();
//            loadTableDongSP();
//        }else{
//            JOptionPane.showMessageDialog(this, "Thêm thất bại");
//            
//        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
//        boolean check = srvDSP.updateSrv(lblIDDongSP.getText(), getFormDSP());
//        if (check) {
//            JOptionPane.showMessageDialog(this, "Sửa thành công");
//            lstDSP = srvDSP.getSrv();
//            loadTableDongSP();
//        }else{
//            JOptionPane.showMessageDialog(this, "Sửa thất bại");
//            
//        }
    }//GEN-LAST:event_jButton22ActionPerformed
    public CuaHang getFormCH() {
        String id = this.lblIDCuaHang.getText();
        String ma = this.txtMaCuaHang.getText();
        String ten = this.txtTenCuaHang.getText();
        String diachi = this.txtDCCH.getText();
        String thanhpho = this.txthanhPhoCH.getText();
        String quocgia = this.txtQuocGiaCH.getText();
        if (txtMaCuaHang.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã không để trống");
        } else if (txtTenCuaHang.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên không để trống");
        }
        CuaHang ch = new CuaHang(id, ma, ten, diachi, thanhpho, quocgia);
        return ch;
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String mess = srvCH.add(getFormCH());
        JOptionPane.showMessageDialog(this, mess);
        lstCH = srvCH.getList();
        loadTableCuaHang();

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        String mess = srvCH.update(lblIDCuaHang.getText(), getFormCH());
        JOptionPane.showMessageDialog(this, mess);
        lstCH = srvCH.getList();
        loadTableCuaHang();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        String mess = srvCH.delete(lblIDCuaHang.getText());
        JOptionPane.showMessageDialog(this, mess);
        lstCH = srvCH.getList();
        loadTableCuaHang();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txthanhPhoCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthanhPhoCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthanhPhoCHActionPerformed

    private void tblCuaHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuaHangMouseClicked
        // TODO add your handling code here:
        int row = tblCuaHang.getSelectedRow();
        String id = tblCuaHang.getValueAt(row, 0).toString();
        String ma = tblCuaHang.getValueAt(row, 1).toString();
        String ten = tblCuaHang.getValueAt(row, 2).toString();
        String diachi = tblCuaHang.getValueAt(row, 3).toString();
        String thanhpho = tblCuaHang.getValueAt(row, 4).toString();
        String quocgia = tblCuaHang.getValueAt(row, 5).toString();

        lblIDCuaHang.setText(id);
        txtMaCuaHang.setText(ma);
        txtTenCuaHang.setText(ten);
        txtDCCH.setText(diachi);
        txthanhPhoCH.setText(thanhpho);
        txtQuocGiaCH.setText(quocgia);

    }//GEN-LAST:event_tblCuaHangMouseClicked

    private void txtMaCuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaCuaHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaCuaHangActionPerformed

    private void txtDCCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDCCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDCCHActionPerformed

    private void txtQuocGiaCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuocGiaCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuocGiaCHActionPerformed

    private void txtHoKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoKHActionPerformed

    private void txtNgaySinhKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhKHActionPerformed

    private void btnSuaKhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaKhActionPerformed
        // TODO add your handling code here:
        String mess = srvKH.update(lblIDKh.getText(), getFormKH());
        JOptionPane.showMessageDialog(this, mess);
        lstKH = srvKH.getList();
        loadTableKhachHang();
    }//GEN-LAST:event_btnSuaKhActionPerformed
    public KhachHang getFormKH() {
        String id = this.lblIDKh.getText();
        String ma = this.txtMaKH.getText();
        String ten = this.txttenKH.getText();
        String tendem = this.txtTenDemKH.getText();
        String ho = this.txtHoKH.getText();
        String ngaySinhStr = this.txtNgaySinhKH.getText().trim();
        String sdt = this.txtSDTKH.getText();
        String diachi = this.txtDCCH.getText();
        String thanhpho = this.txthanhPhoCH.getText();
        String quocgia = this.txtQuocGiaCH.getText();
        String matkhau = this.txtMKKH.getText();

        if (txtTenCuaHang.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên không để trống");
            return null;
        }
        SimpleDateFormat ngaySinhS = new SimpleDateFormat("yyyy-MM-dd");
        Date ngaySinh;
        try {
            ngaySinh = ngaySinhS.parse(ngaySinhStr);
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Hay nhap dung dinh dang ngay");
            return null;
        }
        KhachHang kh = new KhachHang(id, ma, ten, tendem, ho, ngaySinh, sdt, diachi, thanhpho, quocgia, matkhau);
        return kh;
    }
    private void btnThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKHActionPerformed
        // TODO add your handling code here:
        String mess = srvKH.add(getFormKH());
        JOptionPane.showMessageDialog(this, mess);
        lstKH = srvKH.getList();
        loadTableKhachHang();
    }//GEN-LAST:event_btnThemKHActionPerformed

    private void btnXoaKhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKhActionPerformed
        String mess = srvKH.delete(lblIDKh.getText());
        JOptionPane.showMessageDialog(this, mess);
        lstKH = srvKH.getList();
        loadTableKhachHang();
    }//GEN-LAST:event_btnXoaKhActionPerformed

    private void tblHDCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDCTMouseClicked
        // TODO add your handling code here:
        int row = tblHDCT.getSelectedRow();
        String idHDCT = tblHDCT.getValueAt(row, 0).toString();
        String idCTSP = tblHDCT.getValueAt(row, 1).toString();
        String soluong = tblHDCT.getValueAt(row, 2).toString();
        String dongia = tblHDCT.getValueAt(row, 3).toString();

        lblIDHDCT.setText(idHDCT);
        lblIDCTSP.setText(idCTSP);
        txtSoLuongHDCT.setText(soluong);
        txtDonGiaHDCT.setText(dongia);
    }//GEN-LAST:event_tblHDCTMouseClicked
    public HoaDonChiTiet getFormHDCT() {
        String idHDCT = this.lblIDHDCT.getText();
        String idCTSP = this.lblIDCTSP.getText();
        String soluong = this.txtSoLuongHDCT.getText();
        String dongia = this.txtDonGiaHDCT.getText();
        
      
        
        HoaDonChiTiet hdct = new HoaDonChiTiet(idCTSP, idCTSP, SOMEBITS, TOP_ALIGNMENT);
        return hdct;
    }
    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        String mess = srvHDCT.add(getFormHDCT());
        JOptionPane.showMessageDialog(this, mess);
        lstHDCT = srvHDCT.getList();
        loadTableHoaDonChiTiet();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        String mess = srvHDCT.delete(lblIDHDCT.getText());
        JOptionPane.showMessageDialog(this, mess);
        lstHDCT = srvHDCT.getList();
        loadTableHoaDonChiTiet();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void btnSuaNSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaNSXActionPerformed
        // TODO add your handling code here:
        String mess = srvNSX.update(lblIDNSX.getText(), getFormNSX());
        JOptionPane.showMessageDialog(this, mess);
        lstNSX = srvNSX.getList();
        loadTableNSX();
    }//GEN-LAST:event_btnSuaNSXActionPerformed

    private void tblKhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhMouseClicked
        // TODO add your handling code here:
        int row = tblKh.getSelectedRow();
        String idKH = tblKh.getValueAt(row, 0).toString();
        String maKh = tblKh.getValueAt(row, 1).toString();
        String tenKH = tblKh.getValueAt(row, 2).toString();
        String tenDemKH = tblKh.getValueAt(row, 3).toString();
        String Ho = tblKh.getValueAt(row, 4).toString();
        String ngaySinh = tblKh.getValueAt(row, 5).toString();
        String SDT = tblKh.getValueAt(row, 6).toString();
        String DiaChi = tblKh.getValueAt(row, 7).toString();
        String ThanhPho = tblKh.getValueAt(row, 8).toString();
        String Quocgia = tblKh.getValueAt(row, 9).toString();
        String MatKhau = tblKh.getValueAt(row, 10).toString();

        lblIDKh.setText(idKH);
        txttenKH.setText(tenKH);
        txtMaKH.setText(maKh);
        txtTenDemKH.setText(tenDemKH);
        txtHoKH.setText(Ho);
        txtNgaySinhKH.setText(ngaySinh);
        txtSDTKH.setText(SDT);
        txtDCKH.setText(DiaChi);
        txtTpKH.setText(ThanhPho);
        txtQGKH.setText(Quocgia);
        txtMKKH.setText(MatKhau);
    }//GEN-LAST:event_tblKhMouseClicked

    private void tblNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNVMouseClicked
        // TODO add your handling code here:
        int row = tblNV.getSelectedRow();
        String id = tblNV.getValueAt(row, 0).toString();
        String ma = tblNV.getValueAt(row, 1).toString();
        String ten = tblNV.getValueAt(row, 2).toString();
        String tenDem = tblNV.getValueAt(row, 3).toString();
        String Ho = tblNV.getValueAt(row, 4).toString();
        String gt = tblNV.getValueAt(row, 5).toString();
        String ngaySinh = tblNV.getValueAt(row, 6).toString();
        String DiaChi = tblNV.getValueAt(row, 7).toString();
        String SDT = tblNV.getValueAt(row, 8).toString();
        String MatKhau = tblNV.getValueAt(row, 9).toString();
        String idCh = tblNV.getValueAt(row, 10).toString();
        String idcv = tblNV.getValueAt(row, 11).toString();
        String TrangThai = tblNV.getValueAt(row, 12).toString();

        lblIDNV.setText(id);
        txtTenNV.setText(ten);
        txtMaNV.setText(ma);
        txtTenDemNV.setText(tenDem);
        txtHoNV.setText(Ho);
        txtGioiTinh.setText(gt);
        txtNSinhNv.setText(ngaySinh);
        txtSDTNV.setText(SDT);
        txtDiaChiNv.setText(DiaChi);
        txtMatkhauNv.setText(MatKhau);
        cbcIDCH.setSelectedItem(idCh);
        cbcIDCV.setSelectedItem(idcv);
        if (TrangThai.equals("Còn")) {
            this.rdCon.setSelected(true);
        } else {
            this.rdKhong.setSelected(true);
        }
    }//GEN-LAST:event_tblNVMouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void tbCHiTietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCHiTietMouseClicked
        // TODO add your handling code here:
        int row = tbCHiTiet.getSelectedRow();
        String id = tbCHiTiet.getValueAt(row, 0).toString();
        String idsp = tbCHiTiet.getValueAt(row, 1).toString();
        String idnsx = tbCHiTiet.getValueAt(row, 2).toString();
        String idms = tbCHiTiet.getValueAt(row, 3).toString();
        String iddsp = tbCHiTiet.getValueAt(row, 4).toString();
        String nam = tbCHiTiet.getValueAt(row, 5).toString();
        String mota = tbCHiTiet.getValueAt(row, 6).toString();
        String solg = tbCHiTiet.getValueAt(row, 7).toString();
        String gianhap = tbCHiTiet.getValueAt(row, 8).toString();
        String giaban = tbCHiTiet.getValueAt(row, 9).toString();

        lblIDCTSP.setText(id);
        lblidSPCT.setText(idsp);
        lblIDNSXCT.setText(idnsx);
        lblIDMSCT.setText(idms);
        lblIDSPCT.setText(iddsp);
        txtNam.setText(nam);
        txtMota.setText(mota);
        txtSOluong.setText(solg);
        txtGiaNHap.setText(gianhap);
        txtgiaBan.setText(giaban);
    }//GEN-LAST:event_tbCHiTietMouseClicked

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        String mess = srvHDCT.update(lblIDHDCT.getText(),getFormHDCT());
        JOptionPane.showMessageDialog(this, mess);
        lstHDCT = srvHDCT.getList();
        loadTableHoaDonChiTiet();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton37ActionPerformed

    private void tblGHCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGHCTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblGHCTMouseClicked
 private NhanVien getFormData(){
        String idnv = this.lblIDNV.getText().trim();
        String manv = this.txtMaNV.getText().trim();
        String ngaySinhStr = this.txtNSinhNv.getText().trim();
        String tennv = this.txtTenNV.getText().trim();
        String tendem = this.txtTenDemNV.getText().trim();
        String ho = this.txtHoNV.getText().trim();
        String gioitinh = this.txtGioiTinh.getText().trim();
        String diachi = this.txtDiaChiNv.getText().trim();
        String sdt = this.txtSDTNV.getText().trim();
        String matkhau = this.txtMatkhauNv.getText().trim();
        int Trangthai = rdCon.isSelected() ? 0 : 1;
        String idCH = this.cbcIDCH.getSelectedItem().toString();
        String idCV = this.cbcIDCV.getSelectedItem().toString();
       
        if (tennv.isBlank() || ngaySinhStr.isBlank() || diachi.isBlank() || matkhau.isBlank()) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong");
            return null;
        }
        
        SimpleDateFormat ngaySXS = new SimpleDateFormat("yyyy-MM-dd");
        Date ngaySX;
        try {
            ngaySX = ngaySXS.parse(ngaySinhStr);
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Hay nhap dung dinh dang ngay");
            return null;
        }
        NhanVien nv = new NhanVien(idnv, manv, tennv, tendem, ho, gioitinh, ngaySX, diachi, sdt, matkhau, idCH, idCV, Trangthai);
        return nv;
    }

    private void btnThemNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNVActionPerformed
        // TODO add your handling code here:
        String mess = srvNV.add(getFormData());
        JOptionPane.showMessageDialog(this, mess);
        lstNV = srvNV.getList();
        loadTableNhanVien();
    }//GEN-LAST:event_btnThemNVActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBanHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBHD;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaKh;
    private javax.swing.JButton btnSuaMau;
    private javax.swing.JButton btnSuaNSX;
    private javax.swing.JButton btnSuaNV;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemKH;
    private javax.swing.JButton btnThemMau;
    private javax.swing.JButton btnThemNSX;
    private javax.swing.JButton btnThemNV;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaKh;
    private javax.swing.JButton btnXoaMau;
    private javax.swing.JButton btnXoaNSX;
    private javax.swing.JButton btnXoaNV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbcIDCH;
    private javax.swing.JComboBox<String> cbcIDCV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIDCHiTiet;
    private javax.swing.JLabel lblIDCTSP;
    private javax.swing.JLabel lblIDCTSPGH;
    private javax.swing.JLabel lblIDChucVu;
    private javax.swing.JLabel lblIDCuaHang;
    private javax.swing.JLabel lblIDDongSP;
    private javax.swing.JLabel lblIDGH;
    private javax.swing.JLabel lblIDGioHangCT;
    private javax.swing.JLabel lblIDHDCT;
    private javax.swing.JLabel lblIDHoaDon;
    private javax.swing.JLabel lblIDKHGH;
    private javax.swing.JLabel lblIDKh;
    private javax.swing.JLabel lblIDMSCT;
    private javax.swing.JLabel lblIDMau;
    private javax.swing.JLabel lblIDNSX;
    private javax.swing.JLabel lblIDNSXCT;
    private javax.swing.JLabel lblIDNV;
    private javax.swing.JLabel lblIDSPCT;
    private javax.swing.JLabel lblIDSanPham;
    private javax.swing.JLabel lblidNVGH;
    private javax.swing.JLabel lblidSPCT;
    private javax.swing.JRadioButton rdCho;
    private javax.swing.JRadioButton rdChua;
    private javax.swing.JRadioButton rdCon;
    private javax.swing.JRadioButton rdGiao;
    private javax.swing.JRadioButton rdKhong;
    private javax.swing.JRadioButton rdThanhToan;
    private javax.swing.JTable tbCHiTiet;
    private javax.swing.JTable tbGH;
    private javax.swing.JTable tbMauSac;
    private javax.swing.JTable tblChucVu;
    private javax.swing.JTable tblCuaHang;
    private javax.swing.JTable tblDongSP;
    private javax.swing.JTable tblGHCT;
    private javax.swing.JTable tblHDCT;
    private javax.swing.JTable tblKh;
    private javax.swing.JTable tblNSX;
    private javax.swing.JTable tblNV;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDCCH;
    private javax.swing.JTextField txtDCGH;
    private javax.swing.JTextField txtDCKH;
    private javax.swing.JTextField txtDiaChiNv;
    private javax.swing.JTextField txtDiachiHd;
    private javax.swing.JTextField txtDonGiaGHCT;
    private javax.swing.JTextField txtDonGiaHDCT;
    private javax.swing.JTextField txtDonGiaKHiGiam;
    private javax.swing.JTextField txtGiaNHap;
    private javax.swing.JTextField txtGioiTinh;
    private javax.swing.JTextField txtHoKH;
    private javax.swing.JTextField txtHoNV;
    private javax.swing.JTextField txtIDBC;
    private javax.swing.JTextField txtIDHDKh;
    private javax.swing.JTextField txtIdHDNV;
    private javax.swing.JTextField txtMKKH;
    private javax.swing.JTextField txtMaChucVu;
    private javax.swing.JTextField txtMaCuaHang;
    private javax.swing.JTextField txtMaDongSP;
    private javax.swing.JTextField txtMaGH;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNSX;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtMamau;
    private javax.swing.JTextField txtMatkhauNv;
    private javax.swing.JTextField txtMota;
    private javax.swing.JTextField txtNSinhNv;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtNgayNhaHD;
    private javax.swing.JTextField txtNgayShipHD;
    private javax.swing.JTextField txtNgaySinhKH;
    private javax.swing.JTextField txtNgayTTGH;
    private javax.swing.JTextField txtNgayTaoGH;
    private javax.swing.JTextField txtNgayTaohd;
    private javax.swing.JTextField txtNgayThanhToanHD;
    private javax.swing.JTextField txtQGKH;
    private javax.swing.JTextField txtQuocGiaCH;
    private javax.swing.JTextField txtSDTGH;
    private javax.swing.JTextField txtSDTKH;
    private javax.swing.JTextField txtSDTNV;
    private javax.swing.JTextField txtSDtHoaDon;
    private javax.swing.JTextField txtSOluong;
    private javax.swing.JTextField txtSoLuongGHCT;
    private javax.swing.JTextField txtSoLuongHDCT;
    private javax.swing.JTextField txtTNNGH;
    private javax.swing.JTextField txtTenChucVu;
    private javax.swing.JTextField txtTenCuaHang;
    private javax.swing.JTextField txtTenDemKH;
    private javax.swing.JTextField txtTenDemNV;
    private javax.swing.JTextField txtTenDongSP;
    private javax.swing.JTextField txtTenNSX;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtTenmau;
    private javax.swing.JTextField txtTennguoinha;
    private javax.swing.JTextField txtTpKH;
    private javax.swing.JTextField txtgiaBan;
    private javax.swing.JTextField txthanhPhoCH;
    private javax.swing.JTextField txtmaHD;
    private javax.swing.JTextField txttenKH;
    // End of variables declaration//GEN-END:variables
}
