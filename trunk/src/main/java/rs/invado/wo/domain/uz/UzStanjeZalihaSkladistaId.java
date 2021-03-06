package rs.invado.wo.domain.uz;
// Generated Jan 1, 2013 5:03:16 PM by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UzStanjeZalihaSkladistaId generated by hbm2java
 */
@Embeddable
public class UzStanjeZalihaSkladistaId  implements java.io.Serializable {


     private Integer proizvod;
     private int idSkladista;

    public UzStanjeZalihaSkladistaId() {
    }

    public UzStanjeZalihaSkladistaId(Integer proizvod, short idSkladista) {
       this.proizvod = proizvod;
       this.idSkladista = idSkladista;
    }
   


    @Column(name="PROIZVOD#", nullable=false, precision=7, scale=0)
    public Integer getProizvod() {
        return this.proizvod;
    }
    
    public void setProizvod(Integer proizvod) {
        this.proizvod = proizvod;
    }


    @Column(name="ID_SKLADISTA", nullable=false, precision=3, scale=0)
    public int getIdSkladista() {
        return this.idSkladista;
    }
    
    public void setIdSkladista(int idSkladista) {
        this.idSkladista = idSkladista;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UzStanjeZalihaSkladistaId) ) return false;
		 UzStanjeZalihaSkladistaId castOther = ( UzStanjeZalihaSkladistaId ) other; 
         
		 return (this.getProizvod()==castOther.getProizvod())
 && (this.getIdSkladista()==castOther.getIdSkladista());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getProizvod();
         result = 37 * result + this.getIdSkladista();
         return result;
   }   


}


