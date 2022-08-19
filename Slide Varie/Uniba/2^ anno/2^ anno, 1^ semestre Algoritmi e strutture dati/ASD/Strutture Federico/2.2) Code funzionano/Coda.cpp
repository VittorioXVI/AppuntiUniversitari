//IMPLEMENTAZIONE DELLA CLASSE CODA
#include "Nodo.h"
#include "Coda.h"
#include <iostream>
#include <stdlib.h>

using namespace std;

Coda::Coda()
{
    creacoda();
    return;
}

Coda::~Coda()
{
    delete testa;
    delete fondo;
}

void Coda::creacoda()
{
    testa=0;
    fondo=0;
}

bool Coda::codavuota()
{
    return (testa==0);
}

tipoelem Coda::leggicoda()     //legge elemento in testa
{
    if (!codavuota())
   		{
   		    return (testa->getElem());
        }
          //cout<<"\nletto";}
    else
        cout<<"\nCoda vuota!\n";

}

void Coda::fuoricoda()         //elimina elemento in testa
{
    posizione temp=new Nodo();
    if(!codavuota())
        {
            temp=testa;
            testa=testa->getNext();
            delete temp;
        }
     else
        cout << "\n\tCoda vuota!\n";
     return;
}

void Coda::incoda(tipoelem e)  //inserisce elemento dal fondo
{
     posizione temp=new Nodo();
     if (codavuota())
     	{
     	    testa=(temp);
            fondo=(temp);
        }
     else
        {
            fondo->setNext(temp);
            fondo=temp;
        }

     fondo->setElem(e);
     return;
}
//operatore aggiuntivo che stampa e svuota la coda
void Coda::stampa()
{
    posizione temp;
    temp=this->testa;
	if(!this->codavuota())
        do{
             cout<<"\n\t "<<temp->getElem();
             temp=temp->getNext();
          }while(temp!=0);
   else
        cout<<"\n  Coda vuota!\n";
   return;
}



