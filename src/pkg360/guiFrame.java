package pkg360;

import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cdbitesky
 */
public class guiFrame extends javax.swing.JFrame {

    /**
     * Creates new form guiFrame
     */
    public guiFrame() {
        initComponents();
        
        //My collecting all the board elements into an array
        JLabel[][][] my_jlabelHolder = {
            {
                {jLabel1, jLabel2}, {jLabel3, jLabel4}, {jLabel5, jLabel6}, 
                {jLabel7, jLabel8}, {jLabel9, jLabel10}, {jLabel11, jLabel12}, 
                {jLabel13, jLabel14}, {jLabel15, jLabel16}, {jLabel17, jLabel18},
                {jLabel19, jLabel20}, {jLabel21, jLabel22}, {jLabel23, jLabel24},
                {jLabel25, jLabel26}, {jLabel27, jLabel28}, {jLabel29, jLabel30}
            },
            {
                {jLabel32, jLabel31}, {jLabel33, jLabel34}, {jLabel35, jLabel36}, 
                {jLabel37, jLabel38}, {jLabel39, jLabel40}, {jLabel41, jLabel42}, 
                {jLabel43, jLabel44}, {jLabel45, jLabel46}, {jLabel47, jLabel48},
                {jLabel49, jLabel50}, {jLabel51, jLabel52}, {jLabel53, jLabel54},
                {jLabel55, jLabel56}, {jLabel57, jLabel58}, {jLabel59, jLabel60}
            },
            {
                {jLabel61, jLabel62}, {jLabel63, jLabel64}, {jLabel65, jLabel66}, 
                {jLabel67, jLabel68}, {jLabel69, jLabel70}, {jLabel71, jLabel72}, 
                {jLabel73, jLabel74}, {jLabel75, jLabel76}, {jLabel77, jLabel78},
                {jLabel79, jLabel80}, {jLabel81, jLabel82}, {jLabel83, jLabel84},
                {jLabel85, jLabel86}, {jLabel87, jLabel88}, {jLabel89, jLabel90}
            },
            {
                {jLabel91, jLabel92}, {jLabel93, jLabel94}, {jLabel95, jLabel96}, 
                {jLabel97, jLabel98}, {jLabel99, jLabel100}, {jLabel101, jLabel102}, 
                {jLabel103, jLabel104}, {jLabel105, jLabel106}, {jLabel107, jLabel108},
                {jLabel109, jLabel110}, {jLabel111, jLabel112}, {jLabel113, jLabel114},
                {jLabel115, jLabel116}, {jLabel117, jLabel118}, {jLabel119, jLabel120}
            },
            {
                {jLabel121, jLabel122}, {jLabel123, jLabel124}, {jLabel125, jLabel126}, 
                {jLabel127, jLabel128}, {jLabel129, jLabel130}, {jLabel131, jLabel132}, 
                {jLabel133, jLabel134}, {jLabel135, jLabel136}, {jLabel137, jLabel138},
                {jLabel139, jLabel140}, {jLabel141, jLabel142}, {jLabel143, jLabel144},
                {jLabel145, jLabel146}, {jLabel147, jLabel148}, {jLabel149, jLabel150}
            },
            {
                {jLabel151, jLabel152}, {jLabel153, jLabel154}, {jLabel155, jLabel156}, 
                {jLabel157, jLabel158}, {jLabel159, jLabel160}, {jLabel161, jLabel162}, 
                {jLabel163, jLabel164}, {jLabel165, jLabel166}, {jLabel167, jLabel168},
                {jLabel169, jLabel170}, {jLabel171, jLabel172}, {jLabel173, jLabel174},
                {jLabel175, jLabel176}, {jLabel177, jLabel178}, {jLabel179, jLabel180}
            },
            {
                {jLabel181, jLabel182}, {jLabel183, jLabel184}, {jLabel185, jLabel186}, 
                {jLabel187, jLabel188}, {jLabel379, jLabel380}, {jLabel189, jLabel190},
                {jLabel191, jLabel192}, {jLabel193, jLabel194}, {jLabel383, jLabel384},
                {jLabel195, jLabel196}, {jLabel385, jLabel386}, {jLabel197, jLabel198},
                {jLabel387, jLabel388}, {jLabel199, jLabel200}, {jLabel201, jLabel202}
            },
            {
                {jLabel203, jLabel204}, {jLabel375, jLabel376}, {jLabel205, jLabel206},
                {jLabel377, jLabel378}, {jLabel207, jLabel208}, {jLabel381, jLabel382},
                {jLabel209, jLabel210}, {jLabel211, jLabel212}, {jLabel213, jLabel214},
                {jLabel215, jLabel216}, {jLabel217, jLabel218}, {jLabel219, jLabel220},
                {jLabel221, jLabel222}, {jLabel389, jLabel390}, {jLabel223, jLabel224}
            },
            {
                {jLabel225, jLabel226}, {jLabel399, jLabel400}, {jLabel227, jLabel228},
                {jLabel397, jLabel398}, {jLabel229, jLabel230}, {jLabel231, jLabel232},
                {jLabel395, jLabel396}, {jLabel233, jLabel234}, {jLabel393, jLabel394},
                {jLabel235, jLabel236}, {jLabel237, jLabel238}, {jLabel239, jLabel240},
                {jLabel391, jLabel392}, {jLabel241, jLabel242}, {jLabel243, jLabel244}
            },
            {
                {jLabel245, jLabel246}, {jLabel247, jLabel248}, {jLabel249, jLabel250},
                {jLabel251, jLabel252}, {jLabel253, jLabel254}, {jLabel401, jLabel402},
                {jLabel255, jLabel256}, {jLabel403, jLabel404}, {jLabel257, jLabel258},
                {jLabel405, jLabel406}, {jLabel259, jLabel260}, {jLabel407, jLabel408},
                {jLabel261, jLabel262}, {jLabel263, jLabel264}, {jLabel265, jLabel266}
            },
            {
                {jLabel425, jLabel426}, {jLabel267, jLabel268}, {jLabel269, jLabel270},
                {jLabel419, jLabel420}, {jLabel271, jLabel272}, {jLabel417, jLabel418},
                {jLabel273, jLabel274}, {jLabel415, jLabel416}, {jLabel275, jLabel276},
                {jLabel277, jLabel278}, {jLabel279, jLabel280}, {jLabel409, jLabel410},
                {jLabel281, jLabel282}, {jLabel283, jLabel284}, {jLabel285, jLabel286}
            },
            {
                {jLabel427, jLabel428}, {jLabel287, jLabel288}, {jLabel289, jLabel290},
                {jLabel421, jLabel422}, {jLabel291, jLabel292}, {jLabel293, jLabel294},
                {jLabel295, jLabel296}, {jLabel297, jLabel298}, {jLabel299, jLabel300},
                {jLabel301, jLabel302}, {jLabel413, jLabel414}, {jLabel303, jLabel304},
                {jLabel411, jLabel412}, {jLabel305, jLabel306}, {jLabel307, jLabel308}
            },
            {
                {jLabel309, jLabel310}, {jLabel311, jLabel312}, {jLabel313, jLabel314},
                {jLabel423, jLabel424}, {jLabel315, jLabel316}, {jLabel317, jLabel318},
                {jLabel429, jLabel430}, {jLabel319, jLabel320}, {jLabel321, jLabel322},
                {jLabel431, jLabel432}, {jLabel323, jLabel324}, {jLabel325, jLabel326},
                {jLabel327, jLabel328}, {jLabel329, jLabel330}, {jLabel433, jLabel434}
            },
            {
                {jLabel331, jLabel332}, {jLabel333, jLabel334}, {jLabel447, jLabel448},
                {jLabel335, jLabel336}, {jLabel337, jLabel338}, {jLabel339, jLabel340},
                {jLabel443, jLabel444}, {jLabel341, jLabel342}, {jLabel343, jLabel344},
                {jLabel345, jLabel346}, {jLabel437, jLabel438}, {jLabel347, jLabel348},
                {jLabel349, jLabel350}, {jLabel351, jLabel352}, {jLabel435, jLabel436} 
            },
            {
                {jLabel353, jLabel354}, {jLabel449, jLabel450}, {jLabel355, jLabel356},
                {jLabel445, jLabel446}, {jLabel357, jLabel358}, {jLabel359, jLabel360},
                {jLabel361, jLabel362}, {jLabel363, jLabel364}, {jLabel365, jLabel366},
                {jLabel367, jLabel368}, {jLabel441, jLabel442}, {jLabel369, jLabel370},
                {jLabel439, jLabel440}, {jLabel371, jLabel372}, {jLabel373, jLabel374}
            }
        };
        JPanel[][] panelHolder = { 
            {jPanel2, jPanel3, jPanel4, jPanel5, jPanel6, jPanel7, 
            jPanel8, jPanel9, jPanel10, jPanel11, jPanel12, jPanel13, 
            jPanel14, jPanel15, jPanel16},
            {jPanel17, jPanel18, jPanel19, 
            jPanel20, jPanel21, jPanel22, jPanel23, jPanel24, jPanel25, 
            jPanel26, jPanel27, jPanel28, jPanel29, jPanel30, jPanel31}, 
            {jPanel32, jPanel33, jPanel34, jPanel35, jPanel36, jPanel37, 
            jPanel38, jPanel39, jPanel40, jPanel41, jPanel42, jPanel43, 
            jPanel44, jPanel45, jPanel46}, 
            {jPanel47, jPanel48, jPanel49, 
            jPanel50, jPanel51, jPanel52, jPanel53, jPanel54, jPanel55, 
            jPanel56, jPanel57, jPanel58, jPanel59, jPanel60, jPanel61}, 
            {jPanel62, jPanel63, jPanel64, jPanel65, jPanel66, jPanel67, 
            jPanel68, jPanel69, jPanel70, jPanel71, jPanel72, jPanel73, 
            jPanel74, jPanel75, jPanel76}, 
            {jPanel77, jPanel78, jPanel79, 
            jPanel80, jPanel81, jPanel82, jPanel83, jPanel84, jPanel85, 
            jPanel86, jPanel87, jPanel88, jPanel89, jPanel90, jPanel91}, 
            {jPanel92, jPanel93, jPanel94, jPanel95, jPanel96, jPanel97, 
            jPanel98, jPanel99, jPanel100, jPanel101, jPanel102, jPanel103, 
            jPanel104, jPanel105, jPanel106}, 
            {jPanel107, jPanel108, 
            jPanel109, jPanel110, jPanel111, jPanel112, jPanel113, 
            jPanel114, jPanel115, jPanel116, jPanel117, jPanel118, jPanel119, 
            jPanel120, jPanel121}, 
            {jPanel122, jPanel123, jPanel124, jPanel125, 
            jPanel126, jPanel127, jPanel128, jPanel129, jPanel130, jPanel131, 
            jPanel132, jPanel133, jPanel134, jPanel135, jPanel136}, 
            {jPanel137, 
            jPanel138, jPanel139, jPanel140, jPanel141, jPanel142, jPanel143, 
            jPanel144, jPanel145, jPanel146, jPanel147, jPanel148, jPanel149, 
            jPanel150, jPanel151}, 
            {jPanel152, jPanel153, jPanel154, jPanel155, 
            jPanel156, jPanel157, jPanel158, jPanel159, jPanel160, jPanel161, 
            jPanel162, jPanel163, jPanel164, jPanel165, jPanel166}, 
            {jPanel167, 
            jPanel168, jPanel169, jPanel170, jPanel171, jPanel172, jPanel173, 
            jPanel174, jPanel175, jPanel176, jPanel177, jPanel178, jPanel179, 
            jPanel180, jPanel181}, 
            {jPanel182, jPanel183, jPanel184, jPanel185, 
            jPanel186, jPanel187, jPanel188, jPanel189, jPanel190, jPanel191, 
            jPanel192, jPanel193, jPanel194, jPanel195, jPanel196}, 
            {jPanel197, 
            jPanel198, jPanel199, jPanel200, jPanel201, jPanel202, jPanel203, 
            jPanel204, jPanel205, jPanel206, jPanel207, jPanel208, jPanel209, 
            jPanel210, jPanel211}, 
            {jPanel212, jPanel213, jPanel214, jPanel215, 
            jPanel216, jPanel217, jPanel218, jPanel219, jPanel220, jPanel221, 
            jPanel222, jPanel223, jPanel224, jPanel225, jPanel226}
        };
        Data d = Data.getInstance();
        Board b_ = new Board(my_jlabelHolder);
        b_.init(panelHolder);
        d.board_= b_;
        //d.board_.init();
        //*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jPanel76 = new javax.swing.JPanel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jPanel78 = new javax.swing.JPanel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jPanel79 = new javax.swing.JPanel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jPanel80 = new javax.swing.JPanel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jPanel81 = new javax.swing.JPanel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jPanel82 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jPanel83 = new javax.swing.JPanel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jPanel85 = new javax.swing.JPanel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jPanel86 = new javax.swing.JPanel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jPanel87 = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jPanel88 = new javax.swing.JPanel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jPanel89 = new javax.swing.JPanel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jPanel90 = new javax.swing.JPanel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jPanel91 = new javax.swing.JPanel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jPanel92 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jPanel93 = new javax.swing.JPanel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jPanel94 = new javax.swing.JPanel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jPanel95 = new javax.swing.JPanel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jPanel96 = new javax.swing.JPanel();
        jLabel379 = new javax.swing.JLabel();
        jLabel380 = new javax.swing.JLabel();
        jPanel97 = new javax.swing.JPanel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jPanel98 = new javax.swing.JPanel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jPanel99 = new javax.swing.JPanel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jPanel100 = new javax.swing.JPanel();
        jLabel383 = new javax.swing.JLabel();
        jLabel384 = new javax.swing.JLabel();
        jPanel101 = new javax.swing.JPanel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jPanel102 = new javax.swing.JPanel();
        jLabel385 = new javax.swing.JLabel();
        jLabel386 = new javax.swing.JLabel();
        jPanel103 = new javax.swing.JPanel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jPanel104 = new javax.swing.JPanel();
        jLabel387 = new javax.swing.JLabel();
        jLabel388 = new javax.swing.JLabel();
        jPanel105 = new javax.swing.JPanel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jPanel106 = new javax.swing.JPanel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jPanel107 = new javax.swing.JPanel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jPanel108 = new javax.swing.JPanel();
        jLabel375 = new javax.swing.JLabel();
        jLabel376 = new javax.swing.JLabel();
        jPanel109 = new javax.swing.JPanel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jPanel110 = new javax.swing.JPanel();
        jLabel377 = new javax.swing.JLabel();
        jLabel378 = new javax.swing.JLabel();
        jPanel111 = new javax.swing.JPanel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jPanel112 = new javax.swing.JPanel();
        jLabel381 = new javax.swing.JLabel();
        jLabel382 = new javax.swing.JLabel();
        jPanel113 = new javax.swing.JPanel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jPanel114 = new javax.swing.JPanel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jPanel115 = new javax.swing.JPanel();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jPanel116 = new javax.swing.JPanel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jPanel117 = new javax.swing.JPanel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jPanel118 = new javax.swing.JPanel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jPanel119 = new javax.swing.JPanel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jPanel120 = new javax.swing.JPanel();
        jLabel389 = new javax.swing.JLabel();
        jLabel390 = new javax.swing.JLabel();
        jPanel121 = new javax.swing.JPanel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jPanel122 = new javax.swing.JPanel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jPanel123 = new javax.swing.JPanel();
        jLabel399 = new javax.swing.JLabel();
        jLabel400 = new javax.swing.JLabel();
        jPanel124 = new javax.swing.JPanel();
        jLabel227 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jPanel125 = new javax.swing.JPanel();
        jLabel397 = new javax.swing.JLabel();
        jLabel398 = new javax.swing.JLabel();
        jPanel126 = new javax.swing.JPanel();
        jLabel229 = new javax.swing.JLabel();
        jLabel230 = new javax.swing.JLabel();
        jPanel127 = new javax.swing.JPanel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jPanel128 = new javax.swing.JPanel();
        jLabel395 = new javax.swing.JLabel();
        jLabel396 = new javax.swing.JLabel();
        jPanel129 = new javax.swing.JPanel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jPanel130 = new javax.swing.JPanel();
        jLabel393 = new javax.swing.JLabel();
        jLabel394 = new javax.swing.JLabel();
        jPanel131 = new javax.swing.JPanel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jPanel132 = new javax.swing.JPanel();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jPanel133 = new javax.swing.JPanel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        jPanel134 = new javax.swing.JPanel();
        jLabel391 = new javax.swing.JLabel();
        jLabel392 = new javax.swing.JLabel();
        jPanel135 = new javax.swing.JPanel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jPanel136 = new javax.swing.JPanel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jPanel137 = new javax.swing.JPanel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jPanel138 = new javax.swing.JPanel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jPanel139 = new javax.swing.JPanel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jPanel140 = new javax.swing.JPanel();
        jLabel251 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jPanel141 = new javax.swing.JPanel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jPanel142 = new javax.swing.JPanel();
        jLabel401 = new javax.swing.JLabel();
        jLabel402 = new javax.swing.JLabel();
        jPanel143 = new javax.swing.JPanel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jPanel144 = new javax.swing.JPanel();
        jLabel403 = new javax.swing.JLabel();
        jLabel404 = new javax.swing.JLabel();
        jPanel145 = new javax.swing.JPanel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jPanel146 = new javax.swing.JPanel();
        jLabel405 = new javax.swing.JLabel();
        jLabel406 = new javax.swing.JLabel();
        jPanel147 = new javax.swing.JPanel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jPanel148 = new javax.swing.JPanel();
        jLabel407 = new javax.swing.JLabel();
        jLabel408 = new javax.swing.JLabel();
        jPanel149 = new javax.swing.JPanel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jPanel150 = new javax.swing.JPanel();
        jLabel263 = new javax.swing.JLabel();
        jLabel264 = new javax.swing.JLabel();
        jPanel151 = new javax.swing.JPanel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jPanel152 = new javax.swing.JPanel();
        jLabel425 = new javax.swing.JLabel();
        jLabel426 = new javax.swing.JLabel();
        jPanel153 = new javax.swing.JPanel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jPanel154 = new javax.swing.JPanel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jPanel155 = new javax.swing.JPanel();
        jLabel419 = new javax.swing.JLabel();
        jLabel420 = new javax.swing.JLabel();
        jPanel156 = new javax.swing.JPanel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jPanel157 = new javax.swing.JPanel();
        jLabel417 = new javax.swing.JLabel();
        jLabel418 = new javax.swing.JLabel();
        jPanel158 = new javax.swing.JPanel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jPanel159 = new javax.swing.JPanel();
        jLabel415 = new javax.swing.JLabel();
        jLabel416 = new javax.swing.JLabel();
        jPanel160 = new javax.swing.JPanel();
        jLabel275 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jPanel161 = new javax.swing.JPanel();
        jLabel277 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jPanel162 = new javax.swing.JPanel();
        jLabel279 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jPanel163 = new javax.swing.JPanel();
        jLabel409 = new javax.swing.JLabel();
        jLabel410 = new javax.swing.JLabel();
        jPanel164 = new javax.swing.JPanel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jPanel165 = new javax.swing.JPanel();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jPanel166 = new javax.swing.JPanel();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jPanel167 = new javax.swing.JPanel();
        jLabel427 = new javax.swing.JLabel();
        jLabel428 = new javax.swing.JLabel();
        jPanel168 = new javax.swing.JPanel();
        jLabel287 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jPanel169 = new javax.swing.JPanel();
        jLabel289 = new javax.swing.JLabel();
        jLabel290 = new javax.swing.JLabel();
        jPanel170 = new javax.swing.JPanel();
        jLabel421 = new javax.swing.JLabel();
        jLabel422 = new javax.swing.JLabel();
        jPanel171 = new javax.swing.JPanel();
        jLabel291 = new javax.swing.JLabel();
        jLabel292 = new javax.swing.JLabel();
        jPanel172 = new javax.swing.JPanel();
        jLabel293 = new javax.swing.JLabel();
        jLabel294 = new javax.swing.JLabel();
        jPanel173 = new javax.swing.JPanel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jPanel174 = new javax.swing.JPanel();
        jLabel297 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jPanel175 = new javax.swing.JPanel();
        jLabel299 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        jPanel176 = new javax.swing.JPanel();
        jLabel301 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        jPanel177 = new javax.swing.JPanel();
        jLabel413 = new javax.swing.JLabel();
        jLabel414 = new javax.swing.JLabel();
        jPanel178 = new javax.swing.JPanel();
        jLabel303 = new javax.swing.JLabel();
        jLabel304 = new javax.swing.JLabel();
        jPanel179 = new javax.swing.JPanel();
        jLabel411 = new javax.swing.JLabel();
        jLabel412 = new javax.swing.JLabel();
        jPanel180 = new javax.swing.JPanel();
        jLabel305 = new javax.swing.JLabel();
        jLabel306 = new javax.swing.JLabel();
        jPanel181 = new javax.swing.JPanel();
        jLabel307 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jPanel182 = new javax.swing.JPanel();
        jLabel309 = new javax.swing.JLabel();
        jLabel310 = new javax.swing.JLabel();
        jPanel183 = new javax.swing.JPanel();
        jLabel311 = new javax.swing.JLabel();
        jLabel312 = new javax.swing.JLabel();
        jPanel184 = new javax.swing.JPanel();
        jLabel313 = new javax.swing.JLabel();
        jLabel314 = new javax.swing.JLabel();
        jPanel185 = new javax.swing.JPanel();
        jLabel423 = new javax.swing.JLabel();
        jLabel424 = new javax.swing.JLabel();
        jPanel186 = new javax.swing.JPanel();
        jLabel315 = new javax.swing.JLabel();
        jLabel316 = new javax.swing.JLabel();
        jPanel187 = new javax.swing.JPanel();
        jLabel317 = new javax.swing.JLabel();
        jLabel318 = new javax.swing.JLabel();
        jPanel188 = new javax.swing.JPanel();
        jLabel429 = new javax.swing.JLabel();
        jLabel430 = new javax.swing.JLabel();
        jPanel189 = new javax.swing.JPanel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jPanel190 = new javax.swing.JPanel();
        jLabel321 = new javax.swing.JLabel();
        jLabel322 = new javax.swing.JLabel();
        jPanel191 = new javax.swing.JPanel();
        jLabel431 = new javax.swing.JLabel();
        jLabel432 = new javax.swing.JLabel();
        jPanel192 = new javax.swing.JPanel();
        jLabel323 = new javax.swing.JLabel();
        jLabel324 = new javax.swing.JLabel();
        jPanel193 = new javax.swing.JPanel();
        jLabel325 = new javax.swing.JLabel();
        jLabel326 = new javax.swing.JLabel();
        jPanel194 = new javax.swing.JPanel();
        jLabel327 = new javax.swing.JLabel();
        jLabel328 = new javax.swing.JLabel();
        jPanel195 = new javax.swing.JPanel();
        jLabel329 = new javax.swing.JLabel();
        jLabel330 = new javax.swing.JLabel();
        jPanel196 = new javax.swing.JPanel();
        jLabel433 = new javax.swing.JLabel();
        jLabel434 = new javax.swing.JLabel();
        jPanel197 = new javax.swing.JPanel();
        jLabel331 = new javax.swing.JLabel();
        jLabel332 = new javax.swing.JLabel();
        jPanel198 = new javax.swing.JPanel();
        jLabel333 = new javax.swing.JLabel();
        jLabel334 = new javax.swing.JLabel();
        jPanel199 = new javax.swing.JPanel();
        jLabel447 = new javax.swing.JLabel();
        jLabel448 = new javax.swing.JLabel();
        jPanel200 = new javax.swing.JPanel();
        jLabel335 = new javax.swing.JLabel();
        jLabel336 = new javax.swing.JLabel();
        jPanel201 = new javax.swing.JPanel();
        jLabel337 = new javax.swing.JLabel();
        jLabel338 = new javax.swing.JLabel();
        jPanel202 = new javax.swing.JPanel();
        jLabel339 = new javax.swing.JLabel();
        jLabel340 = new javax.swing.JLabel();
        jPanel203 = new javax.swing.JPanel();
        jLabel443 = new javax.swing.JLabel();
        jLabel444 = new javax.swing.JLabel();
        jPanel204 = new javax.swing.JPanel();
        jLabel341 = new javax.swing.JLabel();
        jLabel342 = new javax.swing.JLabel();
        jPanel205 = new javax.swing.JPanel();
        jLabel343 = new javax.swing.JLabel();
        jLabel344 = new javax.swing.JLabel();
        jPanel206 = new javax.swing.JPanel();
        jLabel345 = new javax.swing.JLabel();
        jLabel346 = new javax.swing.JLabel();
        jPanel207 = new javax.swing.JPanel();
        jLabel437 = new javax.swing.JLabel();
        jLabel438 = new javax.swing.JLabel();
        jPanel208 = new javax.swing.JPanel();
        jLabel347 = new javax.swing.JLabel();
        jLabel348 = new javax.swing.JLabel();
        jPanel209 = new javax.swing.JPanel();
        jLabel349 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();
        jPanel210 = new javax.swing.JPanel();
        jLabel351 = new javax.swing.JLabel();
        jLabel352 = new javax.swing.JLabel();
        jPanel211 = new javax.swing.JPanel();
        jLabel435 = new javax.swing.JLabel();
        jLabel436 = new javax.swing.JLabel();
        jPanel212 = new javax.swing.JPanel();
        jLabel353 = new javax.swing.JLabel();
        jLabel354 = new javax.swing.JLabel();
        jPanel213 = new javax.swing.JPanel();
        jLabel449 = new javax.swing.JLabel();
        jLabel450 = new javax.swing.JLabel();
        jPanel214 = new javax.swing.JPanel();
        jLabel355 = new javax.swing.JLabel();
        jLabel356 = new javax.swing.JLabel();
        jPanel215 = new javax.swing.JPanel();
        jLabel445 = new javax.swing.JLabel();
        jLabel446 = new javax.swing.JLabel();
        jPanel216 = new javax.swing.JPanel();
        jLabel357 = new javax.swing.JLabel();
        jLabel358 = new javax.swing.JLabel();
        jPanel217 = new javax.swing.JPanel();
        jLabel359 = new javax.swing.JLabel();
        jLabel360 = new javax.swing.JLabel();
        jPanel218 = new javax.swing.JPanel();
        jLabel361 = new javax.swing.JLabel();
        jLabel362 = new javax.swing.JLabel();
        jPanel219 = new javax.swing.JPanel();
        jLabel363 = new javax.swing.JLabel();
        jLabel364 = new javax.swing.JLabel();
        jPanel220 = new javax.swing.JPanel();
        jLabel365 = new javax.swing.JLabel();
        jLabel366 = new javax.swing.JLabel();
        jPanel221 = new javax.swing.JPanel();
        jLabel367 = new javax.swing.JLabel();
        jLabel368 = new javax.swing.JLabel();
        jPanel222 = new javax.swing.JPanel();
        jLabel441 = new javax.swing.JLabel();
        jLabel442 = new javax.swing.JLabel();
        jPanel223 = new javax.swing.JPanel();
        jLabel369 = new javax.swing.JLabel();
        jLabel370 = new javax.swing.JLabel();
        jPanel224 = new javax.swing.JPanel();
        jLabel439 = new javax.swing.JLabel();
        jLabel440 = new javax.swing.JLabel();
        jPanel225 = new javax.swing.JPanel();
        jLabel371 = new javax.swing.JLabel();
        jLabel372 = new javax.swing.JLabel();
        jPanel226 = new javax.swing.JPanel();
        jLabel373 = new javax.swing.JLabel();
        jLabel374 = new javax.swing.JLabel();
        jPanel227 = new javax.swing.JPanel();
        jLabel451 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel452 = new javax.swing.JLabel();
        jLabel453 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel454 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel455 = new javax.swing.JLabel();
        buttonSaveGame = new javax.swing.JButton();
        buttonScoreGame = new javax.swing.JButton();
        buttonQuitAndSave = new javax.swing.JButton();
        buttonNewGame = new javax.swing.JButton();
        buttonViewStats = new javax.swing.JButton();
        buttonQUIT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(15, 15, 2, 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("1");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel2, java.awt.BorderLayout.NORTH);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("A");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("B");
        jPanel3.add(jLabel3, java.awt.BorderLayout.CENTER);

        jLabel4.setText("2");
        jPanel3.add(jLabel4, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("A");
        jPanel4.add(jLabel5, java.awt.BorderLayout.CENTER);

        jLabel6.setText("1");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel6, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("A");
        jPanel5.add(jLabel7, java.awt.BorderLayout.CENTER);

        jLabel8.setText("4");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel8, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("A");
        jPanel6.add(jLabel9, java.awt.BorderLayout.CENTER);

        jLabel10.setText("1");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel6.add(jLabel10, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("A");
        jPanel7.add(jLabel11, java.awt.BorderLayout.CENTER);

        jLabel12.setText("6");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel7.add(jLabel12, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("A");
        jPanel8.add(jLabel13, java.awt.BorderLayout.CENTER);

        jLabel14.setText("1");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel8.add(jLabel14, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("A");
        jPanel9.add(jLabel15, java.awt.BorderLayout.CENTER);

        jLabel16.setText("8");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel9.add(jLabel16, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("A");
        jPanel10.add(jLabel17, java.awt.BorderLayout.CENTER);

        jLabel18.setText("1");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel18.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel10.add(jLabel18, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("A");
        jPanel11.add(jLabel19, java.awt.BorderLayout.CENTER);

        jLabel20.setText("10");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel20.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel11.add(jLabel20, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("A");
        jPanel12.add(jLabel21, java.awt.BorderLayout.CENTER);

        jLabel22.setText("1");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel22.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel12.add(jLabel22, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("A");
        jPanel13.add(jLabel23, java.awt.BorderLayout.CENTER);

        jLabel24.setText("12");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel24.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel13.add(jLabel24, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("A");
        jPanel14.add(jLabel25, java.awt.BorderLayout.CENTER);

        jLabel26.setText("1");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel26.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel14.add(jLabel26, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("A");
        jPanel15.add(jLabel27, java.awt.BorderLayout.CENTER);

        jLabel28.setText("14");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel28.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel15.add(jLabel28, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("A");
        jPanel16.add(jLabel29, java.awt.BorderLayout.CENTER);

        jLabel30.setText("15");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel30.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel16.add(jLabel30, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("A");
        jPanel17.add(jLabel31, java.awt.BorderLayout.CENTER);

        jLabel32.setText("2");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel32.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel17.add(jLabel32, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("A");
        jPanel18.add(jLabel33, java.awt.BorderLayout.CENTER);

        jLabel34.setText("1");
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel34.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel18.add(jLabel34, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("A");
        jPanel19.add(jLabel35, java.awt.BorderLayout.CENTER);

        jLabel36.setText("1");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel36.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel19.add(jLabel36, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("A");
        jPanel20.add(jLabel37, java.awt.BorderLayout.CENTER);

        jLabel38.setText("1");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel38.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel20.add(jLabel38, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("A");
        jPanel21.add(jLabel39, java.awt.BorderLayout.CENTER);

        jLabel40.setText("1");
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel40.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel21.add(jLabel40, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("A");
        jPanel22.add(jLabel41, java.awt.BorderLayout.CENTER);

        jLabel42.setText("1");
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel42.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel22.add(jLabel42, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("A");
        jPanel23.add(jLabel43, java.awt.BorderLayout.CENTER);

        jLabel44.setText("1");
        jLabel44.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel44.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel23.add(jLabel44, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel23);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new java.awt.BorderLayout());

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("A");
        jPanel24.add(jLabel45, java.awt.BorderLayout.CENTER);

        jLabel46.setText("1");
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel46.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel24.add(jLabel46, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setLayout(new java.awt.BorderLayout());

        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("A");
        jPanel25.add(jLabel47, java.awt.BorderLayout.CENTER);

        jLabel48.setText("1");
        jLabel48.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel48.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel25.add(jLabel48, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new java.awt.BorderLayout());

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("A");
        jPanel26.add(jLabel49, java.awt.BorderLayout.CENTER);

        jLabel50.setText("1");
        jLabel50.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel50.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel26.add(jLabel50, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel26);

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setLayout(new java.awt.BorderLayout());

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("A");
        jPanel27.add(jLabel51, java.awt.BorderLayout.CENTER);

        jLabel52.setText("1");
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel52.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel27.add(jLabel52, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel27);

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setLayout(new java.awt.BorderLayout());

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("A");
        jPanel28.add(jLabel53, java.awt.BorderLayout.CENTER);

        jLabel54.setText("1");
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel54.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel28.add(jLabel54, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel28);

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setLayout(new java.awt.BorderLayout());

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("A");
        jPanel29.add(jLabel55, java.awt.BorderLayout.CENTER);

        jLabel56.setText("1");
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel56.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel29.add(jLabel56, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel29);

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setLayout(new java.awt.BorderLayout());

        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("A");
        jPanel30.add(jLabel57, java.awt.BorderLayout.CENTER);

        jLabel58.setText("1");
        jLabel58.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel58.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel30.add(jLabel58, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel30);

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setLayout(new java.awt.BorderLayout());

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("A");
        jPanel31.add(jLabel59, java.awt.BorderLayout.CENTER);

        jLabel60.setText("1");
        jLabel60.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel60.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel31.add(jLabel60, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel31);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(new java.awt.BorderLayout());

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("A");
        jPanel32.add(jLabel61, java.awt.BorderLayout.CENTER);

        jLabel62.setText("3");
        jLabel62.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel62.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel32.add(jLabel62, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel32);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setLayout(new java.awt.BorderLayout());

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("A");
        jPanel33.add(jLabel63, java.awt.BorderLayout.CENTER);

        jLabel64.setText("1");
        jLabel64.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel64.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel33.add(jLabel64, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel33);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));
        jPanel34.setLayout(new java.awt.BorderLayout());

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("A");
        jPanel34.add(jLabel65, java.awt.BorderLayout.CENTER);

        jLabel66.setText("1");
        jLabel66.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel66.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel34.add(jLabel66, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel34);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setLayout(new java.awt.BorderLayout());

        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("A");
        jPanel35.add(jLabel67, java.awt.BorderLayout.CENTER);

        jLabel68.setText("1");
        jLabel68.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel68.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel35.add(jLabel68, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel35);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setLayout(new java.awt.BorderLayout());

        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("A");
        jPanel36.add(jLabel69, java.awt.BorderLayout.CENTER);

        jLabel70.setText("1");
        jLabel70.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel70.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel36.add(jLabel70, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel36);

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setLayout(new java.awt.BorderLayout());

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("A");
        jPanel37.add(jLabel71, java.awt.BorderLayout.CENTER);

        jLabel72.setText("1");
        jLabel72.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel72.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel37.add(jLabel72, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel37);

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));
        jPanel38.setLayout(new java.awt.BorderLayout());

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("A");
        jPanel38.add(jLabel73, java.awt.BorderLayout.CENTER);

        jLabel74.setText("1");
        jLabel74.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel74.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel38.add(jLabel74, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel38);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setLayout(new java.awt.BorderLayout());

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("A");
        jPanel39.add(jLabel75, java.awt.BorderLayout.CENTER);

        jLabel76.setText("1");
        jLabel76.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel76.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel39.add(jLabel76, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel39);

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setLayout(new java.awt.BorderLayout());

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("A");
        jPanel40.add(jLabel77, java.awt.BorderLayout.CENTER);

        jLabel78.setText("1");
        jLabel78.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel78.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel40.add(jLabel78, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel40);

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setLayout(new java.awt.BorderLayout());

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("A");
        jPanel41.add(jLabel79, java.awt.BorderLayout.CENTER);

        jLabel80.setText("1");
        jLabel80.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel80.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel41.add(jLabel80, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel41);

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setLayout(new java.awt.BorderLayout());

        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("A");
        jPanel42.add(jLabel81, java.awt.BorderLayout.CENTER);

        jLabel82.setText("1");
        jLabel82.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel82.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel42.add(jLabel82, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel42);

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setLayout(new java.awt.BorderLayout());

        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("A");
        jPanel43.add(jLabel83, java.awt.BorderLayout.CENTER);

        jLabel84.setText("1");
        jLabel84.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel84.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel43.add(jLabel84, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel43);

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setLayout(new java.awt.BorderLayout());

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("A");
        jPanel44.add(jLabel85, java.awt.BorderLayout.CENTER);

        jLabel86.setText("1");
        jLabel86.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel86.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel44.add(jLabel86, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel44);

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setLayout(new java.awt.BorderLayout());

        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("A");
        jPanel45.add(jLabel87, java.awt.BorderLayout.CENTER);

        jLabel88.setText("1");
        jLabel88.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel88.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel45.add(jLabel88, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel45);

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setLayout(new java.awt.BorderLayout());

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("A");
        jPanel46.add(jLabel89, java.awt.BorderLayout.CENTER);

        jLabel90.setText("1");
        jLabel90.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel90.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel46.add(jLabel90, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel46);

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setLayout(new java.awt.BorderLayout());

        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("A");
        jPanel47.add(jLabel91, java.awt.BorderLayout.CENTER);

        jLabel92.setText("4");
        jLabel92.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel92.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel47.add(jLabel92, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel47);

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setLayout(new java.awt.BorderLayout());

        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("A");
        jPanel48.add(jLabel93, java.awt.BorderLayout.CENTER);

        jLabel94.setText("1");
        jLabel94.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel94.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel48.add(jLabel94, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel48);

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setLayout(new java.awt.BorderLayout());

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("A");
        jPanel49.add(jLabel97, java.awt.BorderLayout.CENTER);

        jLabel98.setText("1");
        jLabel98.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel98.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel49.add(jLabel98, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel49);

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setLayout(new java.awt.BorderLayout());

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("A");
        jPanel50.add(jLabel95, java.awt.BorderLayout.CENTER);

        jLabel96.setText("1");
        jLabel96.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel96.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel50.add(jLabel96, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel50);

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setLayout(new java.awt.BorderLayout());

        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("A");
        jPanel51.add(jLabel99, java.awt.BorderLayout.CENTER);

        jLabel100.setText("1");
        jLabel100.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel100.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel51.add(jLabel100, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel51);

        jPanel52.setBackground(new java.awt.Color(255, 255, 255));
        jPanel52.setLayout(new java.awt.BorderLayout());

        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("A");
        jPanel52.add(jLabel101, java.awt.BorderLayout.CENTER);

        jLabel102.setText("1");
        jLabel102.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel102.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel52.add(jLabel102, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel52);

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setLayout(new java.awt.BorderLayout());

        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("A");
        jPanel53.add(jLabel103, java.awt.BorderLayout.CENTER);

        jLabel104.setText("1");
        jLabel104.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel104.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel53.add(jLabel104, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel53);

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));
        jPanel54.setLayout(new java.awt.BorderLayout());

        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("A");
        jPanel54.add(jLabel105, java.awt.BorderLayout.CENTER);

        jLabel106.setText("1");
        jLabel106.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel106.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel54.add(jLabel106, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel54);

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));
        jPanel55.setLayout(new java.awt.BorderLayout());

        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("A");
        jPanel55.add(jLabel107, java.awt.BorderLayout.CENTER);

        jLabel108.setText("1");
        jLabel108.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel108.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel55.add(jLabel108, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel55);

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));
        jPanel56.setLayout(new java.awt.BorderLayout());

        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("A");
        jPanel56.add(jLabel109, java.awt.BorderLayout.CENTER);

        jLabel110.setText("1");
        jLabel110.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel110.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel56.add(jLabel110, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel56);

        jPanel57.setBackground(new java.awt.Color(255, 255, 255));
        jPanel57.setLayout(new java.awt.BorderLayout());

        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("A");
        jPanel57.add(jLabel111, java.awt.BorderLayout.CENTER);

        jLabel112.setText("1");
        jLabel112.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel112.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel57.add(jLabel112, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel57);

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jPanel58.setLayout(new java.awt.BorderLayout());

        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("A");
        jPanel58.add(jLabel113, java.awt.BorderLayout.CENTER);

        jLabel114.setText("1");
        jLabel114.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel114.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel58.add(jLabel114, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel58);

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));
        jPanel59.setLayout(new java.awt.BorderLayout());

        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("A");
        jPanel59.add(jLabel115, java.awt.BorderLayout.CENTER);

        jLabel116.setText("1");
        jLabel116.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel116.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel59.add(jLabel116, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel59);

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));
        jPanel60.setLayout(new java.awt.BorderLayout());

        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("A");
        jPanel60.add(jLabel117, java.awt.BorderLayout.CENTER);

        jLabel118.setText("1");
        jLabel118.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel118.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel60.add(jLabel118, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel60);

        jPanel61.setBackground(new java.awt.Color(255, 255, 255));
        jPanel61.setLayout(new java.awt.BorderLayout());

        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setText("A");
        jPanel61.add(jLabel119, java.awt.BorderLayout.CENTER);

        jLabel120.setText("1");
        jLabel120.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel120.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel61.add(jLabel120, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel61);

        jPanel62.setBackground(new java.awt.Color(255, 255, 255));
        jPanel62.setLayout(new java.awt.BorderLayout());

        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setText("A");
        jPanel62.add(jLabel121, java.awt.BorderLayout.CENTER);

        jLabel122.setText("5");
        jLabel122.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel122.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel62.add(jLabel122, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel62);

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setLayout(new java.awt.BorderLayout());

        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setText("A");
        jPanel63.add(jLabel123, java.awt.BorderLayout.CENTER);

        jLabel124.setText("1");
        jLabel124.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel124.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel63.add(jLabel124, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel63);

        jPanel64.setBackground(new java.awt.Color(255, 255, 255));
        jPanel64.setLayout(new java.awt.BorderLayout());

        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("A");
        jPanel64.add(jLabel125, java.awt.BorderLayout.CENTER);

        jLabel126.setText("1");
        jLabel126.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel126.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel64.add(jLabel126, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel64);

        jPanel65.setBackground(new java.awt.Color(255, 255, 255));
        jPanel65.setLayout(new java.awt.BorderLayout());

        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("A");
        jPanel65.add(jLabel127, java.awt.BorderLayout.CENTER);

        jLabel128.setText("1");
        jLabel128.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel128.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel65.add(jLabel128, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel65);

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));
        jPanel66.setLayout(new java.awt.BorderLayout());

        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel129.setText("A");
        jPanel66.add(jLabel129, java.awt.BorderLayout.CENTER);

        jLabel130.setText("1");
        jLabel130.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel130.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel66.add(jLabel130, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel66);

        jPanel67.setBackground(new java.awt.Color(255, 255, 255));
        jPanel67.setLayout(new java.awt.BorderLayout());

        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("A");
        jPanel67.add(jLabel131, java.awt.BorderLayout.CENTER);

        jLabel132.setText("1");
        jLabel132.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel132.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel67.add(jLabel132, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel67);

        jPanel68.setBackground(new java.awt.Color(255, 255, 255));
        jPanel68.setLayout(new java.awt.BorderLayout());

        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setText("A");
        jPanel68.add(jLabel133, java.awt.BorderLayout.CENTER);

        jLabel134.setText("1");
        jLabel134.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel134.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel68.add(jLabel134, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel68);

        jPanel69.setBackground(new java.awt.Color(255, 255, 255));
        jPanel69.setLayout(new java.awt.BorderLayout());

        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel135.setText("A");
        jPanel69.add(jLabel135, java.awt.BorderLayout.CENTER);

        jLabel136.setText("1");
        jLabel136.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel136.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel69.add(jLabel136, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel69);

        jPanel70.setBackground(new java.awt.Color(255, 255, 255));
        jPanel70.setLayout(new java.awt.BorderLayout());

        jLabel137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel137.setText("A");
        jPanel70.add(jLabel137, java.awt.BorderLayout.CENTER);

        jLabel138.setText("1");
        jLabel138.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel138.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel70.add(jLabel138, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel70);

        jPanel71.setBackground(new java.awt.Color(255, 255, 255));
        jPanel71.setLayout(new java.awt.BorderLayout());

        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel139.setText("A");
        jPanel71.add(jLabel139, java.awt.BorderLayout.CENTER);

        jLabel140.setText("1");
        jLabel140.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel140.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel71.add(jLabel140, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel71);

        jPanel72.setBackground(new java.awt.Color(255, 255, 255));
        jPanel72.setLayout(new java.awt.BorderLayout());

        jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel141.setText("A");
        jPanel72.add(jLabel141, java.awt.BorderLayout.CENTER);

        jLabel142.setText("1");
        jLabel142.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel142.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel72.add(jLabel142, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel72);

        jPanel73.setBackground(new java.awt.Color(255, 255, 255));
        jPanel73.setLayout(new java.awt.BorderLayout());

        jLabel143.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel143.setText("A");
        jPanel73.add(jLabel143, java.awt.BorderLayout.CENTER);

        jLabel144.setText("1");
        jLabel144.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel144.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel73.add(jLabel144, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel73);

        jPanel74.setBackground(new java.awt.Color(255, 255, 255));
        jPanel74.setLayout(new java.awt.BorderLayout());

        jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel145.setText("A");
        jPanel74.add(jLabel145, java.awt.BorderLayout.CENTER);

        jLabel146.setText("1");
        jLabel146.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel146.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel74.add(jLabel146, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel74);

        jPanel75.setBackground(new java.awt.Color(255, 255, 255));
        jPanel75.setLayout(new java.awt.BorderLayout());

        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel147.setText("A");
        jPanel75.add(jLabel147, java.awt.BorderLayout.CENTER);

        jLabel148.setText("1");
        jLabel148.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel148.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel75.add(jLabel148, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel75);

        jPanel76.setBackground(new java.awt.Color(255, 255, 255));
        jPanel76.setLayout(new java.awt.BorderLayout());

        jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel149.setText("A");
        jPanel76.add(jLabel149, java.awt.BorderLayout.CENTER);

        jLabel150.setText("1");
        jLabel150.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel150.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel76.add(jLabel150, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel76);

        jPanel77.setBackground(new java.awt.Color(255, 255, 255));
        jPanel77.setLayout(new java.awt.BorderLayout());

        jLabel151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel151.setText("A");
        jPanel77.add(jLabel151, java.awt.BorderLayout.CENTER);

        jLabel152.setText("6");
        jLabel152.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel152.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel77.add(jLabel152, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel77);

        jPanel78.setBackground(new java.awt.Color(255, 255, 255));
        jPanel78.setLayout(new java.awt.BorderLayout());

        jLabel153.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel153.setText("A");
        jPanel78.add(jLabel153, java.awt.BorderLayout.CENTER);

        jLabel154.setText("1");
        jLabel154.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel154.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel78.add(jLabel154, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel78);

        jPanel79.setBackground(new java.awt.Color(255, 255, 255));
        jPanel79.setLayout(new java.awt.BorderLayout());

        jLabel155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel155.setText("A");
        jPanel79.add(jLabel155, java.awt.BorderLayout.CENTER);

        jLabel156.setText("1");
        jLabel156.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel156.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel79.add(jLabel156, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel79);

        jPanel80.setBackground(new java.awt.Color(255, 255, 255));
        jPanel80.setLayout(new java.awt.BorderLayout());

        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel157.setText("A");
        jPanel80.add(jLabel157, java.awt.BorderLayout.CENTER);

        jLabel158.setText("1");
        jLabel158.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel158.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel80.add(jLabel158, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel80);

        jPanel81.setBackground(new java.awt.Color(255, 255, 255));
        jPanel81.setLayout(new java.awt.BorderLayout());

        jLabel159.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel159.setText("A");
        jPanel81.add(jLabel159, java.awt.BorderLayout.CENTER);

        jLabel160.setText("1");
        jLabel160.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel160.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel81.add(jLabel160, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel81);

        jPanel82.setBackground(new java.awt.Color(255, 255, 255));
        jPanel82.setLayout(new java.awt.BorderLayout());

        jLabel161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel161.setText("A");
        jPanel82.add(jLabel161, java.awt.BorderLayout.CENTER);

        jLabel162.setText("1");
        jLabel162.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel162.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel82.add(jLabel162, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel82);

        jPanel83.setBackground(new java.awt.Color(255, 255, 255));
        jPanel83.setLayout(new java.awt.BorderLayout());

        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel163.setText("A");
        jPanel83.add(jLabel163, java.awt.BorderLayout.CENTER);

        jLabel164.setText("1");
        jLabel164.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel164.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel83.add(jLabel164, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel83);

        jPanel84.setBackground(new java.awt.Color(255, 255, 255));
        jPanel84.setLayout(new java.awt.BorderLayout());

        jLabel165.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel165.setText("A");
        jPanel84.add(jLabel165, java.awt.BorderLayout.CENTER);

        jLabel166.setText("1");
        jLabel166.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel166.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel84.add(jLabel166, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel84);

        jPanel85.setBackground(new java.awt.Color(255, 255, 255));
        jPanel85.setLayout(new java.awt.BorderLayout());

        jLabel167.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel167.setText("A");
        jPanel85.add(jLabel167, java.awt.BorderLayout.CENTER);

        jLabel168.setText("1");
        jLabel168.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel168.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel85.add(jLabel168, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel85);

        jPanel86.setBackground(new java.awt.Color(255, 255, 255));
        jPanel86.setLayout(new java.awt.BorderLayout());

        jLabel169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel169.setText("A");
        jPanel86.add(jLabel169, java.awt.BorderLayout.CENTER);

        jLabel170.setText("1");
        jLabel170.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel170.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel86.add(jLabel170, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel86);

        jPanel87.setBackground(new java.awt.Color(255, 255, 255));
        jPanel87.setLayout(new java.awt.BorderLayout());

        jLabel171.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel171.setText("A");
        jPanel87.add(jLabel171, java.awt.BorderLayout.CENTER);

        jLabel172.setText("1");
        jLabel172.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel172.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel87.add(jLabel172, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel87);

        jPanel88.setBackground(new java.awt.Color(255, 255, 255));
        jPanel88.setLayout(new java.awt.BorderLayout());

        jLabel173.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel173.setText("A");
        jPanel88.add(jLabel173, java.awt.BorderLayout.CENTER);

        jLabel174.setText("1");
        jLabel174.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel174.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel88.add(jLabel174, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel88);

        jPanel89.setBackground(new java.awt.Color(255, 255, 255));
        jPanel89.setLayout(new java.awt.BorderLayout());

        jLabel175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel175.setText("A");
        jPanel89.add(jLabel175, java.awt.BorderLayout.CENTER);

        jLabel176.setText("1");
        jLabel176.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel176.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel89.add(jLabel176, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel89);

        jPanel90.setBackground(new java.awt.Color(255, 255, 255));
        jPanel90.setLayout(new java.awt.BorderLayout());

        jLabel177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel177.setText("A");
        jPanel90.add(jLabel177, java.awt.BorderLayout.CENTER);

        jLabel178.setText("1");
        jLabel178.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel178.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel90.add(jLabel178, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel90);

        jPanel91.setBackground(new java.awt.Color(255, 255, 255));
        jPanel91.setLayout(new java.awt.BorderLayout());

        jLabel179.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel179.setText("A");
        jPanel91.add(jLabel179, java.awt.BorderLayout.CENTER);

        jLabel180.setText("1");
        jLabel180.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel180.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel91.add(jLabel180, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel91);

        jPanel92.setBackground(new java.awt.Color(255, 255, 255));
        jPanel92.setLayout(new java.awt.BorderLayout());

        jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel181.setText("A");
        jPanel92.add(jLabel181, java.awt.BorderLayout.CENTER);

        jLabel182.setText("1");
        jLabel182.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel182.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel92.add(jLabel182, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel92);

        jPanel93.setBackground(new java.awt.Color(255, 255, 255));
        jPanel93.setLayout(new java.awt.BorderLayout());

        jLabel183.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel183.setText("A");
        jPanel93.add(jLabel183, java.awt.BorderLayout.CENTER);

        jLabel184.setText("1");
        jLabel184.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel184.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel93.add(jLabel184, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel93);

        jPanel94.setBackground(new java.awt.Color(255, 255, 255));
        jPanel94.setLayout(new java.awt.BorderLayout());

        jLabel185.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel185.setText("A");
        jPanel94.add(jLabel185, java.awt.BorderLayout.CENTER);

        jLabel186.setText("1");
        jLabel186.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel186.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel94.add(jLabel186, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel94);

        jPanel95.setBackground(new java.awt.Color(255, 255, 255));
        jPanel95.setLayout(new java.awt.BorderLayout());

        jLabel187.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel187.setText("A");
        jPanel95.add(jLabel187, java.awt.BorderLayout.CENTER);

        jLabel188.setText("1");
        jLabel188.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel188.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel95.add(jLabel188, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel95);

        jPanel96.setBackground(new java.awt.Color(255, 255, 255));
        jPanel96.setLayout(new java.awt.BorderLayout());

        jLabel379.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel379.setText("A");
        jPanel96.add(jLabel379, java.awt.BorderLayout.CENTER);

        jLabel380.setText("1");
        jLabel380.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel380.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel96.add(jLabel380, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel96);

        jPanel97.setBackground(new java.awt.Color(255, 255, 255));
        jPanel97.setLayout(new java.awt.BorderLayout());

        jLabel189.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel189.setText("A");
        jPanel97.add(jLabel189, java.awt.BorderLayout.CENTER);

        jLabel190.setText("1");
        jLabel190.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel190.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel97.add(jLabel190, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel97);

        jPanel98.setBackground(new java.awt.Color(255, 255, 255));
        jPanel98.setLayout(new java.awt.BorderLayout());

        jLabel191.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel191.setText("A");
        jPanel98.add(jLabel191, java.awt.BorderLayout.CENTER);

        jLabel192.setText("1");
        jLabel192.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel192.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel98.add(jLabel192, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel98);

        jPanel99.setBackground(new java.awt.Color(255, 255, 255));
        jPanel99.setLayout(new java.awt.BorderLayout());

        jLabel193.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel193.setText("A");
        jPanel99.add(jLabel193, java.awt.BorderLayout.CENTER);

        jLabel194.setText("1");
        jLabel194.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel194.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel99.add(jLabel194, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel99);

        jPanel100.setBackground(new java.awt.Color(255, 255, 255));
        jPanel100.setLayout(new java.awt.BorderLayout());

        jLabel383.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel383.setText("A");
        jPanel100.add(jLabel383, java.awt.BorderLayout.CENTER);

        jLabel384.setText("1");
        jLabel384.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel384.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel100.add(jLabel384, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel100);

        jPanel101.setBackground(new java.awt.Color(255, 255, 255));
        jPanel101.setLayout(new java.awt.BorderLayout());

        jLabel195.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel195.setText("A");
        jPanel101.add(jLabel195, java.awt.BorderLayout.CENTER);

        jLabel196.setText("1");
        jLabel196.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel196.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel101.add(jLabel196, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel101);

        jPanel102.setBackground(new java.awt.Color(255, 255, 255));
        jPanel102.setLayout(new java.awt.BorderLayout());

        jLabel385.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel385.setText("A");
        jPanel102.add(jLabel385, java.awt.BorderLayout.CENTER);

        jLabel386.setText("1");
        jLabel386.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel386.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel102.add(jLabel386, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel102);

        jPanel103.setBackground(new java.awt.Color(255, 255, 255));
        jPanel103.setLayout(new java.awt.BorderLayout());

        jLabel197.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel197.setText("A");
        jPanel103.add(jLabel197, java.awt.BorderLayout.CENTER);

        jLabel198.setText("1");
        jLabel198.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel198.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel103.add(jLabel198, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel103);

        jPanel104.setBackground(new java.awt.Color(255, 255, 255));
        jPanel104.setLayout(new java.awt.BorderLayout());

        jLabel387.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel387.setText("A");
        jPanel104.add(jLabel387, java.awt.BorderLayout.CENTER);

        jLabel388.setText("1");
        jLabel388.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel388.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel104.add(jLabel388, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel104);

        jPanel105.setBackground(new java.awt.Color(255, 255, 255));
        jPanel105.setLayout(new java.awt.BorderLayout());

        jLabel199.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel199.setText("A");
        jPanel105.add(jLabel199, java.awt.BorderLayout.CENTER);

        jLabel200.setText("1");
        jLabel200.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel200.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel105.add(jLabel200, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel105);

        jPanel106.setBackground(new java.awt.Color(255, 255, 255));
        jPanel106.setLayout(new java.awt.BorderLayout());

        jLabel201.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel201.setText("A");
        jPanel106.add(jLabel201, java.awt.BorderLayout.CENTER);

        jLabel202.setText("1");
        jLabel202.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel202.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel106.add(jLabel202, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel106);

        jPanel107.setBackground(new java.awt.Color(255, 255, 255));
        jPanel107.setLayout(new java.awt.BorderLayout());

        jLabel203.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel203.setText("A");
        jPanel107.add(jLabel203, java.awt.BorderLayout.CENTER);

        jLabel204.setText("8");
        jLabel204.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel204.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel107.add(jLabel204, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel107);

        jPanel108.setBackground(new java.awt.Color(255, 255, 255));
        jPanel108.setLayout(new java.awt.BorderLayout());

        jLabel375.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel375.setText("A");
        jPanel108.add(jLabel375, java.awt.BorderLayout.CENTER);

        jLabel376.setText("1");
        jLabel376.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel376.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel108.add(jLabel376, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel108);

        jPanel109.setBackground(new java.awt.Color(255, 255, 255));
        jPanel109.setLayout(new java.awt.BorderLayout());

        jLabel205.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel205.setText("A");
        jPanel109.add(jLabel205, java.awt.BorderLayout.CENTER);

        jLabel206.setText("1");
        jLabel206.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel206.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel109.add(jLabel206, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel109);

        jPanel110.setBackground(new java.awt.Color(255, 255, 255));
        jPanel110.setLayout(new java.awt.BorderLayout());

        jLabel377.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel377.setText("A");
        jPanel110.add(jLabel377, java.awt.BorderLayout.CENTER);

        jLabel378.setText("1");
        jLabel378.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel378.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel110.add(jLabel378, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel110);

        jPanel111.setBackground(new java.awt.Color(255, 255, 255));
        jPanel111.setLayout(new java.awt.BorderLayout());

        jLabel207.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel207.setText("A");
        jPanel111.add(jLabel207, java.awt.BorderLayout.CENTER);

        jLabel208.setText("1");
        jLabel208.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel208.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel111.add(jLabel208, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel111);

        jPanel112.setBackground(new java.awt.Color(255, 255, 255));
        jPanel112.setLayout(new java.awt.BorderLayout());

        jLabel381.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel381.setText("A");
        jPanel112.add(jLabel381, java.awt.BorderLayout.CENTER);

        jLabel382.setText("1");
        jLabel382.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel382.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel112.add(jLabel382, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel112);

        jPanel113.setBackground(new java.awt.Color(255, 255, 255));
        jPanel113.setLayout(new java.awt.BorderLayout());

        jLabel209.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel209.setText("A");
        jPanel113.add(jLabel209, java.awt.BorderLayout.CENTER);

        jLabel210.setText("1");
        jLabel210.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel210.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel113.add(jLabel210, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel113);

        jPanel114.setBackground(new java.awt.Color(255, 255, 255));
        jPanel114.setLayout(new java.awt.BorderLayout());

        jLabel211.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel211.setText("A");
        jPanel114.add(jLabel211, java.awt.BorderLayout.CENTER);

        jLabel212.setText("1");
        jLabel212.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel212.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel114.add(jLabel212, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel114);

        jPanel115.setBackground(new java.awt.Color(255, 255, 255));
        jPanel115.setLayout(new java.awt.BorderLayout());

        jLabel213.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel213.setText("A");
        jPanel115.add(jLabel213, java.awt.BorderLayout.CENTER);

        jLabel214.setText("1");
        jLabel214.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel214.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel115.add(jLabel214, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel115);

        jPanel116.setBackground(new java.awt.Color(255, 255, 255));
        jPanel116.setLayout(new java.awt.BorderLayout());

        jLabel215.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel215.setText("A");
        jPanel116.add(jLabel215, java.awt.BorderLayout.CENTER);

        jLabel216.setText("1");
        jLabel216.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel216.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel116.add(jLabel216, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel116);

        jPanel117.setBackground(new java.awt.Color(255, 255, 255));
        jPanel117.setLayout(new java.awt.BorderLayout());

        jLabel217.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel217.setText("A");
        jPanel117.add(jLabel217, java.awt.BorderLayout.CENTER);

        jLabel218.setText("1");
        jLabel218.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel218.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel117.add(jLabel218, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel117);

        jPanel118.setBackground(new java.awt.Color(255, 255, 255));
        jPanel118.setLayout(new java.awt.BorderLayout());

        jLabel219.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel219.setText("A");
        jPanel118.add(jLabel219, java.awt.BorderLayout.CENTER);

        jLabel220.setText("1");
        jLabel220.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel220.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel118.add(jLabel220, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel118);

        jPanel119.setBackground(new java.awt.Color(255, 255, 255));
        jPanel119.setLayout(new java.awt.BorderLayout());

        jLabel221.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel221.setText("A");
        jPanel119.add(jLabel221, java.awt.BorderLayout.CENTER);

        jLabel222.setText("1");
        jLabel222.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel222.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel119.add(jLabel222, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel119);

        jPanel120.setBackground(new java.awt.Color(255, 255, 255));
        jPanel120.setLayout(new java.awt.BorderLayout());

        jLabel389.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel389.setText("A");
        jPanel120.add(jLabel389, java.awt.BorderLayout.CENTER);

        jLabel390.setText("1");
        jLabel390.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel390.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel120.add(jLabel390, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel120);

        jPanel121.setBackground(new java.awt.Color(255, 255, 255));
        jPanel121.setLayout(new java.awt.BorderLayout());

        jLabel223.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel223.setText("A");
        jPanel121.add(jLabel223, java.awt.BorderLayout.CENTER);

        jLabel224.setText("1");
        jLabel224.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel224.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel121.add(jLabel224, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel121);

        jPanel122.setBackground(new java.awt.Color(255, 255, 255));
        jPanel122.setLayout(new java.awt.BorderLayout());

        jLabel225.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel225.setText("A");
        jPanel122.add(jLabel225, java.awt.BorderLayout.CENTER);

        jLabel226.setText("1");
        jLabel226.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel226.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel122.add(jLabel226, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel122);

        jPanel123.setBackground(new java.awt.Color(255, 255, 255));
        jPanel123.setLayout(new java.awt.BorderLayout());

        jLabel399.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel399.setText("A");
        jPanel123.add(jLabel399, java.awt.BorderLayout.CENTER);

        jLabel400.setText("1");
        jLabel400.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel400.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel123.add(jLabel400, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel123);

        jPanel124.setBackground(new java.awt.Color(255, 255, 255));
        jPanel124.setLayout(new java.awt.BorderLayout());

        jLabel227.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel227.setText("A");
        jPanel124.add(jLabel227, java.awt.BorderLayout.CENTER);

        jLabel228.setText("1");
        jLabel228.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel228.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel124.add(jLabel228, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel124);

        jPanel125.setBackground(new java.awt.Color(255, 255, 255));
        jPanel125.setLayout(new java.awt.BorderLayout());

        jLabel397.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel397.setText("A");
        jPanel125.add(jLabel397, java.awt.BorderLayout.CENTER);

        jLabel398.setText("1");
        jLabel398.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel398.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel125.add(jLabel398, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel125);

        jPanel126.setBackground(new java.awt.Color(255, 255, 255));
        jPanel126.setLayout(new java.awt.BorderLayout());

        jLabel229.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel229.setText("A");
        jPanel126.add(jLabel229, java.awt.BorderLayout.CENTER);

        jLabel230.setText("1");
        jLabel230.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel230.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel126.add(jLabel230, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel126);

        jPanel127.setBackground(new java.awt.Color(255, 255, 255));
        jPanel127.setLayout(new java.awt.BorderLayout());

        jLabel231.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel231.setText("A");
        jPanel127.add(jLabel231, java.awt.BorderLayout.CENTER);

        jLabel232.setText("1");
        jLabel232.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel232.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel127.add(jLabel232, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel127);

        jPanel128.setBackground(new java.awt.Color(255, 255, 255));
        jPanel128.setLayout(new java.awt.BorderLayout());

        jLabel395.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel395.setText("A");
        jPanel128.add(jLabel395, java.awt.BorderLayout.CENTER);

        jLabel396.setText("1");
        jLabel396.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel396.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel128.add(jLabel396, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel128);

        jPanel129.setBackground(new java.awt.Color(255, 255, 255));
        jPanel129.setLayout(new java.awt.BorderLayout());

        jLabel233.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel233.setText("A");
        jPanel129.add(jLabel233, java.awt.BorderLayout.CENTER);

        jLabel234.setText("1");
        jLabel234.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel234.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel129.add(jLabel234, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel129);

        jPanel130.setBackground(new java.awt.Color(255, 255, 255));
        jPanel130.setLayout(new java.awt.BorderLayout());

        jLabel393.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel393.setText("A");
        jPanel130.add(jLabel393, java.awt.BorderLayout.CENTER);

        jLabel394.setText("1");
        jLabel394.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel394.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel130.add(jLabel394, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel130);

        jPanel131.setBackground(new java.awt.Color(255, 255, 255));
        jPanel131.setLayout(new java.awt.BorderLayout());

        jLabel235.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel235.setText("A");
        jPanel131.add(jLabel235, java.awt.BorderLayout.CENTER);

        jLabel236.setText("1");
        jLabel236.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel236.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel131.add(jLabel236, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel131);

        jPanel132.setBackground(new java.awt.Color(255, 255, 255));
        jPanel132.setLayout(new java.awt.BorderLayout());

        jLabel237.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel237.setText("A");
        jPanel132.add(jLabel237, java.awt.BorderLayout.CENTER);

        jLabel238.setText("1");
        jLabel238.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel238.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel132.add(jLabel238, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel132);

        jPanel133.setBackground(new java.awt.Color(255, 255, 255));
        jPanel133.setLayout(new java.awt.BorderLayout());

        jLabel239.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel239.setText("A");
        jPanel133.add(jLabel239, java.awt.BorderLayout.CENTER);

        jLabel240.setText("1");
        jLabel240.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel240.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel133.add(jLabel240, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel133);

        jPanel134.setBackground(new java.awt.Color(255, 255, 255));
        jPanel134.setLayout(new java.awt.BorderLayout());

        jLabel391.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel391.setText("A");
        jPanel134.add(jLabel391, java.awt.BorderLayout.CENTER);

        jLabel392.setText("1");
        jLabel392.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel392.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel134.add(jLabel392, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel134);

        jPanel135.setBackground(new java.awt.Color(255, 255, 255));
        jPanel135.setLayout(new java.awt.BorderLayout());

        jLabel241.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel241.setText("A");
        jPanel135.add(jLabel241, java.awt.BorderLayout.CENTER);

        jLabel242.setText("1");
        jLabel242.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel242.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel135.add(jLabel242, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel135);

        jPanel136.setBackground(new java.awt.Color(255, 255, 255));
        jPanel136.setLayout(new java.awt.BorderLayout());

        jLabel243.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel243.setText("A");
        jPanel136.add(jLabel243, java.awt.BorderLayout.CENTER);

        jLabel244.setText("1");
        jLabel244.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel244.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel136.add(jLabel244, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel136);

        jPanel137.setBackground(new java.awt.Color(255, 255, 255));
        jPanel137.setLayout(new java.awt.BorderLayout());

        jLabel245.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel245.setText("A");
        jPanel137.add(jLabel245, java.awt.BorderLayout.CENTER);

        jLabel246.setText("10");
        jLabel246.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel246.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel137.add(jLabel246, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel137);

        jPanel138.setBackground(new java.awt.Color(255, 255, 255));
        jPanel138.setLayout(new java.awt.BorderLayout());

        jLabel247.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel247.setText("A");
        jPanel138.add(jLabel247, java.awt.BorderLayout.CENTER);

        jLabel248.setText("1");
        jLabel248.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel248.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel138.add(jLabel248, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel138);

        jPanel139.setBackground(new java.awt.Color(255, 255, 255));
        jPanel139.setLayout(new java.awt.BorderLayout());

        jLabel249.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel249.setText("A");
        jPanel139.add(jLabel249, java.awt.BorderLayout.CENTER);

        jLabel250.setText("1");
        jLabel250.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel250.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel139.add(jLabel250, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel139);

        jPanel140.setBackground(new java.awt.Color(255, 255, 255));
        jPanel140.setLayout(new java.awt.BorderLayout());

        jLabel251.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel251.setText("A");
        jPanel140.add(jLabel251, java.awt.BorderLayout.CENTER);

        jLabel252.setText("1");
        jLabel252.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel252.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel140.add(jLabel252, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel140);

        jPanel141.setBackground(new java.awt.Color(255, 255, 255));
        jPanel141.setLayout(new java.awt.BorderLayout());

        jLabel253.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel253.setText("A");
        jPanel141.add(jLabel253, java.awt.BorderLayout.CENTER);

        jLabel254.setText("1");
        jLabel254.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel254.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel141.add(jLabel254, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel141);

        jPanel142.setBackground(new java.awt.Color(255, 255, 255));
        jPanel142.setLayout(new java.awt.BorderLayout());

        jLabel401.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel401.setText("A");
        jPanel142.add(jLabel401, java.awt.BorderLayout.CENTER);

        jLabel402.setText("1");
        jLabel402.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel402.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel142.add(jLabel402, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel142);

        jPanel143.setBackground(new java.awt.Color(255, 255, 255));
        jPanel143.setLayout(new java.awt.BorderLayout());

        jLabel255.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel255.setText("A");
        jPanel143.add(jLabel255, java.awt.BorderLayout.CENTER);

        jLabel256.setText("1");
        jLabel256.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel256.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel143.add(jLabel256, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel143);

        jPanel144.setBackground(new java.awt.Color(255, 255, 255));
        jPanel144.setLayout(new java.awt.BorderLayout());

        jLabel403.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel403.setText("A");
        jPanel144.add(jLabel403, java.awt.BorderLayout.CENTER);

        jLabel404.setText("1");
        jLabel404.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel404.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel144.add(jLabel404, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel144);

        jPanel145.setBackground(new java.awt.Color(255, 255, 255));
        jPanel145.setLayout(new java.awt.BorderLayout());

        jLabel257.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel257.setText("A");
        jPanel145.add(jLabel257, java.awt.BorderLayout.CENTER);

        jLabel258.setText("1");
        jLabel258.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel258.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel145.add(jLabel258, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel145);

        jPanel146.setBackground(new java.awt.Color(255, 255, 255));
        jPanel146.setLayout(new java.awt.BorderLayout());

        jLabel405.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel405.setText("A");
        jPanel146.add(jLabel405, java.awt.BorderLayout.CENTER);

        jLabel406.setText("1");
        jLabel406.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel406.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel146.add(jLabel406, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel146);

        jPanel147.setBackground(new java.awt.Color(255, 255, 255));
        jPanel147.setLayout(new java.awt.BorderLayout());

        jLabel259.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel259.setText("A");
        jPanel147.add(jLabel259, java.awt.BorderLayout.CENTER);

        jLabel260.setText("1");
        jLabel260.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel260.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel147.add(jLabel260, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel147);

        jPanel148.setBackground(new java.awt.Color(255, 255, 255));
        jPanel148.setLayout(new java.awt.BorderLayout());

        jLabel407.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel407.setText("A");
        jPanel148.add(jLabel407, java.awt.BorderLayout.CENTER);

        jLabel408.setText("1");
        jLabel408.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel408.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel148.add(jLabel408, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel148);

        jPanel149.setBackground(new java.awt.Color(255, 255, 255));
        jPanel149.setLayout(new java.awt.BorderLayout());

        jLabel261.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel261.setText("A");
        jPanel149.add(jLabel261, java.awt.BorderLayout.CENTER);

        jLabel262.setText("1");
        jLabel262.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel262.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel149.add(jLabel262, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel149);

        jPanel150.setBackground(new java.awt.Color(255, 255, 255));
        jPanel150.setLayout(new java.awt.BorderLayout());

        jLabel263.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel263.setText("A");
        jPanel150.add(jLabel263, java.awt.BorderLayout.CENTER);

        jLabel264.setText("1");
        jLabel264.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel264.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel150.add(jLabel264, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel150);

        jPanel151.setBackground(new java.awt.Color(255, 255, 255));
        jPanel151.setLayout(new java.awt.BorderLayout());

        jLabel265.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel265.setText("A");
        jPanel151.add(jLabel265, java.awt.BorderLayout.CENTER);

        jLabel266.setText("1");
        jLabel266.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel266.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel151.add(jLabel266, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel151);

        jPanel152.setBackground(new java.awt.Color(255, 255, 255));
        jPanel152.setLayout(new java.awt.BorderLayout());

        jLabel425.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel425.setText("A");
        jPanel152.add(jLabel425, java.awt.BorderLayout.CENTER);

        jLabel426.setText("1");
        jLabel426.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel426.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel152.add(jLabel426, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel152);

        jPanel153.setBackground(new java.awt.Color(255, 255, 255));
        jPanel153.setLayout(new java.awt.BorderLayout());

        jLabel267.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel267.setText("A");
        jPanel153.add(jLabel267, java.awt.BorderLayout.CENTER);

        jLabel268.setText("1");
        jLabel268.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel268.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel153.add(jLabel268, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel153);

        jPanel154.setBackground(new java.awt.Color(255, 255, 255));
        jPanel154.setLayout(new java.awt.BorderLayout());

        jLabel269.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel269.setText("A");
        jPanel154.add(jLabel269, java.awt.BorderLayout.CENTER);

        jLabel270.setText("1");
        jLabel270.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel270.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel154.add(jLabel270, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel154);

        jPanel155.setBackground(new java.awt.Color(255, 255, 255));
        jPanel155.setLayout(new java.awt.BorderLayout());

        jLabel419.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel419.setText("A");
        jPanel155.add(jLabel419, java.awt.BorderLayout.CENTER);

        jLabel420.setText("1");
        jLabel420.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel420.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel155.add(jLabel420, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel155);

        jPanel156.setBackground(new java.awt.Color(255, 255, 255));
        jPanel156.setLayout(new java.awt.BorderLayout());

        jLabel271.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel271.setText("A");
        jPanel156.add(jLabel271, java.awt.BorderLayout.CENTER);

        jLabel272.setText("1");
        jLabel272.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel272.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel156.add(jLabel272, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel156);

        jPanel157.setBackground(new java.awt.Color(255, 255, 255));
        jPanel157.setLayout(new java.awt.BorderLayout());

        jLabel417.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel417.setText("A");
        jPanel157.add(jLabel417, java.awt.BorderLayout.CENTER);

        jLabel418.setText("1");
        jLabel418.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel418.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel157.add(jLabel418, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel157);

        jPanel158.setBackground(new java.awt.Color(255, 255, 255));
        jPanel158.setLayout(new java.awt.BorderLayout());

        jLabel273.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel273.setText("A");
        jPanel158.add(jLabel273, java.awt.BorderLayout.CENTER);

        jLabel274.setText("1");
        jLabel274.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel274.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel158.add(jLabel274, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel158);

        jPanel159.setBackground(new java.awt.Color(255, 255, 255));
        jPanel159.setLayout(new java.awt.BorderLayout());

        jLabel415.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel415.setText("A");
        jPanel159.add(jLabel415, java.awt.BorderLayout.CENTER);

        jLabel416.setText("1");
        jLabel416.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel416.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel159.add(jLabel416, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel159);

        jPanel160.setBackground(new java.awt.Color(255, 255, 255));
        jPanel160.setLayout(new java.awt.BorderLayout());

        jLabel275.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel275.setText("A");
        jPanel160.add(jLabel275, java.awt.BorderLayout.CENTER);

        jLabel276.setText("1");
        jLabel276.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel276.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel160.add(jLabel276, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel160);

        jPanel161.setBackground(new java.awt.Color(255, 255, 255));
        jPanel161.setLayout(new java.awt.BorderLayout());

        jLabel277.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel277.setText("A");
        jPanel161.add(jLabel277, java.awt.BorderLayout.CENTER);

        jLabel278.setText("1");
        jLabel278.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel278.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel161.add(jLabel278, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel161);

        jPanel162.setBackground(new java.awt.Color(255, 255, 255));
        jPanel162.setLayout(new java.awt.BorderLayout());

        jLabel279.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel279.setText("A");
        jPanel162.add(jLabel279, java.awt.BorderLayout.CENTER);

        jLabel280.setText("1");
        jLabel280.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel280.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel162.add(jLabel280, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel162);

        jPanel163.setBackground(new java.awt.Color(255, 255, 255));
        jPanel163.setLayout(new java.awt.BorderLayout());

        jLabel409.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel409.setText("A");
        jPanel163.add(jLabel409, java.awt.BorderLayout.CENTER);

        jLabel410.setText("1");
        jLabel410.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel410.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel163.add(jLabel410, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel163);

        jPanel164.setBackground(new java.awt.Color(255, 255, 255));
        jPanel164.setLayout(new java.awt.BorderLayout());

        jLabel281.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel281.setText("A");
        jPanel164.add(jLabel281, java.awt.BorderLayout.CENTER);

        jLabel282.setText("1");
        jLabel282.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel282.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel164.add(jLabel282, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel164);

        jPanel165.setBackground(new java.awt.Color(255, 255, 255));
        jPanel165.setLayout(new java.awt.BorderLayout());

        jLabel283.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel283.setText("A");
        jPanel165.add(jLabel283, java.awt.BorderLayout.CENTER);

        jLabel284.setText("1");
        jLabel284.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel284.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel165.add(jLabel284, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel165);

        jPanel166.setBackground(new java.awt.Color(255, 255, 255));
        jPanel166.setLayout(new java.awt.BorderLayout());

        jLabel285.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel285.setText("A");
        jPanel166.add(jLabel285, java.awt.BorderLayout.CENTER);

        jLabel286.setText("1");
        jLabel286.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel286.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel166.add(jLabel286, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel166);

        jPanel167.setBackground(new java.awt.Color(255, 255, 255));
        jPanel167.setLayout(new java.awt.BorderLayout());

        jLabel427.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel427.setText("A");
        jPanel167.add(jLabel427, java.awt.BorderLayout.CENTER);

        jLabel428.setText("12");
        jLabel428.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel428.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel167.add(jLabel428, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel167);

        jPanel168.setBackground(new java.awt.Color(255, 255, 255));
        jPanel168.setLayout(new java.awt.BorderLayout());

        jLabel287.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel287.setText("A");
        jPanel168.add(jLabel287, java.awt.BorderLayout.CENTER);

        jLabel288.setText("1");
        jLabel288.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel288.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel168.add(jLabel288, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel168);

        jPanel169.setBackground(new java.awt.Color(255, 255, 255));
        jPanel169.setLayout(new java.awt.BorderLayout());

        jLabel289.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel289.setText("A");
        jPanel169.add(jLabel289, java.awt.BorderLayout.CENTER);

        jLabel290.setText("1");
        jLabel290.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel290.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel169.add(jLabel290, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel169);

        jPanel170.setBackground(new java.awt.Color(255, 255, 255));
        jPanel170.setLayout(new java.awt.BorderLayout());

        jLabel421.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel421.setText("A");
        jPanel170.add(jLabel421, java.awt.BorderLayout.CENTER);

        jLabel422.setText("1");
        jLabel422.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel422.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel170.add(jLabel422, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel170);

        jPanel171.setBackground(new java.awt.Color(255, 255, 255));
        jPanel171.setLayout(new java.awt.BorderLayout());

        jLabel291.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel291.setText("A");
        jPanel171.add(jLabel291, java.awt.BorderLayout.CENTER);

        jLabel292.setText("1");
        jLabel292.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel292.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel171.add(jLabel292, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel171);

        jPanel172.setBackground(new java.awt.Color(255, 255, 255));
        jPanel172.setLayout(new java.awt.BorderLayout());

        jLabel293.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel293.setText("A");
        jPanel172.add(jLabel293, java.awt.BorderLayout.CENTER);

        jLabel294.setText("1");
        jLabel294.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel294.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel172.add(jLabel294, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel172);

        jPanel173.setBackground(new java.awt.Color(255, 255, 255));
        jPanel173.setLayout(new java.awt.BorderLayout());

        jLabel295.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel295.setText("A");
        jPanel173.add(jLabel295, java.awt.BorderLayout.CENTER);

        jLabel296.setText("1");
        jLabel296.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel296.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel173.add(jLabel296, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel173);

        jPanel174.setBackground(new java.awt.Color(255, 255, 255));
        jPanel174.setLayout(new java.awt.BorderLayout());

        jLabel297.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel297.setText("A");
        jPanel174.add(jLabel297, java.awt.BorderLayout.CENTER);

        jLabel298.setText("1");
        jLabel298.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel298.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel174.add(jLabel298, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel174);

        jPanel175.setBackground(new java.awt.Color(255, 255, 255));
        jPanel175.setLayout(new java.awt.BorderLayout());

        jLabel299.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel299.setText("A");
        jPanel175.add(jLabel299, java.awt.BorderLayout.CENTER);

        jLabel300.setText("1");
        jLabel300.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel300.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel175.add(jLabel300, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel175);

        jPanel176.setBackground(new java.awt.Color(255, 255, 255));
        jPanel176.setLayout(new java.awt.BorderLayout());

        jLabel301.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel301.setText("A");
        jPanel176.add(jLabel301, java.awt.BorderLayout.CENTER);

        jLabel302.setText("1");
        jLabel302.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel302.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel176.add(jLabel302, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel176);

        jPanel177.setBackground(new java.awt.Color(255, 255, 255));
        jPanel177.setLayout(new java.awt.BorderLayout());

        jLabel413.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel413.setText("A");
        jPanel177.add(jLabel413, java.awt.BorderLayout.CENTER);

        jLabel414.setText("1");
        jLabel414.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel414.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel177.add(jLabel414, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel177);

        jPanel178.setBackground(new java.awt.Color(255, 255, 255));
        jPanel178.setLayout(new java.awt.BorderLayout());

        jLabel303.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel303.setText("A");
        jPanel178.add(jLabel303, java.awt.BorderLayout.CENTER);

        jLabel304.setText("1");
        jLabel304.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel304.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel178.add(jLabel304, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel178);

        jPanel179.setBackground(new java.awt.Color(255, 255, 255));
        jPanel179.setLayout(new java.awt.BorderLayout());

        jLabel411.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel411.setText("A");
        jPanel179.add(jLabel411, java.awt.BorderLayout.CENTER);

        jLabel412.setText("1");
        jLabel412.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel412.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel179.add(jLabel412, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel179);

        jPanel180.setBackground(new java.awt.Color(255, 255, 255));
        jPanel180.setLayout(new java.awt.BorderLayout());

        jLabel305.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel305.setText("A");
        jPanel180.add(jLabel305, java.awt.BorderLayout.CENTER);

        jLabel306.setText("1");
        jLabel306.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel306.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel180.add(jLabel306, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel180);

        jPanel181.setBackground(new java.awt.Color(255, 255, 255));
        jPanel181.setLayout(new java.awt.BorderLayout());

        jLabel307.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel307.setText("A");
        jPanel181.add(jLabel307, java.awt.BorderLayout.CENTER);

        jLabel308.setText("1");
        jLabel308.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel308.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel181.add(jLabel308, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel181);

        jPanel182.setBackground(new java.awt.Color(255, 255, 255));
        jPanel182.setLayout(new java.awt.BorderLayout());

        jLabel309.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel309.setText("A");
        jPanel182.add(jLabel309, java.awt.BorderLayout.CENTER);

        jLabel310.setText("1");
        jLabel310.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel310.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel182.add(jLabel310, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel182);

        jPanel183.setBackground(new java.awt.Color(255, 255, 255));
        jPanel183.setLayout(new java.awt.BorderLayout());

        jLabel311.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel311.setText("A");
        jPanel183.add(jLabel311, java.awt.BorderLayout.CENTER);

        jLabel312.setText("1");
        jLabel312.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel312.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel183.add(jLabel312, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel183);

        jPanel184.setBackground(new java.awt.Color(255, 255, 255));
        jPanel184.setLayout(new java.awt.BorderLayout());

        jLabel313.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel313.setText("A");
        jPanel184.add(jLabel313, java.awt.BorderLayout.CENTER);

        jLabel314.setText("1");
        jLabel314.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel314.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel184.add(jLabel314, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel184);

        jPanel185.setBackground(new java.awt.Color(255, 255, 255));
        jPanel185.setLayout(new java.awt.BorderLayout());

        jLabel423.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel423.setText("A");
        jPanel185.add(jLabel423, java.awt.BorderLayout.CENTER);

        jLabel424.setText("1");
        jLabel424.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel424.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel185.add(jLabel424, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel185);

        jPanel186.setBackground(new java.awt.Color(255, 255, 255));
        jPanel186.setLayout(new java.awt.BorderLayout());

        jLabel315.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel315.setText("A");
        jPanel186.add(jLabel315, java.awt.BorderLayout.CENTER);

        jLabel316.setText("1");
        jLabel316.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel316.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel186.add(jLabel316, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel186);

        jPanel187.setBackground(new java.awt.Color(255, 255, 255));
        jPanel187.setLayout(new java.awt.BorderLayout());

        jLabel317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel317.setText("A");
        jPanel187.add(jLabel317, java.awt.BorderLayout.CENTER);

        jLabel318.setText("1");
        jLabel318.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel318.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel187.add(jLabel318, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel187);

        jPanel188.setBackground(new java.awt.Color(255, 255, 255));
        jPanel188.setLayout(new java.awt.BorderLayout());

        jLabel429.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel429.setText("A");
        jPanel188.add(jLabel429, java.awt.BorderLayout.CENTER);

        jLabel430.setText("1");
        jLabel430.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel430.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel188.add(jLabel430, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel188);

        jPanel189.setBackground(new java.awt.Color(255, 255, 255));
        jPanel189.setLayout(new java.awt.BorderLayout());

        jLabel319.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel319.setText("A");
        jPanel189.add(jLabel319, java.awt.BorderLayout.CENTER);

        jLabel320.setText("1");
        jLabel320.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel320.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel189.add(jLabel320, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel189);

        jPanel190.setBackground(new java.awt.Color(255, 255, 255));
        jPanel190.setLayout(new java.awt.BorderLayout());

        jLabel321.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel321.setText("A");
        jPanel190.add(jLabel321, java.awt.BorderLayout.CENTER);

        jLabel322.setText("1");
        jLabel322.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel322.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel190.add(jLabel322, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel190);

        jPanel191.setBackground(new java.awt.Color(255, 255, 255));
        jPanel191.setLayout(new java.awt.BorderLayout());

        jLabel431.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel431.setText("A");
        jPanel191.add(jLabel431, java.awt.BorderLayout.CENTER);

        jLabel432.setText("1");
        jLabel432.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel432.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel191.add(jLabel432, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel191);

        jPanel192.setBackground(new java.awt.Color(255, 255, 255));
        jPanel192.setLayout(new java.awt.BorderLayout());

        jLabel323.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel323.setText("A");
        jPanel192.add(jLabel323, java.awt.BorderLayout.CENTER);

        jLabel324.setText("1");
        jLabel324.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel324.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel192.add(jLabel324, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel192);

        jPanel193.setBackground(new java.awt.Color(255, 255, 255));
        jPanel193.setLayout(new java.awt.BorderLayout());

        jLabel325.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel325.setText("A");
        jPanel193.add(jLabel325, java.awt.BorderLayout.CENTER);

        jLabel326.setText("1");
        jLabel326.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel326.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel193.add(jLabel326, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel193);

        jPanel194.setBackground(new java.awt.Color(255, 255, 255));
        jPanel194.setLayout(new java.awt.BorderLayout());

        jLabel327.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel327.setText("A");
        jPanel194.add(jLabel327, java.awt.BorderLayout.CENTER);

        jLabel328.setText("1");
        jLabel328.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel328.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel194.add(jLabel328, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel194);

        jPanel195.setBackground(new java.awt.Color(255, 255, 255));
        jPanel195.setLayout(new java.awt.BorderLayout());

        jLabel329.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel329.setText("A");
        jPanel195.add(jLabel329, java.awt.BorderLayout.CENTER);

        jLabel330.setText("1");
        jLabel330.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel330.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel195.add(jLabel330, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel195);

        jPanel196.setBackground(new java.awt.Color(255, 255, 255));
        jPanel196.setLayout(new java.awt.BorderLayout());

        jLabel433.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel433.setText("A");
        jPanel196.add(jLabel433, java.awt.BorderLayout.CENTER);

        jLabel434.setText("1");
        jLabel434.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel434.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel196.add(jLabel434, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel196);

        jPanel197.setBackground(new java.awt.Color(255, 255, 255));
        jPanel197.setLayout(new java.awt.BorderLayout());

        jLabel331.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel331.setText("A");
        jPanel197.add(jLabel331, java.awt.BorderLayout.CENTER);

        jLabel332.setText("14");
        jLabel332.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel332.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel197.add(jLabel332, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel197);

        jPanel198.setBackground(new java.awt.Color(255, 255, 255));
        jPanel198.setLayout(new java.awt.BorderLayout());

        jLabel333.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel333.setText("A");
        jPanel198.add(jLabel333, java.awt.BorderLayout.CENTER);

        jLabel334.setText("1");
        jLabel334.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel334.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel198.add(jLabel334, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel198);

        jPanel199.setBackground(new java.awt.Color(255, 255, 255));
        jPanel199.setLayout(new java.awt.BorderLayout());

        jLabel447.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel447.setText("A");
        jPanel199.add(jLabel447, java.awt.BorderLayout.CENTER);

        jLabel448.setText("1");
        jLabel448.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel448.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel199.add(jLabel448, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel199);

        jPanel200.setBackground(new java.awt.Color(255, 255, 255));
        jPanel200.setLayout(new java.awt.BorderLayout());

        jLabel335.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel335.setText("A");
        jPanel200.add(jLabel335, java.awt.BorderLayout.CENTER);

        jLabel336.setText("1");
        jLabel336.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel336.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel200.add(jLabel336, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel200);

        jPanel201.setBackground(new java.awt.Color(255, 255, 255));
        jPanel201.setLayout(new java.awt.BorderLayout());

        jLabel337.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel337.setText("A");
        jPanel201.add(jLabel337, java.awt.BorderLayout.CENTER);

        jLabel338.setText("1");
        jLabel338.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel338.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel201.add(jLabel338, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel201);

        jPanel202.setBackground(new java.awt.Color(255, 255, 255));
        jPanel202.setLayout(new java.awt.BorderLayout());

        jLabel339.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel339.setText("A");
        jPanel202.add(jLabel339, java.awt.BorderLayout.CENTER);

        jLabel340.setText("1");
        jLabel340.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel340.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel202.add(jLabel340, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel202);

        jPanel203.setBackground(new java.awt.Color(255, 255, 255));
        jPanel203.setLayout(new java.awt.BorderLayout());

        jLabel443.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel443.setText("A");
        jPanel203.add(jLabel443, java.awt.BorderLayout.CENTER);

        jLabel444.setText("1");
        jLabel444.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel444.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel203.add(jLabel444, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel203);

        jPanel204.setBackground(new java.awt.Color(255, 255, 255));
        jPanel204.setLayout(new java.awt.BorderLayout());

        jLabel341.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel341.setText("A");
        jPanel204.add(jLabel341, java.awt.BorderLayout.CENTER);

        jLabel342.setText("1");
        jLabel342.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel342.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel204.add(jLabel342, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel204);

        jPanel205.setBackground(new java.awt.Color(255, 255, 255));
        jPanel205.setLayout(new java.awt.BorderLayout());

        jLabel343.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel343.setText("A");
        jPanel205.add(jLabel343, java.awt.BorderLayout.CENTER);

        jLabel344.setText("1");
        jLabel344.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel344.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel205.add(jLabel344, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel205);

        jPanel206.setBackground(new java.awt.Color(255, 255, 255));
        jPanel206.setLayout(new java.awt.BorderLayout());

        jLabel345.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel345.setText("A");
        jPanel206.add(jLabel345, java.awt.BorderLayout.CENTER);

        jLabel346.setText("1");
        jLabel346.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel346.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel206.add(jLabel346, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel206);

        jPanel207.setBackground(new java.awt.Color(255, 255, 255));
        jPanel207.setLayout(new java.awt.BorderLayout());

        jLabel437.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel437.setText("A");
        jPanel207.add(jLabel437, java.awt.BorderLayout.CENTER);

        jLabel438.setText("1");
        jLabel438.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel438.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel207.add(jLabel438, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel207);

        jPanel208.setBackground(new java.awt.Color(255, 255, 255));
        jPanel208.setLayout(new java.awt.BorderLayout());

        jLabel347.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel347.setText("A");
        jPanel208.add(jLabel347, java.awt.BorderLayout.CENTER);

        jLabel348.setText("1");
        jLabel348.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel348.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel208.add(jLabel348, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel208);

        jPanel209.setBackground(new java.awt.Color(255, 255, 255));
        jPanel209.setLayout(new java.awt.BorderLayout());

        jLabel349.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel349.setText("A");
        jPanel209.add(jLabel349, java.awt.BorderLayout.CENTER);

        jLabel350.setText("1");
        jLabel350.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel350.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel209.add(jLabel350, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel209);

        jPanel210.setBackground(new java.awt.Color(255, 255, 255));
        jPanel210.setLayout(new java.awt.BorderLayout());

        jLabel351.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel351.setText("A");
        jPanel210.add(jLabel351, java.awt.BorderLayout.CENTER);

        jLabel352.setText("1");
        jLabel352.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel352.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel210.add(jLabel352, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel210);

        jPanel211.setBackground(new java.awt.Color(255, 255, 255));
        jPanel211.setLayout(new java.awt.BorderLayout());

        jLabel435.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel435.setText("A");
        jPanel211.add(jLabel435, java.awt.BorderLayout.CENTER);

        jLabel436.setText("1");
        jLabel436.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel436.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel211.add(jLabel436, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel211);

        jPanel212.setBackground(new java.awt.Color(255, 255, 255));
        jPanel212.setLayout(new java.awt.BorderLayout());

        jLabel353.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel353.setText("A");
        jPanel212.add(jLabel353, java.awt.BorderLayout.CENTER);

        jLabel354.setText("15");
        jLabel354.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel354.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel212.add(jLabel354, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel212);

        jPanel213.setBackground(new java.awt.Color(255, 255, 255));
        jPanel213.setLayout(new java.awt.BorderLayout());

        jLabel449.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel449.setText("A");
        jPanel213.add(jLabel449, java.awt.BorderLayout.CENTER);

        jLabel450.setText("1");
        jLabel450.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel450.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel213.add(jLabel450, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel213);

        jPanel214.setBackground(new java.awt.Color(255, 255, 255));
        jPanel214.setLayout(new java.awt.BorderLayout());

        jLabel355.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel355.setText("A");
        jPanel214.add(jLabel355, java.awt.BorderLayout.CENTER);

        jLabel356.setText("1");
        jLabel356.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel356.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel214.add(jLabel356, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel214);

        jPanel215.setBackground(new java.awt.Color(255, 255, 255));
        jPanel215.setLayout(new java.awt.BorderLayout());

        jLabel445.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel445.setText("A");
        jPanel215.add(jLabel445, java.awt.BorderLayout.CENTER);

        jLabel446.setText("1");
        jLabel446.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel446.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel215.add(jLabel446, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel215);

        jPanel216.setBackground(new java.awt.Color(255, 255, 255));
        jPanel216.setLayout(new java.awt.BorderLayout());

        jLabel357.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel357.setText("A");
        jPanel216.add(jLabel357, java.awt.BorderLayout.CENTER);

        jLabel358.setText("1");
        jLabel358.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel358.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel216.add(jLabel358, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel216);

        jPanel217.setBackground(new java.awt.Color(255, 255, 255));
        jPanel217.setLayout(new java.awt.BorderLayout());

        jLabel359.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel359.setText("A");
        jPanel217.add(jLabel359, java.awt.BorderLayout.CENTER);

        jLabel360.setText("1");
        jLabel360.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel360.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel217.add(jLabel360, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel217);

        jPanel218.setBackground(new java.awt.Color(255, 255, 255));
        jPanel218.setLayout(new java.awt.BorderLayout());

        jLabel361.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel361.setText("A");
        jPanel218.add(jLabel361, java.awt.BorderLayout.CENTER);

        jLabel362.setText("1");
        jLabel362.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel362.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel218.add(jLabel362, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel218);

        jPanel219.setBackground(new java.awt.Color(255, 255, 255));
        jPanel219.setLayout(new java.awt.BorderLayout());

        jLabel363.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel363.setText("A");
        jPanel219.add(jLabel363, java.awt.BorderLayout.CENTER);

        jLabel364.setText("1");
        jLabel364.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel364.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel219.add(jLabel364, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel219);

        jPanel220.setBackground(new java.awt.Color(255, 255, 255));
        jPanel220.setLayout(new java.awt.BorderLayout());

        jLabel365.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel365.setText("A");
        jPanel220.add(jLabel365, java.awt.BorderLayout.CENTER);

        jLabel366.setText("1");
        jLabel366.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel366.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel220.add(jLabel366, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel220);

        jPanel221.setBackground(new java.awt.Color(255, 255, 255));
        jPanel221.setLayout(new java.awt.BorderLayout());

        jLabel367.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel367.setText("A");
        jPanel221.add(jLabel367, java.awt.BorderLayout.CENTER);

        jLabel368.setText("1");
        jLabel368.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel368.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel221.add(jLabel368, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel221);

        jPanel222.setBackground(new java.awt.Color(255, 255, 255));
        jPanel222.setLayout(new java.awt.BorderLayout());

        jLabel441.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel441.setText("A");
        jPanel222.add(jLabel441, java.awt.BorderLayout.CENTER);

        jLabel442.setText("1");
        jLabel442.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel442.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel222.add(jLabel442, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel222);

        jPanel223.setBackground(new java.awt.Color(255, 255, 255));
        jPanel223.setLayout(new java.awt.BorderLayout());

        jLabel369.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel369.setText("A");
        jPanel223.add(jLabel369, java.awt.BorderLayout.CENTER);

        jLabel370.setText("1");
        jLabel370.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel370.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel223.add(jLabel370, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel223);

        jPanel224.setBackground(new java.awt.Color(255, 255, 255));
        jPanel224.setLayout(new java.awt.BorderLayout());

        jLabel439.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel439.setText("A");
        jPanel224.add(jLabel439, java.awt.BorderLayout.CENTER);

        jLabel440.setText("1");
        jLabel440.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel440.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel224.add(jLabel440, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel224);

        jPanel225.setBackground(new java.awt.Color(255, 255, 255));
        jPanel225.setLayout(new java.awt.BorderLayout());

        jLabel371.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel371.setText("A");
        jPanel225.add(jLabel371, java.awt.BorderLayout.CENTER);

        jLabel372.setText("1");
        jLabel372.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel372.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel225.add(jLabel372, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel225);

        jPanel226.setBackground(new java.awt.Color(255, 255, 255));
        jPanel226.setLayout(new java.awt.BorderLayout());

        jLabel373.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel373.setText("A");
        jPanel226.add(jLabel373, java.awt.BorderLayout.CENTER);

        jLabel374.setText("1");
        jLabel374.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel374.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel226.add(jLabel374, java.awt.BorderLayout.NORTH);

        jPanel1.add(jPanel226);

        jLabel451.setText("Time:");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel452.setText("Score:");

        jLabel453.setText("Clue List");

        jLabel454.setText("Horizontal");

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel455.setText("Vertical");

        javax.swing.GroupLayout jPanel227Layout = new javax.swing.GroupLayout(jPanel227);
        jPanel227.setLayout(jPanel227Layout);
        jPanel227Layout.setHorizontalGroup(
            jPanel227Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel227Layout.createSequentialGroup()
                .addGroup(jPanel227Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel227Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel227Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel452, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel451, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel227Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel227Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel453))
                    .addGroup(jPanel227Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel455))
                    .addGroup(jPanel227Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel454)))
                .addContainerGap())
        );
        jPanel227Layout.setVerticalGroup(
            jPanel227Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel227Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel227Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel227Layout.createSequentialGroup()
                        .addComponent(jLabel453)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel227Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel455)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel454)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel227Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel452, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel227Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel451, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        buttonSaveGame.setText("Save Game");
        buttonSaveGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveGameActionPerformed(evt);
            }
        });

        buttonScoreGame.setText("Score Game");
        buttonScoreGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buttonScoreGameMouseReleased(evt);
            }
        });
        buttonScoreGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonScoreGameActionPerformed(evt);
            }
        });

        buttonQuitAndSave.setText("Quit and Save");

        buttonNewGame.setText("Start New Game");
        buttonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNewGameActionPerformed(evt);
            }
        });

        buttonViewStats.setText("View Stats");
        buttonViewStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewStatsActionPerformed(evt);
            }
        });

        buttonQUIT.setText("Quit");
        buttonQUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonQUITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel227, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonSaveGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonScoreGame, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(buttonViewStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonQUIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonQuitAndSave, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel227, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSaveGame)
                    .addComponent(buttonScoreGame)
                    .addComponent(buttonQuitAndSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNewGame)
                    .addComponent(buttonViewStats)
                    .addComponent(buttonQUIT))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSaveGameActionPerformed

    private void buttonScoreGameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonScoreGameMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buttonScoreGameMouseReleased

    private void buttonQUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonQUITActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buttonQUITActionPerformed

    private void buttonScoreGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonScoreGameActionPerformed
        // TODO add your handling code here:
        Data d = Data.getInstance();
        //d.uScore = score(board);
    }//GEN-LAST:event_buttonScoreGameActionPerformed

    private void buttonViewStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewStatsActionPerformed
        playerStatsFrame psf = new playerStatsFrame();
        psf.setVisible(true);
    }//GEN-LAST:event_buttonViewStatsActionPerformed

    private void buttonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNewGameActionPerformed
        // TODO add your handling code here:
        puzzleSelectorFrame puzzleSelector = new puzzleSelectorFrame();
        puzzleSelector.setVisible(true);
    }//GEN-LAST:event_buttonNewGameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Data d = Data.getInstance();
        d.uScore = 0;
        loginFrame lf = new loginFrame();
        lf.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new guiFrame().setVisible(true);
            }
        });
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonNewGame;
    private javax.swing.JButton buttonQUIT;
    private javax.swing.JButton buttonQuitAndSave;
    private javax.swing.JButton buttonSaveGame;
    private javax.swing.JButton buttonScoreGame;
    private javax.swing.JButton buttonViewStats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel305;
    private javax.swing.JLabel jLabel306;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel310;
    private javax.swing.JLabel jLabel311;
    private javax.swing.JLabel jLabel312;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel321;
    private javax.swing.JLabel jLabel322;
    private javax.swing.JLabel jLabel323;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel325;
    private javax.swing.JLabel jLabel326;
    private javax.swing.JLabel jLabel327;
    private javax.swing.JLabel jLabel328;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel333;
    private javax.swing.JLabel jLabel334;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel336;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel339;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel340;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel342;
    private javax.swing.JLabel jLabel343;
    private javax.swing.JLabel jLabel344;
    private javax.swing.JLabel jLabel345;
    private javax.swing.JLabel jLabel346;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel349;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel352;
    private javax.swing.JLabel jLabel353;
    private javax.swing.JLabel jLabel354;
    private javax.swing.JLabel jLabel355;
    private javax.swing.JLabel jLabel356;
    private javax.swing.JLabel jLabel357;
    private javax.swing.JLabel jLabel358;
    private javax.swing.JLabel jLabel359;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel360;
    private javax.swing.JLabel jLabel361;
    private javax.swing.JLabel jLabel362;
    private javax.swing.JLabel jLabel363;
    private javax.swing.JLabel jLabel364;
    private javax.swing.JLabel jLabel365;
    private javax.swing.JLabel jLabel366;
    private javax.swing.JLabel jLabel367;
    private javax.swing.JLabel jLabel368;
    private javax.swing.JLabel jLabel369;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel370;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel372;
    private javax.swing.JLabel jLabel373;
    private javax.swing.JLabel jLabel374;
    private javax.swing.JLabel jLabel375;
    private javax.swing.JLabel jLabel376;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
    private javax.swing.JLabel jLabel382;
    private javax.swing.JLabel jLabel383;
    private javax.swing.JLabel jLabel384;
    private javax.swing.JLabel jLabel385;
    private javax.swing.JLabel jLabel386;
    private javax.swing.JLabel jLabel387;
    private javax.swing.JLabel jLabel388;
    private javax.swing.JLabel jLabel389;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel390;
    private javax.swing.JLabel jLabel391;
    private javax.swing.JLabel jLabel392;
    private javax.swing.JLabel jLabel393;
    private javax.swing.JLabel jLabel394;
    private javax.swing.JLabel jLabel395;
    private javax.swing.JLabel jLabel396;
    private javax.swing.JLabel jLabel397;
    private javax.swing.JLabel jLabel398;
    private javax.swing.JLabel jLabel399;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel400;
    private javax.swing.JLabel jLabel401;
    private javax.swing.JLabel jLabel402;
    private javax.swing.JLabel jLabel403;
    private javax.swing.JLabel jLabel404;
    private javax.swing.JLabel jLabel405;
    private javax.swing.JLabel jLabel406;
    private javax.swing.JLabel jLabel407;
    private javax.swing.JLabel jLabel408;
    private javax.swing.JLabel jLabel409;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel410;
    private javax.swing.JLabel jLabel411;
    private javax.swing.JLabel jLabel412;
    private javax.swing.JLabel jLabel413;
    private javax.swing.JLabel jLabel414;
    private javax.swing.JLabel jLabel415;
    private javax.swing.JLabel jLabel416;
    private javax.swing.JLabel jLabel417;
    private javax.swing.JLabel jLabel418;
    private javax.swing.JLabel jLabel419;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel420;
    private javax.swing.JLabel jLabel421;
    private javax.swing.JLabel jLabel422;
    private javax.swing.JLabel jLabel423;
    private javax.swing.JLabel jLabel424;
    private javax.swing.JLabel jLabel425;
    private javax.swing.JLabel jLabel426;
    private javax.swing.JLabel jLabel427;
    private javax.swing.JLabel jLabel428;
    private javax.swing.JLabel jLabel429;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel430;
    private javax.swing.JLabel jLabel431;
    private javax.swing.JLabel jLabel432;
    private javax.swing.JLabel jLabel433;
    private javax.swing.JLabel jLabel434;
    private javax.swing.JLabel jLabel435;
    private javax.swing.JLabel jLabel436;
    private javax.swing.JLabel jLabel437;
    private javax.swing.JLabel jLabel438;
    private javax.swing.JLabel jLabel439;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel440;
    private javax.swing.JLabel jLabel441;
    private javax.swing.JLabel jLabel442;
    private javax.swing.JLabel jLabel443;
    private javax.swing.JLabel jLabel444;
    private javax.swing.JLabel jLabel445;
    private javax.swing.JLabel jLabel446;
    private javax.swing.JLabel jLabel447;
    private javax.swing.JLabel jLabel448;
    private javax.swing.JLabel jLabel449;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel450;
    private javax.swing.JLabel jLabel451;
    private javax.swing.JLabel jLabel452;
    private javax.swing.JLabel jLabel453;
    private javax.swing.JLabel jLabel454;
    private javax.swing.JLabel jLabel455;
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
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel107;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel168;
    private javax.swing.JPanel jPanel169;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel170;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel174;
    private javax.swing.JPanel jPanel175;
    private javax.swing.JPanel jPanel176;
    private javax.swing.JPanel jPanel177;
    private javax.swing.JPanel jPanel178;
    private javax.swing.JPanel jPanel179;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel180;
    private javax.swing.JPanel jPanel181;
    private javax.swing.JPanel jPanel182;
    private javax.swing.JPanel jPanel183;
    private javax.swing.JPanel jPanel184;
    private javax.swing.JPanel jPanel185;
    private javax.swing.JPanel jPanel186;
    private javax.swing.JPanel jPanel187;
    private javax.swing.JPanel jPanel188;
    private javax.swing.JPanel jPanel189;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel190;
    private javax.swing.JPanel jPanel191;
    private javax.swing.JPanel jPanel192;
    private javax.swing.JPanel jPanel193;
    private javax.swing.JPanel jPanel194;
    private javax.swing.JPanel jPanel195;
    private javax.swing.JPanel jPanel196;
    private javax.swing.JPanel jPanel197;
    private javax.swing.JPanel jPanel198;
    private javax.swing.JPanel jPanel199;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel200;
    private javax.swing.JPanel jPanel201;
    private javax.swing.JPanel jPanel202;
    private javax.swing.JPanel jPanel203;
    private javax.swing.JPanel jPanel204;
    private javax.swing.JPanel jPanel205;
    private javax.swing.JPanel jPanel206;
    private javax.swing.JPanel jPanel207;
    private javax.swing.JPanel jPanel208;
    private javax.swing.JPanel jPanel209;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel210;
    private javax.swing.JPanel jPanel211;
    private javax.swing.JPanel jPanel212;
    private javax.swing.JPanel jPanel213;
    private javax.swing.JPanel jPanel214;
    private javax.swing.JPanel jPanel215;
    private javax.swing.JPanel jPanel216;
    private javax.swing.JPanel jPanel217;
    private javax.swing.JPanel jPanel218;
    private javax.swing.JPanel jPanel219;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel220;
    private javax.swing.JPanel jPanel221;
    private javax.swing.JPanel jPanel222;
    private javax.swing.JPanel jPanel223;
    private javax.swing.JPanel jPanel224;
    private javax.swing.JPanel jPanel225;
    private javax.swing.JPanel jPanel226;
    private javax.swing.JPanel jPanel227;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel[][][] my_jlabelHolder;
}
