Arraylist<Integer> lista = new Arraylist<> (c: Arrays.aslist (a: 10, a: 5, a: 3, a: 20, a: 15, a: 12)) ;
System.out.println ("Lista desordenada: " + lista);
Collections.sort (list: lista);
System. out-println ("Lista ordenada: " + lista);
Collections. reverse(list: lista) ;
system.out.println("Lista invertida: " + lista);
System.out println ("Minimo de la lista:
"+ Collections.min(col1: lista));
System. out.println ("Maximo de la lista:
" + Collections.max (coll: lista));
Collections.shuffle(list: lista);
System. out println("Lista de forma aleatoria: " + lista):

List<Integer> listaNoModificable = Collections.unmodifiablelist(list: lista);
System. out.printin(x: "Lista no modificable: " b; 
List<Integer> listaNoModificable = Collections.unmodifiablelist(list: lista);
system.out.println("Lista no modificable: " + listanomodificable);
try ( listaNomodificable.add (e: 50);
} catch (UnsupportedOperationException e) {
System.out.println (x:"No se puede modificar la lista");
Hashset<Integer> hashset = new Hashset<> () ;
hashset.add (e: 10); hashset.add (e: 30); hashset.add (e: 40); hashset.add (e: 5);
hashset.add (e: 20);
Set<Integer> hashsetNomodificable = Collections. unmodifiableset (s: hashset) ;
try {
hashsetNomodificable.add(50);
} catch (UnsupportedOperationException e) |
system. out printin(x: "No se puede modificar el col
// Mapas
HashMap<string, Integer> hashMap = new HashMap<>() ;
I
hashMap-put (key: "Fernando", value: 2000) ; hashmap-put (key: "Manuel", value: 3000) ; hashmap•put (key: "Alberto", value: 1000);
Map<String, Integer> hashMapNoModificable = Collections.unmodifiableMap(m:hashMap);
try {
hashmapnomodificable.put (key: "Zacarias", value: 500);
) catch (UnsupportedoperationException e) (
system.out.println(x: "No se puede modificar el mapa");
system. out.println ("Minimo del mapa: " + Collections.min(co1l: hashMap.values (d
System. out.println ("Maximo del mapa:
" + Collections.max(col1: hashMap.values ()Q
﻿
nacho jimena
nacho070329