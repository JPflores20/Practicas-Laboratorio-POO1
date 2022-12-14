package mx.edu.elextra.extraeval.ventanas;
import mx.edu.elextra.extraeval.acciones.Procesos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame{
	public Ventana(){
		initComponents();
		setJMenuBar(mb);
		mb.add(mnFile);
		mnFile.add(miOpen);
		mnFile.addSeparator();
		mnFile.add(miSalir);
		mb.add(mnSort);
		mnSort.add(miMarca);
		mnSort.add(miCosto);
		add(lbMarca);
		add(txMarca);
		add(lbCosto);
		add(txCosto);
		add(lbRamP);
		add(txRamP);
		add(btnPrev);
		add(lbIdx);
		add(btnNext);
		add(lbTipoOrd);
	}
	private void initComponents(){
		// Establecer el el tipo de JFrame como un FlowLayout
		setLayout(new FlowLayout());
		// Establecer el cierre de la aplicación al cerrar la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Crear la Barra de Menú mb
		JMenuBar mb=new JMenuBar();
		// Crear el Menú mnFile "Archivo"
		JMenu mnFile=new JMenu("Archivo");
		// Crear el Menú Item miOpen "Abrir"
		JMenuItem miOpen=new JMenuItem("Abrir");
		// Agregar al miOpen la clase anónima que manda llamar a los métodos siguientes:
		miOpen.addActionListener(new ActionListener(){
			public void actionPerformed(Event e){
				Procesos.openFile();
				Procesos.getPrev(txMarca, txCosto, txRamP, lbIdx);
			}
		}); 
				
		//
		// Crear el Menú Item miOpen "Salir"
		JMenuItem miSalir=new JMenuItem("Salir");
		// Agregar al miOpen la clase anónima que manda llamar al método siguientes:
		miSalir.addActionListener(new ActionListener(){
			public void actionPerformed(Event e){
				dispose();
			}
		}); 
				
		// Crear el menú mnSort "Ordenar por ..."
		JMenu mnSort=new JMenu("Ordenar por ...");
		// Crear el Menú Item miMarca "Marca"
		JMenuItem miMarca=new JMenuItem("Marca");
		// Crear el Menú Item miCosto "Costo"
		JMenuItem miCosto=new JMenuItem("Costo");
		// Crear la etiqueta lbMarca "Marca"
		JLabel lbMarca=new JLabel("Marca");
		// Crear la etiqueta lbMarca "Costo"
		JLabel lbCosto=new JLabel("Costo");
		// Crear la etiqueta lbRamP "Ram/Proc"
		JLabel lbRamP=new JLabel("Ram/Proc");
		// Crear el campo de texto txMarca de tamaño 20
		JTextField txMarca=new JTextField(20);
		// Crear el campo de texto txCosto de tamaño 20
		JTextField txCosto=new JTextField(20);
		// Crear el campo de texto txRamP de tamaño 20
		JTextField txRamP=new JTextField(20);
		// Crear el botón btnPrev " <- "
		JButton btnPrev=new JButton(" <- ");
		// Crear el botón btnNext " -> "
		JButton btnNext=new JButton(" -> ");
		// Crear la etiqueta lbIdx "0/0"
		JLabel lbIdx=new JLabel("0/0");
		String espacios = "       ";
		// Crear la etiqueta Label ordenando lbTipoOrd espacios+"Tipo de Ordenamiento"+espacios
		JLabel lbTipoOrd=new JLabel(espacios+"Tipo de Ordenamiento"+espacios);
		// Agregar al btnPrev la clase anónima que manda llamar al método siguientes:
		btnPrev.addActionListener(new ActionListener(){
			public void actionPerformed(Event e){
				Procesos.getPrev(txMarca, txCosto, txRamP, lbIdx);
			}
		}); 
				

		// Agregar al btnNext la clase anónima que manda llamar al método siguientes:
		btnNext.addActionListener(new ActionListener(){
			public void actionPerformed(Event e){
				Procesos.getNext(txMarca, txCosto, txRamP, lbIdx);
			}
		});
				

		// Agregar al miMarca la clase anónima que manda llamar a los métodos siguientes: 
		miMarca.addActionListener(new ActionListener(){
			public void actionPerformed(Event e){
				lbTipoOrd.setText(espacios+"Ordenados por Marca"+espacios);
				Procesos.sortMarca();
			}
		});
				

		
		// Agregar al miCosto la clase anónima que manda llamar a los métodos siguientes: 
		miMarca.addActionListener(new ActionListener(){
			public void actionPerformed(Event e){
				lbTipoOrd.setText(espacios+"Ordenados por Costo"+espacios);
				Procesos.sortCosto();
			}
		});		

		setSize(330,350);
	}
	JMenuBar mb;
	JMenu mnFile,mnSort;
	JMenuItem miOpen, miSalir, miMarca, miCosto;
	JLabel lbMarca, lbModelo, lbCosto, lbRamP, lbTipoOrd, lbIdx;
	JTextField txMarca, txCosto, txRamP;
	JButton btnPrev, btnNext;
}