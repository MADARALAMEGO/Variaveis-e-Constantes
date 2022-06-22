package com.company.collections_framework.desafio;

    import java.text.DecimalFormat;
    import java.math.BigDecimal;
    public class Principal {
        public static void main(String[] args) {
            DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

            Governo governo = new Governo();

            Cargo vereador = new Cargo();
            vereador.setDescricao("Vereador");
            vereador.setSalario(new BigDecimal(16000));
            Cargo deputadoEstadual = new Cargo();
            deputadoEstadual.setDescricao("Deputado estadual");
            deputadoEstadual.setSalario(new BigDecimal(25000));
            Cargo prefeito = new Cargo();
            prefeito.setDescricao("Prefeito");
            prefeito.setSalario(new BigDecimal(27000));

            Politico politico = new Politico();
            politico.setNome("João das Couves");
            politico.setCargo(vereador);
            governo.adicionarPolitico("RBLH", politico);
            politico = new Politico();
            politico.setNome("Zé Mané");
            politico.setCargo(vereador);
            governo.adicionarPolitico("PCOR", politico);
            politico = new Politico();
            politico.setNome("Maria Carvalho");
            politico.setCargo(vereador);
            governo.adicionarPolitico("LDRS", politico);
            politico = new Politico();
            politico.setNome("Maria Carvalho");
            politico.setCargo(vereador);
            governo.adicionarPolitico("LDRS", politico);

            politico = new Politico();
            politico.setNome("Josefa Silva");
            politico.setCargo(deputadoEstadual);
            governo.adicionarPolitico("LDRS", politico);
            politico = new Politico();
            politico.setNome("Fátima Gonçalves");
            politico.setCargo(deputadoEstadual);
            governo.adicionarPolitico("PCOR", politico);

            politico = new Politico();
            politico.setNome("Sebastião Mendes");
            politico.setCargo(prefeito);
            governo.adicionarPolitico("PCOR", politico);

            BigDecimal gastosPcor = governo.calcularGastosComSalario("PCOR");
            System.out.println("Gastos com partido PCOR: " + formatador.format(gastosPcor.doubleValue()));
            BigDecimal gastosLdrs = governo.calcularGastosComSalario("LDRS");
            System.out.println("Gastos com partido LDRS: " + formatador.format(gastosLdrs.doubleValue()));

            BigDecimal gastosVereadoresLdrs = governo.calcularGastosComSalarioParaCargo(vereador, "LDRS");
            System.out.println("Gastos com vereadores do partido LDRS: "
                    + formatador.format(gastosVereadoresLdrs.doubleValue()));
            BigDecimal gastosDeputadosEstaduaisLdrs = governo.calcularGastosComSalarioParaCargo(deputadoEstadual, "LDRS");
            System.out.println("Gastos com deputados estaduais do partido LDRS: "
                    + formatador.format(gastosDeputadosEstaduaisLdrs.doubleValue()));
            BigDecimal gastosPrefeitosLdrs = governo.calcularGastosComSalarioParaCargo(prefeito, "LDRS");
            System.out.println("Gastos com prefeitos do partido LDRS: "
                    + formatador.format(gastosPrefeitosLdrs.doubleValue()));
        }
    }
