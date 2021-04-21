/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author caueg
 */
public class TelaAlteExclProdutosView extends javax.swing.JFrame {

    /**
     * Creates new form telaCadastroClientesView
     */
    public TelaAlteExclProdutosView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSexoCliente = new javax.swing.ButtonGroup();
        pnlPrincipalAltExcClientes = new javax.swing.JPanel();
        pnlTituloAltExcClientes = new javax.swing.JPanel();
        lblTituloAltExcClientes = new javax.swing.JLabel();
        btnAlterarClientes = new javax.swing.JButton();
        btnExcluirClientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAltExcClientes = new javax.swing.JTable();
        lblInfoAltExcClientes = new javax.swing.JLabel();
        pnlItensProd = new javax.swing.JPanel();
        txtMarcaProd = new javax.swing.JTextField();
        lblTamanProd = new javax.swing.JLabel();
        cbbCorProd = new javax.swing.JComboBox<>();
        rdbModalidadeMasc = new javax.swing.JRadioButton();
        lblModalidade = new javax.swing.JLabel();
        txtPrecoProd = new javax.swing.JTextField();
        lblCorProd = new javax.swing.JLabel();
        txtIdProd = new javax.swing.JTextField();
        lblIModeloProd = new javax.swing.JLabel();
        rdbModalidadeFem = new javax.swing.JRadioButton();
        lblQuantProdVend = new javax.swing.JLabel();
        lblIdProd = new javax.swing.JLabel();
        lblMarcaProd = new javax.swing.JLabel();
        cbbTamanhoProd = new javax.swing.JComboBox<>();
        txtModeloProd = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtIdConsCli = new javax.swing.JTextField();
        lblNomeConsCli = new javax.swing.JLabel();
        txtNomeConsCli = new javax.swing.JTextField();
        btnConsutarClientes = new javax.swing.JButton();
        lblIdConsCli = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Alteração e Exclusão de Clientes");
        setAlwaysOnTop(true);

        pnlPrincipalAltExcClientes.setBackground(new java.awt.Color(0, 0, 0));
        pnlPrincipalAltExcClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pnlTituloAltExcClientes.setBackground(new java.awt.Color(204, 255, 204));

        lblTituloAltExcClientes.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTituloAltExcClientes.setForeground(new java.awt.Color(0, 0, 0));
        lblTituloAltExcClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloAltExcClientes.setText("Alteração e Exclusão de Produtos");

