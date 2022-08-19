/*
  Nome: NodoPtr.h
  Autori: Bux Massimo (424854) & Annese Giuseppe Luca (424802)
  Descrizione: Classe che implementa il nodo della lista con puntatore
*/

#ifndef NODOPTR_H
#define NODOPTR_H

#include "Nodo.h"

class NodoPtr; // dichiarazione anticipata
typedef NodoPtr *posizione; //necessita della dichiarazione anticipata

class NodoPtr: public Nodo{ // NodoPtr estende Nodo
public:
   NodoPtr(); // costruttore standard
   NodoPtr(tipoelem);  // costruttore che inizializza l'etichetta
   NodoPtr(tipoelem, posizione); // etichetta + puntatore
   ~NodoPtr(); // distruttore
   
   posizione getSuccessivo();
   void setSuccessivo(posizione);
   
private:
   posizione successivo;
};

#endif
