//Jhoan David Fiat Restrepo - A00359132

import java.Util.ArrayList;

// SuperMercado
 public class Supermercado{
 
 public ArrayList<Cliente> darClientesSimilares(Cliente cliente){
 
 int i =0;
 int i1=0;
 int i2=0;
 int i3=0;
 int i4=0;
 int i5=1;
 
 ArrayList list=null;
 
 
 while(i<clientes.get(i).size()){
	 
	 
	 if((clientes.get(i).OldClient)||clientes.get(i5).OldClient()){
	 
	 list= new ArrayList<Cliente>();
	 
	 while (clientes.get(i1).(darProductosPreferidos.lenght)>i1){
		 
	
		 int counter=0;
	 
		 if(i1==i2){
			 i2++
		 }
		 
		// while (i1<clientes(i1).size){
			i2=0;
			while (i2<clientes(i2).size){
				i3=0;
				while (i3<clientes(i1).darProductosPreferidos.lenght){
					i4=0;
					while(i4<clientes(i2).darProductosPreferidos.lenght){
						if ((clientes.get(i1).darProductosPreferidos[i3]!=null)||(clientes.get(i2).darProductosPreferidos[i4])!=null){
							if (clientes.get(i1).darProductosPreferidos[i3].darNombre().equals(clientes.get(i2).darProductosPreferidos[i4].darNombre())){
							counter++;
						}
					}

					i4++;
			}
			 
			 i3++;
			}
			
					
					if(counter>=5){
					lista.add.clientes.get(i1);
				
							}
				
			
			
			
		 i2++;
		}
		 
	
	 i1++ 
	 
	}
 	i5++;  v
	i++;
	      }	
		}
	 }
 }

//Cliente 
 public class Cliente{
	 
	 
	 public boolean OldClient(){
		 
		boolean old = false;
		int cuantos =0;
		
		for( int i=0; i < (productosPreferidos.lenght); i++){
			
			if (productosPreferidos[i]!= null){
				
				cuantos++;			
				}
		}
		  			 
		if (cuantos>=5){
			
			old=true;
		} 
		 
		 return old;
	 }
	 
	 
	 
	
 }

//Producto
 public class Producto{
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 }
 