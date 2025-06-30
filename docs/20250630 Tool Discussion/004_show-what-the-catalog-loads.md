---
title: Slide 4 - show what catalog files are loaded
description: Slide 4 - show what catalog files are loaded
hidden: false
---

<p id="top">Slide 4 - show what catalog files are loaded.</p>

Show what files the [catalog.xml](https://github.com/robertmarkbram/XbrlValidationWithXsdUsesXercesApplication/blob/main/src/main/resources/xsd/catalog.xml) loads.

1. Modify [application.properties](https://github.com/robertmarkbram/XbrlValidationWithXsdUsesXercesApplication/blob/main/src/main/resources/application.properties) and give package `com.example.XBRL_validation_with_xsd_uses_xerces` DEBUG level logging.

    ```properties
    spring.application.name=XBRL-validation-with-xsd_uses-xerces
    logging.level.root=INFO
    logging.level.com.example.XBRL_validation_with_xsd_uses_xerces=DEBUG
    ```

2. Run the app without internet and using the catalog. Check the logging.

<details>
  <summary>Click to view logging.</summary>


``` {title="DEBUG logging showing what XSD files are loaded.",wrap="false"}
2025-06-30T11:34:51.530+10:00  INFO 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Running without internet and with the catalog.
2025-06-30T11:34:51.530+10:00  INFO 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : ========== src/main/resources/xbrl/xbrl_001_valid.xml ==========
2025-06-30T11:34:51.599+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve 'sprcnt.0001.private.02.02.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_reports/sprstrm/sprcnt/sprcnt_0001/sprcnt.0001.private.02.02.module.xsd'.
2025-06-30T11:34:51.602+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.602+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/em/emsup/emsup.02.03.data.xsd' to 'null'.
2025-06-30T11:34:51.603+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.09.xsd' to 'null'.
2025-06-30T11:34:51.608+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve 'http://www.xbrl.org/2003/xbrl-instance-2003-12-31.xsd' to 'file:/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/www.xbrl.org/2003/xbrl-instance-2003-12-31.xsd'.
2025-06-30T11:34:51.609+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve 'xbrl-linkbase-2003-12-31.xsd' to 'null'.
2025-06-30T11:34:51.609+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve 'xl-2003-12-31.xsd' to 'null'.
2025-06-30T11:34:51.610+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve 'xlink-2003-12-31.xsd' to 'null'.
2025-06-30T11:34:51.610+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.610+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/em/emsup/emsup.02.08.data.xsd' to 'null'.
2025-06-30T11:34:51.611+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.16.xsd' to 'null'.
2025-06-30T11:34:51.615+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.615+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.00.data.xsd' to 'null'.
2025-06-30T11:34:51.616+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.616+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.00.xsd' to 'null'.
2025-06-30T11:34:51.618+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.01.data.xsd' to 'null'.
2025-06-30T11:34:51.618+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.618+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.03.xsd' to 'null'.
2025-06-30T11:34:51.620+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.05.data.xsd' to 'null'.
2025-06-30T11:34:51.620+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.06.xsd' to 'null'.
2025-06-30T11:34:51.623+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.623+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.08.data.xsd' to 'null'.
2025-06-30T11:34:51.624+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.13.xsd' to 'null'.
2025-06-30T11:34:51.627+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.627+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyid/pyid.02.00.data.xsd' to 'null'.
2025-06-30T11:34:51.627+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.628+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyid/pyid.02.05.data.xsd' to 'null'.
2025-06-30T11:34:51.628+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.628+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyid/pyid.02.06.data.xsd' to 'null'.
2025-06-30T11:34:51.628+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.21.xsd' to 'null'.
2025-06-30T11:34:51.632+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.632+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.00.data.xsd' to 'null'.
2025-06-30T11:34:51.633+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.633+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.17.data.xsd' to 'null'.
2025-06-30T11:34:51.634+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.22.xsd' to 'null'.
2025-06-30T11:34:51.637+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.637+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.03.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.03.xsd'.
2025-06-30T11:34:51.638+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.01.data.xsd' to 'null'.
2025-06-30T11:34:51.638+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.638+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.01.xsd' to 'null'.
2025-06-30T11:34:51.640+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.03.data.xsd' to 'null'.
2025-06-30T11:34:51.640+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T11:34:51.640+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.addressdetails3.02.01.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.addressdetails3.02.01.module.xsd'.
2025-06-30T11:34:51.641+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.electroniccontactelectronicmail1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.electroniccontactelectronicmail1.02.00.module.xsd'.
2025-06-30T11:34:51.641+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.financialinstitutionaccount1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.financialinstitutionaccount1.02.00.module.xsd'.
2025-06-30T11:34:51.641+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.organisationname1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.organisationname1.02.00.module.xsd'.
2025-06-30T11:34:51.641+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.electroniccontacttelephone1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.electroniccontacttelephone1.02.00.module.xsd'.
2025-06-30T11:34:51.641+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname1.02.00.module.xsd'.
2025-06-30T11:34:51.641+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname3.02.01.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname3.02.01.module.xsd'.
2025-06-30T11:34:51.716+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Error occurred during validation of XML file 'xbrl_001_valid.xml': 'cvc-complex-type.2.4.a: Invalid content was found starting with element '{"http://sbr.gov.au/comnmdle/comnmdle.financialinstitutionaccount1.02.00.module":FinancialInstitutionAccount}'. One of '{"http://www.xbrl.org/2003/linkbase":schemaRef, "http://www.xbrl.org/2003/linkbase":linkbaseRef, "http://www.xbrl.org/2003/linkbase":roleRef, "http://www.xbrl.org/2003/linkbase":arcroleRef, "http://www.xbrl.org/2003/instance":item, "http://www.xbrl.org/2003/instance":tuple, "http://www.xbrl.org/2003/instance":context, "http://www.xbrl.org/2003/instance":unit, "http://www.xbrl.org/2003/linkbase":footnoteLink}' is expected.'.
2025-06-30T11:34:51.719+10:00 ERROR 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Error: org.xml.sax.SAXParseException; systemId: file:/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xbrl/xbrl_001_valid.xml; lineNumber: 46; columnNumber: 51; cvc-complex-type.2.4.a: Invalid content was found starting with element '{"http://sbr.gov.au/comnmdle/comnmdle.financialinstitutionaccount1.02.00.module":FinancialInstitutionAccount}'. One of '{"http://www.xbrl.org/2003/linkbase":schemaRef, "http://www.xbrl.org/2003/linkbase":linkbaseRef, "http://www.xbrl.org/2003/linkbase":roleRef, "http://www.xbrl.org/2003/linkbase":arcroleRef, "http://www.xbrl.org/2003/instance":item, "http://www.xbrl.org/2003/instance":tuple, "http://www.xbrl.org/2003/instance":context, "http://www.xbrl.org/2003/instance":unit, "http://www.xbrl.org/2003/linkbase":footnoteLink}' is expected.
```

Some resolved to a file.

``` {title="Some resolved to a file",wrap="false"}
Attempted to resolve 'sprcnt.0001.private.02.02.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_reports/sprstrm/sprcnt/sprcnt_0001/sprcnt.0001.private.02.02.module.xsd'.
Attempted to resolve '../../../../sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve 'http://www.xbrl.org/2003/xbrl-instance-2003-12-31.xsd' to 'file:/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/www.xbrl.org/2003/xbrl-instance-2003-12-31.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.03.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.03.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.addressdetails3.02.01.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.addressdetails3.02.01.module.xsd'.
Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.electroniccontactelectronicmail1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.electroniccontactelectronicmail1.02.00.module.xsd'.
Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.financialinstitutionaccount1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.financialinstitutionaccount1.02.00.module.xsd'.
Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.organisationname1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.organisationname1.02.00.module.xsd'.
Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.electroniccontacttelephone1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.electroniccontacttelephone1.02.00.module.xsd'.
Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname1.02.00.module.xsd'.
Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname3.02.01.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname3.02.01.module.xsd'.
```

While some resolved to null.

``` {title="Some resolved to null",wrap="false"}
Attempted to resolve '../../../../sbr_au_taxonomy/icls/em/emsup/emsup.02.03.data.xsd' to 'null'.
Attempted to resolve '../../../fdtn/dtyp.sbr.02.09.xsd' to 'null'.
Attempted to resolve 'xbrl-linkbase-2003-12-31.xsd' to 'null'.
Attempted to resolve 'xl-2003-12-31.xsd' to 'null'.
Attempted to resolve 'xlink-2003-12-31.xsd' to 'null'.
Attempted to resolve '../../../../sbr_au_taxonomy/icls/em/emsup/emsup.02.08.data.xsd' to 'null'.
Attempted to resolve '../../../fdtn/dtyp.sbr.02.16.xsd' to 'null'.
Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.00.data.xsd' to 'null'.
Attempted to resolve '../../../fdtn/dtyp.sbr.02.00.xsd' to 'null'.
Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.01.data.xsd' to 'null'.
Attempted to resolve '../../../fdtn/dtyp.sbr.02.03.xsd' to 'null'.
Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.05.data.xsd' to 'null'.
Attempted to resolve '../../../fdtn/dtyp.sbr.02.06.xsd' to 'null'.
Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.08.data.xsd' to 'null'.
Attempted to resolve '../../../fdtn/dtyp.sbr.02.13.xsd' to 'null'.
Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyid/pyid.02.00.data.xsd' to 'null'.
Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyid/pyid.02.05.data.xsd' to 'null'.
Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyid/pyid.02.06.data.xsd' to 'null'.
Attempted to resolve '../../../fdtn/dtyp.sbr.02.21.xsd' to 'null'.
Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.00.data.xsd' to 'null'.
Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.17.data.xsd' to 'null'.
Attempted to resolve '../../../fdtn/dtyp.sbr.02.22.xsd' to 'null'.
Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.01.data.xsd' to 'null'.
Attempted to resolve '../../../fdtn/dtyp.sbr.02.01.xsd' to 'null'.
Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.03.data.xsd' to 'null'.
```

</details>


