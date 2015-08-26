package rs.invado.wo.domain.prod;
// Generated Jan 20, 2013 9:55:29 PM by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProdKlasaCeneId generated by hbm2java
 */
@Embeddable
public class ProdKlasaCeneId  implements java.io.Serializable {


     private int organizacionaJedinica;
     private int idKlasaCene;

    public ProdKlasaCeneId() {
    }

    public ProdKlasaCeneId(int organizacionaJedinica, int idKlasaCene) {
       this.organizacionaJedinica = organizacionaJedinica;
       this.idKlasaCene = idKlasaCene;
    }
   


    @Column(name="ORGANIZACIONA_JEDINICA#", nullable=false, precision=5, scale=0)
    public int getOrganizacionaJedinica() {
        return this.organizacionaJedinica;
    }
    
    public void setOrganizacionaJedinica(int organizacionaJedinica) {
        this.organizacionaJedinica = organizacionaJedinica;
    }


    @Column(name="ID_KLASA_CENE", nullable=false, precision=2, scale=0)
    public int getIdKlasaCene() {
        return this.idKlasaCene;
    }
    
    public void setIdKlasaCene(int idKlasaCene) {
        this.idKlasaCene = idKlasaCene;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProdKlasaCeneId) ) return false;
		 ProdKlasaCeneId castOther = ( ProdKlasaCeneId ) other; 
         
		 return (this.getOrganizacionaJedinica()==castOther.getOrganizacionaJedinica())
 && (this.getIdKlasaCene()==castOther.getIdKlasaCene());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getOrganizacionaJedinica();
         result = 37 * result + this.getIdKlasaCene();
         return result;
   }   


}

