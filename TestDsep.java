import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

class D_seperation{
	


}

public class TestDsep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	D_seperation d=new D_seperation();
	//total number of nodes
	int totalnodes=0;
	//child key value pair
	ArrayList<String>X=new ArrayList<String>();
	ArrayList<String>Y=new ArrayList<String>();
	ArrayList<String>Z=new ArrayList<String>();
	ArrayList<String>W=new ArrayList<String>();
	HashMap<String,Integer> hashchild=new HashMap<>();
	//parent key value pair
	HashMap<String,Integer> hashparent=new HashMap<>();
	//cardinality of each node
	ArrayList<String>Cardinality=new ArrayList<>();
	ArrayList<String>hash_child=new ArrayList<>();
	ArrayList<String>hash_parent=new ArrayList<>();
	ArrayList<Integer>Cardinality_child=new ArrayList<>();
	ArrayList<Integer>Cardinality_parent=new ArrayList<>();
	//node_name and id
	HashMap<String,String>hash_node_label=new HashMap<>();
	Cardinality.add("yes");
	Cardinality.add("no");

	//d.read(args[0]);
	Scanner read_val,read_input;
	try {
		read_val = new Scanner(new File(args[0]));
		read_input=new Scanner(new File(args[1]));

		//obtain nodes
		String line=read_val.nextLine();
		Scanner s=new Scanner(line);
		int nodes=s.nextInt();
		totalnodes=nodes;
		System.out.println("total nodes are "+totalnodes);
		line=read_val.nextLine();
		line=read_val.nextLine();
		//paragraph 1
		
		//variable name
		line=read_val.nextLine();
		String[] var_0_label=line.split(" ");
		System.out.println("the first node from the input file is "+var_0_label[0]);
		//cardinality of the node 0
		hash_node_label.put("0",var_0_label[0]);
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		//number of children
		String[] child_setup=line.split(" ");
		int child_size=Integer.parseInt(child_setup[0]);
		Cardinality_child.add(child_size);
		System.out.println(child_setup[0]);
		System.out.println(child_setup[2]);
		hash_child.add("alarm");
		line=read_val.nextLine();
		//number of parents
		String[] parent_setup=line.split(" ");
		System.out.println(parent_setup[0]);
		int parent_size=Integer.parseInt(parent_setup[0]);
		hash_parent.add("NULL");	
		Cardinality_parent.add(parent_size);
		System.out.println(parent_setup[2]);
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		
		//paragraph 2
		
		String[] var_1_label=line.split(" ");
		System.out.println("the second node from the input file "+var_1_label[0]);
		//cardinality of the node 0
		hash_node_label.put("1",var_1_label[0]);
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		//number of children
		String[] child_setup_node_2=line.split(" ");
		int child_size_node_2=Integer.parseInt(child_setup_node_2[0]);
		Cardinality_child.add(child_size_node_2);
		System.out.println(child_setup_node_2[0]);
		System.out.println(child_setup_node_2[2]);
		hash_child.add("leaving");
		line=read_val.nextLine();
		//number of parents
		String[] parent_setup_node_2=line.split(" ");
		System.out.println(parent_setup_node_2[0]);
		int parent_size_node_2=Integer.parseInt(parent_setup_node_2[0]);
		hash_parent.add("tampering");
		hash_parent.add("fire");
		Cardinality_parent.add(parent_size_node_2);
		System.out.println(parent_setup_node_2[2]);
		System.out.println(parent_setup_node_2[3]);
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		
		//paragraph 3
		
		String[] var_3_label=line.split(" ");
		System.out.println("the third node from the input file "+var_3_label[0]);
		//cardinality of the node 0
		hash_node_label.put("2",var_3_label[0]);
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		//number of children
		String[] child_setup_node_3=line.split(" ");
		int child_size_node_3=Integer.parseInt(child_setup_node_3[0]);
		Cardinality_child.add(child_size_node_3);
		System.out.println(child_setup_node_3[0]);
		System.out.println(child_setup_node_3[2]);
		hash_child.add("report");
		line=read_val.nextLine();
		//number of parents
		String[] parent_setup_node_3=line.split(" ");
		System.out.println(parent_setup_node_3[0]);
		int parent_size_node_3=Integer.parseInt(parent_setup_node_3[0]);
		hash_parent.add("alarm");
		Cardinality_parent.add(parent_size_node_3);
		System.out.println(parent_setup_node_3[2]);
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		
		//paragraph 4
		String[] var_4_label=line.split(" ");
		System.out.println("the fourth node from the input file "+var_4_label[0]);
		//cardinality of the node 0
		hash_node_label.put("3",var_4_label[0]);
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		//number of children
		String[] child_setup_node_4=line.split(" ");
		int child_size_node_4=Integer.parseInt(child_setup_node_4[0]);
		Cardinality_child.add(child_size_node_4);
		System.out.println(child_setup_node_4[0]);
		System.out.println(child_setup_node_4[2]);
		hash_child.add("NULL");
		line=read_val.nextLine();
		//number of parents
		String[] parent_setup_node_4=line.split(" ");
		System.out.println(parent_setup_node_4[0]);
		int parent_size_node_4=Integer.parseInt(parent_setup_node_4[0]);
		hash_parent.add("leaving");
		Cardinality_parent.add(parent_size_node_4);
		System.out.println(parent_setup_node_4[2]);
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		
		//paragraph 5
		
		String[] var_5_label=line.split(" ");
		System.out.println("the fifth node from the input file "+var_5_label[0]);
		//cardinality of the node 0
		hash_node_label.put("4",var_5_label[0]);
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		//number of children
		String[] child_setup_node_5=line.split(" ");
		int child_size_node_5=Integer.parseInt(child_setup_node_5[0]);
		Cardinality_child.add(child_size_node_5);
		System.out.println(child_setup_node_5[0]);
		System.out.println(child_setup_node_5[2]);
		System.out.println(child_setup_node_5[3]);
		hash_child.add("alarm");
		hash_child.add("smoke");
		line=read_val.nextLine();
		//number of parents
		String[] parent_setup_node_5=line.split(" ");
		System.out.println(parent_setup_node_5[0]);
		int parent_size_node_5=Integer.parseInt(parent_setup_node_5[0]);
		hash_parent.add("NULL");
		Cardinality_parent.add(parent_size_node_5);
		System.out.println(parent_setup_node_5[2]);
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		
		//paragraph 6
		String[] var_6_label=line.split(" ");
		System.out.println("the sixth node from the input file "+var_6_label[0]);
		//cardinality of the node 0
		hash_node_label.put("5",var_6_label[0]);
		line=read_val.nextLine();
		line=read_val.nextLine();
		line=read_val.nextLine();
		//number of children
		String[] child_setup_node_6=line.split(" ");
		int child_size_node_6=Integer.parseInt(child_setup_node_6[0]);
		Cardinality_child.add(child_size_node_6);
		System.out.println(child_setup_node_6[0]);
		System.out.println(child_setup_node_6[2]);
		hash_child.add("NULL");
		line=read_val.nextLine();
		//number of parents
		String[] parent_setup_node_6=line.split(" ");
		System.out.println(parent_setup_node_6[0]);
		int parent_size_node_6=Integer.parseInt(parent_setup_node_6[0]);
		hash_parent.add("fire");
		Cardinality_parent.add(parent_size_node_6);
		System.out.println(parent_setup_node_6[2]);
		s.close();
		/*while(read_val.hasNext()) {
		System.out.println(read_val);
		read_val.nextLine();
		}
		*/
		
		read_val.close();
		
		//read the input file here
		String inputline=read_input.nextLine();
		Scanner s1=new Scanner(inputline);
		X.add(s1.next());
		inputline=read_input.nextLine();
		String[] setup=inputline.split(" ");
		if(setup.length>1) {
		Y.add(setup[0]);
		Y.add(setup[1]);
		}else {
			Y.add(setup[0]);
		}
		inputline=read_input.nextLine();
		Z.add(inputline);
		for(int i=0;i<X.size();i++) {
			W.add(X.get(i));
		}
		for(int i=0;i<Y.size();i++) {
			W.add(Y.get(i));
		}
		for(int i=0;i<Z.size();i++) {
			W.add(Z.get(i));
		}
		//Z.add(s1.next());
		/*while(read_input.hasNext()) {
			System.out.println(read_input.next());
		}
		*/
		
		/*s1.next();
		String[] setup=input_line.split(" ");
		Y.add(setup[0]);
		Y.add(setup[2]);
		input_line=s1.nextLine();
		Z.add(s1.next());
		*/
	
		s1.close();
		read_input.close();
		System.out.println("the elements in the set X are");
		for(String i:X) {
			System.out.println(i);
		}
		System.out.println("the elements in the set Y are");
		for(String j:Y) {
			System.out.println(j);
		}
		System.out.println("the elements in the set Z are");
		for(String k:Z) {
			System.out.println(k);
		}
	
		//ancestral subgraph-------------lets go
		ArrayList<Integer>processing_nodes=new ArrayList<Integer>();
		for(int i=0;i<Cardinality_child.size();i++) {
			if(Cardinality_child.get(i)==0) {
			processing_nodes.add(i);	
			}
		}
		String a1,a2;
		a1=hash_node_label.get(Integer.toString(processing_nodes.get(0)));
		a2=hash_node_label.get(Integer.toString(processing_nodes.get(1)));
	
		int counter_1=1,counter_2=1;
		for(int i=0;i<W.size();i++) {
			if(W.get(i).equals(a1)) {
				counter_1=0;
			}
			if(W.get(i).equals(a2)) {
				counter_2=0;
			}
		}
		//System.out.println("counter 1 is "+counter_1);
		//System.out.println("counter 2 is "+counter_2);
		if(counter_1==1 && counter_2==1) {
			 for(int i=0;i<hash_child.size();i++) {
				 if(a1.equals(hash_child.get(i))|| a2.equals(hash_child.get(i))) {
					 hash_child.remove(i);
				 }
			 }
			 hash_node_label.remove(Integer.toString(processing_nodes.get(0)));
			 hash_node_label.remove(Integer.toString(processing_nodes.get(1)));
		}
		 /*Set set = hash_node_label.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	      */
	      System.out.println("ancestral subgraph created");
	
		//Moral graph done
		for(int i=0;i<Cardinality_parent.size();i++) {
			if(Cardinality_parent.get(i)==2) {
				String z=hash_parent.get(i);
				  for (Entry<String, String> entry : hash_node_label.entrySet()) {
			            if (entry.getValue().equals(z)) {
			                String val=entry.getKey();
			            	hash_child.add(Integer.parseInt(val),"fire");
			            }
			      
			}		
		}
	}
	
		System.out.println("Moral graph created");

		//u_seperation
		//performing union operation
		HashSet<String> set_child=new HashSet<String>();
		HashSet<String> set_child_dup=new HashSet<String>();
		set_child.addAll(hash_child);
		set_child_dup.addAll(hash_child);
		HashSet<String>union=new HashSet<String>();
		union.addAll(set_child);
		union.addAll(set_child_dup);
		//System.out.println("Strings are"+ union);
		
		//test-dseperation
		int counter=0;
		for(String all:union) {
			for(int i=0;i<Y.size();i++) {
				if(all.equals(Y.get(i))) {
					counter=1;
					break;
				}
			}

		}
		if(counter==0) {
			System.out.println("D-seperation holds");
		}else if(counter==1) {
			System.out.println("D-seperation does not hold");
		}
		
		

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}

}
