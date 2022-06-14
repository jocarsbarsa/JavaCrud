package br.com.medicamento.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-05-03T16:08:28.500-0300")
@StaticMetamodel(Medicamento.class)
public class Medicamento_ {
	public static volatile SingularAttribute<Medicamento, Long> id;
	public static volatile SingularAttribute<Medicamento, String> nome;
	public static volatile SingularAttribute<Medicamento, String> apresentacao;
	public static volatile SingularAttribute<Medicamento, String> laboratorio;
	public static volatile SingularAttribute<Medicamento, String> registro;
	public static volatile SingularAttribute<Medicamento, BigDecimal> preco;
}
