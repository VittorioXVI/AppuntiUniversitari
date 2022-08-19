/*
Autore: Annarita Cappelli 
Matricola: 382635
Nome file: PrioriCoda.h
Commento: Classe che implementa una coda con priorita' mediante la 
rappresentazione con albero binario a puntatori.
*/

#ifndef PRIORICODA_H
#define PRIORICODA_H

#ifndef MAIN_H
#include "main.h"
#endif

template <class P>
struct nodoBin {
       P priority;
       struct nodoBin *sinistro;
       struct nodoBin *padre;
       struct nodoBin *destro;
};
  
template <class P> 
class PrioriCoda {
      public:
             PrioriCoda();  // costruttore
             ~PrioriCoda();  // distruttore
             
             // operatori
             void creaPrioriCoda();
             void inserisci(P);
             P min();
             void cancellaMin();
      private:
              nodoBin<P> *piCoda;
              nodoBin<P> *ultimo;
};

template <class P>
PrioriCoda<P>::PrioriCoda() {
     creaPrioriCoda();
};

template <class P>
PrioriCoda<P>::~PrioriCoda() {
     while(piCoda!=NULL)
 	    cancellaMin();
};

template <class P>
void PrioriCoda<P>::creaPrioriCoda() {
     piCoda=NULL;
     ultimo=NULL;
};

template <class P>
void PrioriCoda<P>::inserisci(P a) {
     nodoBin<P> *temp;
     nodoBin<P> *newNodo;
     newNodo=new (nodoBin<P>);
     newNodo->priority=a;
     newNodo->sinistro=NULL;
     newNodo->destro=NULL;
     //fase 1: modifica della struttura
     if(piCoda==NULL) //l'albero � vuoto
        piCoda=newNodo; //inserisci l'elemento come radice
     else {
        if(ultimo==piCoda) { //l'albero ha solo la radice  
           piCoda->sinistro=newNodo; //inserisci l'elemento come figlio sinistro
           newNodo->padre=piCoda;
        } else {
 		   if(ultimo->padre->sinistro==ultimo) {  //se ultimo � un figlio sinistro
		   //inserisci l'elemento come suo fratello destro
              ultimo->padre->destro=newNodo;
              newNodo->padre=ultimo->padre;
           } else {  //altrimenti restano due casi da esaminare, allora
              temp=ultimo;
              while((temp->padre->destro==temp)&&(temp->padre!=piCoda)) {
              //finch� temp � un figlio destro e non � figlio della radice
           		 temp=temp->padre; //risali
           		 }
                 if(temp->padre->destro==temp){
                 //il nodo corrente � ancora figlio destro	allora si �
                 //raggiunta la radice quindi passa al fratello sinistro
                  temp=temp->padre->sinistro;
                 }else{
   	     	        temp=temp->padre->destro; //passa al fratello destro
   	     	        }
                 while(temp->sinistro!=NULL) //nodo non � una foglia
                    temp=temp->sinistro;	//scendi a sinistra
                 //inserisci l'elemento come figlio sinistro
                 newNodo->padre=temp;
	     	     newNodo->padre->sinistro=newNodo;
           }
        }
     }
     ultimo=newNodo; //aggiorna ultimo
     //fase 2: aggiustamento degli elementi in base alla priorit�
     temp=ultimo;    //riutilizzo il nodo temp
     if(ultimo!=piCoda)
     {
        while((temp!=piCoda)&&(temp->priority < temp->padre->priority))
        //finch� la priorit� del nodo corrente � maggiore di quella del padre
  	    //e non si raggiunta la radice
        {
        //scambia il contenuto di padre e figlio( senza variabile di appoggio)
           temp->priority = temp->priority + temp->padre->priority;
           temp->padre->priority = temp->priority - temp->padre->priority;
           temp->priority = temp->priority - temp->padre->priority;
           //risali e ricontrolla
   	       temp=temp->padre;
        }
     }
     return;
};

template <class P>
P PrioriCoda<P>::min() {
     return piCoda->priority;
};