        javax.swing.GroupLayout pnlTituloAltExcClientesLayout = new javax.swing.GroupLayout(pnlTituloAltExcClientes);
        pnlTituloAltExcClientes.setLayout(pnlTituloAltExcClientesLayout);
        pnlTituloAltExcClientesLayout.setHorizontalGroup(
            pnlTituloAltExcClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloAltExcClientesLayout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addComponent(lblTituloAltExcClientes)
                .addGap(201, 201, 201))
        );
        pnlTituloAltExcClientesLayout.setVerticalGroup(
            pnlTituloAltExcClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloAltExcClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAltExcClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAlterarClientes.setBackground(new java.awt.Color(204, 255, 204));
        btnAlterarClientes.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btnAlterarClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnAlterarClientes.setText("Alterar");

        btnExcluirClientes.setBackground(new java.awt.Color(204, 255, 204));
        btnExcluirClientes.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        btnExcluirClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluirClientes.setText("Excluir");

        tblAltExcClientes.setBackground(new java.awt.Color(0, 0, 0));
        tblAltExcClientes.setForeground(new java.awt.Color(204, 255, 204));
        tblAltExcClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Modelo", "Modalidade", "Preço", "Cor", "Tamanho"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAltExcClientes.setToolTipText("");
        tblAltExcClientes.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tblAltExcClientes);

        lblInfoAltExcClientes.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        lblInfoAltExcClientes.setForeground(new java.awt.Color(204, 255, 204));
        lblInfoAltExcClientes.setText("Informe o ID ou a marca do produto para consulta");

        pnlItensProd.setBackground(new java.awt.Color(0, 0, 0));

        txtMarcaProd.setBackground(new java.awt.Color(204, 255, 204));
        txtMarcaProd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtMarcaProd.setForeground(new java.awt.Color(0, 0, 0));
        txtMarcaProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 1, true));

        lblTamanProd.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        lblTamanProd.setForeground(new java.awt.Color(204, 255, 204));
        lblTamanProd.setText("Tamanho:");

        cbbCorProd.setBackground(new java.awt.Color(204, 255, 204));
        cbbCorProd.setForeground(new java.awt.Color(0, 0, 0));
        cbbCorProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Vermelho", "Azul", "Preto", "Amarelo", "Laranja", "Verde", "Rosa", "Roxo", "Marrom", "Outros..." }));

        rdbModalidadeMasc.setBackground(new java.awt.Color(0, 0, 0));
        rdbModalidadeMasc.setForeground(new java.awt.Color(204, 255, 204));
        rdbModalidadeMasc.setText("Masculino");

        lblModalidade.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        lblModalidade.setForeground(new java.awt.Color(204, 255, 204));
        lblModalidade.setText("Modalidade:");

        txtPrecoProd.setBackground(new java.awt.Color(204, 255, 204));
        txtPrecoProd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPrecoProd.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecoProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 1, true));

        lblCorProd.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        lblCorProd.setForeground(new java.awt.Color(204, 255, 204));
        lblCorProd.setText("Cor:");

        txtIdProd.setBackground(new java.awt.Color(204, 255, 204));
        txtIdProd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtIdProd.setForeground(new java.awt.Color(0, 0, 0));
        txtIdProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 1, true));

        lblIModeloProd.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        lblIModeloProd.setForeground(new java.awt.Color(204, 255, 204));
        lblIModeloProd.setText("Modelo:");

        rdbModalidadeFem.setBackground(new java.awt.Color(0, 0, 0));
        rdbModalidadeFem.setForeground(new java.awt.Color(204, 255, 204));
        rdbModalidadeFem.setText("Feminino");
        rdbModalidadeFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbModalidadeFemActionPerformed(evt);
            }
        });

        lblQuantProdVend.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        lblQuantProdVend.setForeground(new java.awt.Color(204, 255, 204));
        lblQuantProdVend.setText("Preço:");

        lblIdProd.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        lblIdProd.setForeground(new java.awt.Color(204, 255, 204));
        lblIdProd.setText("ID Produto:");

        lblMarcaProd.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        lblMarcaProd.setForeground(new java.awt.Color(204, 255, 204));
        lblMarcaProd.setText("Marca:");

        cbbTamanhoProd.setBackground(new java.awt.Color(204, 255, 204));
        cbbTamanhoProd.setForeground(new java.awt.Color(0, 0, 0));
        cbbTamanhoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "33/34", "34/35", "35/36", "36/37", "37/38", "38/39", "39/40", "40/41", "41/42", "42/43", "43/44" }));

        txtModeloProd.setBackground(new java.awt.Color(204, 255, 204));
        txtModeloProd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtModeloProd.setForeground(new java.awt.Color(0, 0, 0));
        txtModeloProd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 1, true));

        javax.swing.GroupLayout pnlItensProdLayout = new javax.swing.GroupLayout(pnlItensProd);
        pnlItensProd.setLayout(pnlItensProdLayout);
        pnlItensProdLayout.setHorizontalGroup(
            pnlItensProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItensProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItensProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItensProdLayout.createSequentialGroup()
                        .addGroup(pnlItensProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlItensProdLayout.createSequentialGroup()
                                .addComponent(lblModalidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbModalidadeMasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbModalidadeFem))
                            .addGroup(pnlItensProdLayout.createSequentialGroup()
                                .addComponent(lblMarcaProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMarcaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlItensProdLayout.createSequentialGroup()
                                .addComponent(lblCorProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbCorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94)
                        .addGroup(pnlItensProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlItensProdLayout.createSequentialGroup()
                                .addComponent(lblIModeloProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtModeloProd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlItensProdLayout.createSequentialGroup()
                                .addGroup(pnlItensProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTamanProd)
                                    .addComponent(lblQuantProdVend))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlItensProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecoProd)
                                    .addComponent(cbbTamanhoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlItensProdLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(lblIdProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        pnlItensProdLayout.setVerticalGroup(
            pnlItensProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItensProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItensProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdProd)
                    .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlItensProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItensProdLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(pnlItensProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarcaProd)
                            .addComponent(txtMarcaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIModeloProd)
                            .addComponent(txtModeloProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(pnlItensProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModalidade)
                            .addComponent(txtPrecoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuantProdVend)
                            .addComponent(rdbModalidadeMasc)
                            .addComponent(rdbModalidadeFem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlItensProdLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlItensProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTamanProd)
                            .addComponent(lblCorProd)
                            .addComponent(cbbCorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbTamanhoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txtIdConsCli.setBackground(new java.awt.Color(204, 255, 204));
        txtIdConsCli.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtIdConsCli.setForeground(new java.awt.Color(0, 0, 0));
        txtIdConsCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 1, true));

        lblNomeConsCli.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        lblNomeConsCli.setForeground(new java.awt.Color(204, 255, 204));
        lblNomeConsCli.setText("Marca:");

        txtNomeConsCli.setBackground(new java.awt.Color(204, 255, 204));
        txtNomeConsCli.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNomeConsCli.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeConsCli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 204), 1, true));

        btnConsutarClientes.setBackground(new java.awt.Color(204, 255, 204));
        btnConsutarClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnConsutarClientes.setText("Consultar");
        btnConsutarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsutarClientesActionPerformed(evt);
            }
        });

        lblIdConsCli.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        lblIdConsCli.setForeground(new java.awt.Color(204, 255, 204));
        lblIdConsCli.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIdConsCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdConsCli, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174)
                .addComponent(lblNomeConsCli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeConsCli, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsutarClientes)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdConsCli)
                    .addComponent(txtIdConsCli, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomeConsCli)
                    .addComponent(txtNomeConsCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsutarClientes))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnConsutarClientes, txtIdConsCli, txtNomeConsCli});

        javax.swing.GroupLayout pnlPrincipalAltExcClientesLayout = new javax.swing.GroupLayout(pnlPrincipalAltExcClientes);
        pnlPrincipalAltExcClientes.setLayout(pnlPrincipalAltExcClientesLayout);
        pnlPrincipalAltExcClientesLayout.setHorizontalGroup(
            pnlPrincipalAltExcClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTituloAltExcClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPrincipalAltExcClientesLayout.createSequentialGroup()
                .addGroup(pnlPrincipalAltExcClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalAltExcClientesLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalAltExcClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalAltExcClientesLayout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(btnAlterarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addComponent(btnExcluirClientes))
                            .addGroup(pnlPrincipalAltExcClientesLayout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(lblInfoAltExcClientes)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlPrincipalAltExcClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlPrincipalAltExcClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalAltExcClientesLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(16, 16, 16)))))
                .addContainerGap())
            .addGroup(pnlPrincipalAltExcClientesLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(pnlItensProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPrincipalAltExcClientesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterarClientes, btnExcluirClientes});

        pnlPrincipalAltExcClientesLayout.setVerticalGroup(
            pnlPrincipalAltExcClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalAltExcClientesLayout.createSequentialGroup()
                .addComponent(pnlTituloAltExcClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInfoAltExcClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlItensProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(pnlPrincipalAltExcClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirClientes))
                .addGap(35, 35, 35))
        );

        pnlPrincipalAltExcClientesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAlterarClientes, btnExcluirClientes});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalAltExcClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalAltExcClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsutarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsutarClientesActionPerformed
        if(txtIdConsCli.getText().trim().equals("") || txtNomeConsCli.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Informe um dos parametros para cosulta");
        }
        else{
            if(txtIdConsCli.getText().trim().equals("")){
                String nomeCliConsul = txtNomeConsCli.getText();
            }
            else{
                int idCliCons = Integer.parseInt(txtNomeConsCli.getText());
            }
        }
    }//GEN-LAST:event_btnConsutarClientesActionPerformed

    private void rdbModalidadeFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbModalidadeFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbModalidadeFemActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlteExclProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlteExclProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlteExclProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlteExclProdutosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlteExclProdutosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgSexoCliente;
    private javax.swing.JButton btnAlterarClientes;
    private javax.swing.JButton btnConsutarClientes;
    private javax.swing.JButton btnExcluirClientes;
    private javax.swing.JComboBox<String> cbbCorProd;
    private javax.swing.JComboBox<String> cbbTamanhoProd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCorProd;
    private javax.swing.JLabel lblIModeloProd;
    private javax.swing.JLabel lblIdConsCli;
    private javax.swing.JLabel lblIdProd;
    private javax.swing.JLabel lblInfoAltExcClientes;
    private javax.swing.JLabel lblMarcaProd;
    private javax.swing.JLabel lblModalidade;
    private javax.swing.JLabel lblNomeConsCli;
    private javax.swing.JLabel lblQuantProdVend;
    private javax.swing.JLabel lblTamanProd;
    private javax.swing.JLabel lblTituloAltExcClientes;
    private javax.swing.JPanel pnlItensProd;
    private javax.swing.JPanel pnlPrincipalAltExcClientes;
    private javax.swing.JPanel pnlTituloAltExcClientes;
    private javax.swing.JRadioButton rdbModalidadeFem;
    private javax.swing.JRadioButton rdbModalidadeMasc;
    private javax.swing.JTable tblAltExcClientes;
    private javax.swing.JTextField txtIdConsCli;
    private javax.swing.JTextField txtIdProd;
    private javax.swing.JTextField txtMarcaProd;
    private javax.swing.JTextField txtModeloProd;
    private javax.swing.JTextField txtNomeConsCli;
    private javax.swing.JTextField txtPrecoProd;
    // End of variables declaration//GEN-END:variables
}
