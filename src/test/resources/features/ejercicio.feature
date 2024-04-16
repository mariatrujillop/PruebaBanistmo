
Feature: Validar que el Contrato único de Productos y Servicios Bancarios sea el correcto




    Scenario: Yo como usuario requiero validar el Contrato único de Productos y Servicios Bancarios sea el correcto

        Given que el usuario este en la pagina Banistmo
        When el usuario descargue el PDF
        Then el usuario ve el PDF sea correcto