template <class P>
void PrioriCoda<P>::cancellaMin() {
     nodoBin<P> *temp, *corrente;
     P store;
     //fase 1: modifica della struttura
     if(piCoda!=NULL) //l'albero non � vuoto
  	    if(ultimo==piCoda) //l'albero ha solo la radice
 	    {
           temp=piCoda;
           piCoda=ultimo=NULL;
           delete (temp);
           return;
        }
        else
        {
        //memorizza il contenuto dell'ultima foglia per reinserirlo successivamente
		   store=ultimo->priority;
           temp=corrente=ultimo;
           if(ultimo->padre->destro==ultimo) //ultimo � un figlio destro
           //il nuovo ultimo sar� il fratello sinistro
           {
              ultimo=ultimo->padre->sinistro; //aggiorna ultimo
              ultimo->padre->destro=NULL;
     		  delete (temp); //cancella l'ex ultimo
           }
           else  //se non � figlio destro
           {
              while((corrente->padre->sinistro==corrente)&&(corrente->padre!=piCoda))
              //finch� nodo � figlio sinistro e non � figlio della radice
                 corrente=corrente->padre; //risali
              if(corrente->padre->sinistro==corrente) //nodo corrente � ancora figlio sinistro
              //allora si � raggiunta la radice e quindi
              {
                 if(corrente->padre->destro==NULL) //se la radice non ha figlio destro
					corrente=piCoda;//allora il nuovo ultimo � la radice stessa
                 else
             	    corrente=piCoda->destro; //passa al fratello destro
              }
              else
                 corrente=corrente->padre->sinistro; //passa al fratello sinistro
              while(corrente->destro!=NULL) //nodo non � una foglia
                 corrente=corrente->destro;	//scendi a destra
              ultimo->padre->sinistro=NULL;
              ultimo=corrente;   //aggiorna ultimo
              delete temp; //cancella l'ex ultimo
           }
        }
        //fase 2:aggiustamento degli elementi in base alla priorit�
        temp=piCoda;  //riutilizzo il nodo temp partendo dalla radice ke nn � + significativa
        bool trovato=false;
        nodoBin<P> *minore; //messa a true quando sar� individuata la collocazione
        //per il valore della priorit� del nodo cancellato
        while(!trovato) //finch� non sar� individuata la collocazione
        //per il valore della priorit� del nodo cancellato
  	    {
           if(temp->destro!=NULL) //sono presenti entrambi i figli
     	   {
           //scegli il figlio con priorit� minore
              if(temp->destro->priority < temp->sinistro->priority)
       	         minore=temp->destro;
              else
       	         minore=temp->sinistro;
              if(minore->priority < store)
              //se tale priorit� � minore di quella del nodo cancellato
        	  {
              //scrivi il contenuto del figlio scelto nel nodo attuale
       	         temp->priority=minore->priority;
                 temp=minore; //e passa al figlio prescelto
              }
              else
        	  {
			  //scrivi il contenuto del nodo cancellato nella posizione temp
     		     temp->priority=store;
                 //trovata locazione del contenuto del nodo cancellato
                 trovato=true;
              }
        }
     else
     	if(temp->sinistro!=NULL) // ha solo il figlio sinistro
	 	   if(temp->sinistro->priority < store)
           //la priorit� del figlio sinistro � minore di quella del nodo cancellato
           {
           //scrivi il contenuto del figlio sinistro in temp
              temp->priority=temp->sinistro->priority;
			  temp=temp->sinistro; //passa al figlio sinistro
           }
           else
   	       {
           //scrivi il contenuto del nodo cancellato nella posizione temp
              temp->priority=store;
              //trovata locazione del contenuto del nodo cancellato
              trovato=true;
           }
        else
        {
        //scrivi il contenuto del nodo cancellato nella posizione temp
           temp->priority=store;
           //trovata l'allocazione del contenuto del nodo cancellato
           trovato=true;
        }
     }
     return;
};

#endif
