---
title: 20250630 Co-pilot chat
description: 20250630 Co-pilot chat
hidden: false
---

<p id="top">20250630 Co-pilot chat.</p>

- [Question 001 - why do some resolve to null](#question-001---why-do-some-resolve-to-null)
- [Answer 001](#answer-001)
- [My Actions 001](#my-actions-001)
- [Question 002 - How to add a classpath-relative resolver](#question-002---how-to-add-a-classpath-relative-resolver)
- [Answer 002](#answer-002)
- [My Actions 002](#my-actions-002)
- [Answer 003](#answer-003)


## Question 001 - why do some resolve to null

This section: [Question 001 - why do some resolve to null](20250630_co-pilot-chat.md#question-001---why-do-some-resolve-to-null) | [Back to top](#top)

Why do some files resolve to null? How do I fix that?

Output:

``` {title="No wrapping",wrap="false"}
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

## Answer 001

This section: [Answer 001](20250630_co-pilot-chat.md#answer-001) | [Back to top](#top)

Some files resolve to `null` because the catalog resolver cannot find a matching entry for the system ID or URI being requested. This usually happens for two reasons:

1. **Relative Paths Are Not in the Catalog**
Your catalog only maps **absolute URLs** (like `http://...`) to local files, but many XSDs reference other XSDs using **relative paths** (like `../../../fdtn/dtyp.sbr.02.09.xsd`). The resolver does not know how to map these relative paths unless you explicitly add them to the catalog.
2. **Incorrect or Missing Catalog Entries**
If the system ID or URI being requested does not exactly match any entry in your catalog, the resolver returns `null`.

---

**How to Fix**

**A. Add Relative Path Mappings to the Catalog**

Add `<system>` entries for all relative paths used in your XSDs. For example, if your XSDs reference `../../../fdtn/dtyp.sbr.02.09.xsd`, add:

```xml
<system systemId="../../../fdtn/dtyp.sbr.02.09.xsd" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/dtyp.sbr.02.09.xsd"/>
```

Do this for every relative path that appears in your XSD imports/includes.

---

**B. Use URI Rewriting (Optional, Advanced)**

If you have many similar patterns, you can use `<rewriteSystem>` or `<rewriteURI>` to map path prefixes:

```xml
<rewriteSystem systemIdStartString="../../../fdtn/" rewritePrefix="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/"/>
```

---

**C. Double-Check File Locations**

Make sure the `uri` attribute in your catalog points to the correct file location, relative to the catalog file or as an absolute path.

---

**D. Catalog Path Consistency**

If your catalog uses relative paths, ensure they are relative to the catalog file itself, not the working directory.

---

**Summary Table**

| Reference in XSD | Catalog Entry Needed? | Example Catalog Entry |
|------------------|----------------------|----------------------|
| `http://...`     | Yes                  | `<system systemId="http://..." uri="..."/>` |
| `../../../...`   | Yes                  | `<system systemId="../../../..." uri="..."/>` |

---

**Why Some Files Work**

- Files referenced by **absolute URLs** that are mapped in your catalog resolve correctly.
- Files referenced by **relative paths** (not mapped) resolve to `null`.

---

**Action Steps**

1. **Collect all relative paths** used in your XSDs’ `<import>` and `<include>`.
2. **Add `<system>` entries** for each to your catalog.
3. **Restart your validation**.

---

**Tip:** You can automate catalog entry generation by scripting or by searching for all `schemaLocation` attributes in your XSDs.

---

**References:**
- [OASIS XML Catalogs Spec](https://www.oasis-open.org/committees/download.php/14809/xml-catalogs.html)
- [Xerces Catalog Resolver Guide](https://xerces.apache.org/xml-commons/components/resolver/)

---

**In summary:**  
Add `<system>` entries for all relative paths used in your XSDs to your catalog.xml. This will allow the resolver to find and load those files, avoiding `null` resolutions.

## My Actions 001

This section: [My Actions 001](20250630_co-pilot-chat.md#my-actions-001) | [Back to top](#top)

Monday 30 June 2025, 12:18:50 pm

Take an output line like 

```
2025-06-30T11:34:51.618+10:00 DEBUG 56951 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.03.xsd' to 'null'.
```

Which maps to a catalog line:

```xml
<uri name="http://sbr.gov.au/fdtn/sbr.02.03.dtyp.xsd" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/dtyp.sbr.02.03.xsd"/>
```

Update the catalog to have a relative path as asked for in the output.

```xml
<uri name="http://sbr.gov.au/fdtn/sbr.02.03.dtyp.xsd" uri="../../../fdtn/dtyp.sbr.02.03.xsd"/>
```

All lines that result to null:

``` {title="No wrapping",wrap="false"}
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

Hmm, that refers to three files I already have as absolute paths in the catalog. Logging:

```
Attempted to resolve 'xbrl-linkbase-2003-12-31.xsd' to 'null'.
Attempted to resolve 'xl-2003-12-31.xsd' to 'null'.
Attempted to resolve 'xlink-2003-12-31.xsd' to 'null'.
```

In the catalog:

```xml
<system systemId="http://www.xbrl.org/2003/xl-2003-12-31.xsd" uri="/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/www.xbrl.org/2003/xl-2003-12-31.xsd"/>
<system systemId="http://www.xbrl.org/2003/xlink-2003-12-31.xsd" uri="/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/www.xbrl.org/2003/xlink-2003-12-31.xsd"/>
<system systemId="http://www.xbrl.org/2003/xbrl-linkbase-2003-12-31.xsd" uri="/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/www.xbrl.org/2003/xbrl-linkbase-2003-12-31.xsd"/>
```

Monday 30 June 2025, 12:32:09 pm

Trying catalog like this:

<details>
  <summary>Click to view new catalog.xml </summary>

```xml
<catalog xmlns="urn:oasis:names:tc:entity:xmlns:xml:catalog">
   <uri name="http://sbr.gov.au/comnmdle/comnmdle.addressdetails3.02.01.module" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.addressdetails3.02.01.module.xsd"/>
   <uri name="http://sbr.gov.au/comnmdle/comnmdle.electroniccontactelectronicmail1.02.00.module"
        uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.electroniccontactelectronicmail1.02.00.module.xsd"/>
   <uri name="http://sbr.gov.au/comnmdle/comnmdle.electroniccontacttelephone1.02.00.module"
        uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.electroniccontacttelephone1.02.00.module.xsd"/>
   <uri name="http://sbr.gov.au/comnmdle/comnmdle.financialinstitutionaccount1.02.00.module"
        uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.financialinstitutionaccount1.02.00.module.xsd"/>
   <uri name="http://sbr.gov.au/comnmdle/comnmdle.organisationname1.02.00.module" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.organisationname1.02.00.module.xsd"/>
   <uri name="http://sbr.gov.au/comnmdle/comnmdle.personstructuredname1.02.00.module" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname1.02.00.module.xsd"/>
   <uri name="http://sbr.gov.au/comnmdle/comnmdle.personstructuredname3.02.01.module" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname3.02.01.module.xsd"/>
   <uri name="http://sbr.gov.au/dims/EmpAbn.02.00.dims" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/dims/EmpAbn.02.00.data.xsd"/>
   <uri name="http://sbr.gov.au/dims/RprtPyType.02.07.dims" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/dims/RprtPyType.02.07.data.xsd"/>
   <uri name="http://sbr.gov.au/dims/SprFndAbn.02.00.dims" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/dims/SprFndAbn.02.00.data.xsd"/>
   <uri name="http://sbr.gov.au/dims/SprFndUSI.02.00.dims" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/dims/SprFndUSI.02.00.data.xsd"/>
   <uri name="http://sbr.gov.au/fdtn/sbr.01.02.tech" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd"/>
   <uri name="http://sbr.gov.au/fdtn/sbr.01.03.tech" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.03.xsd"/>
   <uri name="http://sbr.gov.au/fdtn/sbr.02.00.dtyp.xsd" uri="../../../fdtn/dtyp.sbr.02.00.xsd"/>
   <uri name="http://sbr.gov.au/fdtn/sbr.02.01.dtyp.xsd" uri="../../../fdtn/dtyp.sbr.02.01.xsd"/>
   <uri name="http://sbr.gov.au/fdtn/sbr.02.03.dtyp.xsd" uri="../../../fdtn/dtyp.sbr.02.03.xsd"/>
   <uri name="http://sbr.gov.au/fdtn/sbr.02.06.dtyp.xsd" uri="../../../fdtn/dtyp.sbr.02.06.xsd"/>
   <uri name="http://sbr.gov.au/fdtn/sbr.02.09.dtyp.xsd" uri="../../../fdtn/dtyp.sbr.02.09.xsd"/>
   <uri name="http://sbr.gov.au/fdtn/sbr.02.13.dtyp.xsd" uri="../../../fdtn/dtyp.sbr.02.13.xsd"/>
   <uri name="http://sbr.gov.au/fdtn/sbr.02.16.dtyp.xsd" uri="../../../fdtn/dtyp.sbr.02.16.xsd"/>
   <uri name="http://sbr.gov.au/fdtn/sbr.02.21.dtyp.xsd" uri="../../../fdtn/dtyp.sbr.02.21.xsd"/>
   <uri name="http://sbr.gov.au/fdtn/sbr.02.22.dtyp.xsd" uri="../../../fdtn/dtyp.sbr.02.22.xsd"/>
   <uri name="http://sbr.gov.au/icls/em/emsup/emsup.02.03.data.xsd" uri="../../../../sbr_au_taxonomy/icls/em/emsup/emsup.02.03.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/em/emsup/emsup.02.08.data.xsd" uri="../../../../sbr_au_taxonomy/icls/em/emsup/emsup.02.08.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/lr/lrla/lrla.02.15.data.xsd" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/icls/lr/lrla/lrla.02.15.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/py/pyde/pyde.02.00.data.xsd" uri="../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.00.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/py/pyde/pyde.02.01.data.xsd" uri="../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.01.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/py/pyde/pyde.02.05.data.xsd" uri="../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.05.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/py/pyde/pyde.02.08.data.xsd" uri="../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.08.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/py/pyde/pyde.02.11.data.xsd" uri="xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/icls/py/pyde/pyde.02.11.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/py/pyid/pyid.02.00.data.xsd" uri="../../../../sbr_au_taxonomy/icls/py/pyid/pyid.02.00.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/py/pyid/pyid.02.05.data.xsd" uri="../../../../sbr_au_taxonomy/icls/py/pyid/pyid.02.05.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/py/pyid/pyid.02.06.data.xsd" uri="../../../../sbr_au_taxonomy/icls/py/pyid/pyid.02.06.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/py/pyin/pyin.02.00.data.xsd" uri="../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.00.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/py/pyin/pyin.02.01.data.xsd" uri="../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.01.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/py/pyin/pyin.02.03.data.xsd" uri="../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.03.data.xsd"/>
   <uri name="http://sbr.gov.au/icls/py/pyin/pyin.02.17.data.xsd" uri="../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.17.data.xsd"/>
   <uri name="http://sbr.gov.au/rprt/sprstrm/sprcnt/sprcnt.0001.private.02.01.module" uri="xsd/sbr.gov.au/taxonomy/sbr_au_reports/sprstrm/sprcnt/sprcnt_0001/sprcnt.0001.private.02.01.module.xsd"/>
   <uri name="http://sbr.gov.au/rprt/sprstrm/sprcnt/sprcnt.0001.private.02.02.module" uri="xsd/sbr.gov.au/taxonomy/sbr_au_reports/sprstrm/sprcnt/sprcnt_0001/sprcnt.0001.private.02.02.module.xsd"/>

   <system systemId="http://www.xbrl.org/2003/xl-2003-12-31.xsd" uri="/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/www.xbrl.org/2003/xl-2003-12-31.xsd"/>
   <system systemId="http://www.xbrl.org/2003/xlink-2003-12-31.xsd" uri="/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/www.xbrl.org/2003/xlink-2003-12-31.xsd"/>
   <system systemId="http://www.xbrl.org/2003/xbrl-linkbase-2003-12-31.xsd" uri="/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/www.xbrl.org/2003/xbrl-linkbase-2003-12-31.xsd"/>
   <system systemId="http://www.xbrl.org/2003/xbrl-instance-2003-12-31.xsd" uri="/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/www.xbrl.org/2003/xbrl-instance-2003-12-31.xsd"/>
   <system systemId="http://xbrl.org/2005/xbrldt" uri="/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/www.xbrl.org/2005/xbrldt-2005.xsd"/>

</catalog>
```

</details>

Monday 30 June 2025, 12:33:59 pm

Result: those relative paths still resolved to null.

<details>
  <summary>Click to view logging.</summary>

``` {title="No wrapping",wrap="false"}
2025-06-30T12:33:08.879+10:00  INFO 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Running without internet and with the catalog.
2025-06-30T12:33:08.880+10:00  INFO 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : ========== src/main/resources/xbrl/xbrl_001_valid.xml ==========
2025-06-30T12:33:08.982+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve 'sprcnt.0001.private.02.02.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_reports/sprstrm/sprcnt/sprcnt_0001/sprcnt.0001.private.02.02.module.xsd'.
2025-06-30T12:33:08.985+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:08.985+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/em/emsup/emsup.02.03.data.xsd' to 'null'.
2025-06-30T12:33:08.986+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.09.xsd' to 'null'.
2025-06-30T12:33:08.991+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve 'http://www.xbrl.org/2003/xbrl-instance-2003-12-31.xsd' to 'file:/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/www.xbrl.org/2003/xbrl-instance-2003-12-31.xsd'.
2025-06-30T12:33:08.992+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve 'xbrl-linkbase-2003-12-31.xsd' to 'null'.
2025-06-30T12:33:08.993+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve 'xl-2003-12-31.xsd' to 'null'.
2025-06-30T12:33:08.993+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve 'xlink-2003-12-31.xsd' to 'null'.
2025-06-30T12:33:08.993+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:08.994+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/em/emsup/emsup.02.08.data.xsd' to 'null'.
2025-06-30T12:33:08.994+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.16.xsd' to 'null'.
2025-06-30T12:33:09.000+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:09.000+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.00.data.xsd' to 'null'.
2025-06-30T12:33:09.001+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:09.001+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.00.xsd' to 'null'.
2025-06-30T12:33:09.003+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.01.data.xsd' to 'null'.
2025-06-30T12:33:09.003+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:09.003+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.03.xsd' to 'null'.
2025-06-30T12:33:09.005+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.05.data.xsd' to 'null'.
2025-06-30T12:33:09.005+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.06.xsd' to 'null'.
2025-06-30T12:33:09.008+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:09.008+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyde/pyde.02.08.data.xsd' to 'null'.
2025-06-30T12:33:09.008+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.13.xsd' to 'null'.
2025-06-30T12:33:09.011+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:09.012+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyid/pyid.02.00.data.xsd' to 'null'.
2025-06-30T12:33:09.012+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:09.012+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyid/pyid.02.05.data.xsd' to 'null'.
2025-06-30T12:33:09.013+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:09.013+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyid/pyid.02.06.data.xsd' to 'null'.
2025-06-30T12:33:09.013+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.21.xsd' to 'null'.
2025-06-30T12:33:09.017+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:09.017+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.00.data.xsd' to 'null'.
2025-06-30T12:33:09.017+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:09.018+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.17.data.xsd' to 'null'.
2025-06-30T12:33:09.018+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.22.xsd' to 'null'.
2025-06-30T12:33:09.021+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:09.022+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.03.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.03.xsd'.
2025-06-30T12:33:09.022+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.01.data.xsd' to 'null'.
2025-06-30T12:33:09.022+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:09.022+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/dtyp.sbr.02.01.xsd' to 'null'.
2025-06-30T12:33:09.024+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/icls/py/pyin/pyin.02.03.data.xsd' to 'null'.
2025-06-30T12:33:09.024+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../fdtn/tech.sbr.01.02.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/fdtn/tech.sbr.01.02.xsd'.
2025-06-30T12:33:09.024+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.addressdetails3.02.01.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.addressdetails3.02.01.module.xsd'.
2025-06-30T12:33:09.031+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.electroniccontactelectronicmail1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.electroniccontactelectronicmail1.02.00.module.xsd'.
2025-06-30T12:33:09.031+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.financialinstitutionaccount1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.financialinstitutionaccount1.02.00.module.xsd'.
2025-06-30T12:33:09.031+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.organisationname1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.organisationname1.02.00.module.xsd'.
2025-06-30T12:33:09.031+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.electroniccontacttelephone1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.electroniccontacttelephone1.02.00.module.xsd'.
2025-06-30T12:33:09.032+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname1.02.00.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname1.02.00.module.xsd'.
2025-06-30T12:33:09.032+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Attempted to resolve '../../../../sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname3.02.01.module.xsd' to 'file:////Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xsd/xsd/sbr.gov.au/taxonomy/sbr_au_taxonomy/comnmdle/comnmdle.personstructuredname3.02.01.module.xsd'.
2025-06-30T12:33:09.095+10:00 DEBUG 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Error occurred during validation of XML file 'xbrl_001_valid.xml': 'cvc-complex-type.2.4.a: Invalid content was found starting with element '{"http://sbr.gov.au/comnmdle/comnmdle.financialinstitutionaccount1.02.00.module":FinancialInstitutionAccount}'. One of '{"http://www.xbrl.org/2003/linkbase":schemaRef, "http://www.xbrl.org/2003/linkbase":linkbaseRef, "http://www.xbrl.org/2003/linkbase":roleRef, "http://www.xbrl.org/2003/linkbase":arcroleRef, "http://www.xbrl.org/2003/instance":item, "http://www.xbrl.org/2003/instance":tuple, "http://www.xbrl.org/2003/instance":context, "http://www.xbrl.org/2003/instance":unit, "http://www.xbrl.org/2003/linkbase":footnoteLink}' is expected.'.
2025-06-30T12:33:09.098+10:00 ERROR 63822 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Error: org.xml.sax.SAXParseException; systemId: file:/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xbrl/xbrl_001_valid.xml; lineNumber: 46; columnNumber: 51; cvc-complex-type.2.4.a: Invalid content was found starting with element '{"http://sbr.gov.au/comnmdle/comnmdle.financialinstitutionaccount1.02.00.module":FinancialInstitutionAccount}'. One of '{"http://www.xbrl.org/2003/linkbase":schemaRef, "http://www.xbrl.org/2003/linkbase":linkbaseRef, "http://www.xbrl.org/2003/linkbase":roleRef, "http://www.xbrl.org/2003/linkbase":arcroleRef, "http://www.xbrl.org/2003/instance":item, "http://www.xbrl.org/2003/instance":tuple, "http://www.xbrl.org/2003/instance":context, "http://www.xbrl.org/2003/instance":unit, "http://www.xbrl.org/2003/linkbase":footnoteLink}' is expected.
```

</details>

## Question 002 - How to add a classpath-relative resolver

This section: [Question 002 - How to add a classpath-relative resolver](20250630_co-pilot-chat.md#question-002---how-to-add-a-classpath-relative-resolver) | [Back to top](#top)

How do I add a classpath-relative resolver to you XML parsing subsystem?

## Answer 002

This section: [Answer 002](20250630_co-pilot-chat.md#answer-002) | [Back to top](#top)

To add a **classpath-relative resolver** to your XML parsing subsystem (so that XSDs and other resources can be loaded from your JAR or resources), you need to implement and set a custom `LSResourceResolver` that loads resources using the classpath.

Here’s how you can do it in your Spring Boot app:

---

1. **Create a ClasspathResourceResolver**

```java
package com.example.XBRL_validation_with_xsd_uses_xerces;

import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

import javax.xml.transform.stream.StreamSource;
import java.io.InputStream;

public class ClasspathResourceResolver implements LSResourceResolver {
    @Override
    public LSInput resolveResource(
            String type,
            String namespaceURI,
            String publicId,
            String systemId,
            String baseURI) {
        try {
            // Try to load from classpath
            InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(systemId);
            if (resourceAsStream != null) {
                return new LSInputImpl(publicId, systemId, resourceAsStream);
            }
        } catch (Exception e) {
            // Ignore and return null
        }
        return null;
    }
}
```

You’ll also need a simple `LSInputImpl` implementation:

```java
package com.example.XBRL_validation_with_xsd_uses_xerces;

import org.w3c.dom.ls.LSInput;

import java.io.InputStream;
import java.io.Reader;

public class LSInputImpl implements LSInput {
    private String publicId;
    private String systemId;
    private InputStream inputStream;

    public LSInputImpl(String publicId, String systemId, InputStream inputStream) {
        this.publicId = publicId;
        this.systemId = systemId;
        this.inputStream = inputStream;
    }

    @Override public Reader getCharacterStream() { return null; }
    @Override public void setCharacterStream(Reader characterStream) {}
    @Override public InputStream getByteStream() { return inputStream; }
    @Override public void setByteStream(InputStream byteStream) { this.inputStream = byteStream; }
    @Override public String getStringData() { return null; }
    @Override public void setStringData(String stringData) {}
    @Override public String getSystemId() { return systemId; }
    @Override public void setSystemId(String systemId) { this.systemId = systemId; }
    @Override public String getPublicId() { return publicId; }
    @Override public void setPublicId(String publicId) { this.publicId = publicId; }
    @Override public String getBaseURI() { return null; }
    @Override public void setBaseURI(String baseURI) {}
    @Override public String getEncoding() { return null; }
    @Override public void setEncoding(String encoding) {}
    @Override public boolean getCertifiedText() { return false; }
    @Override public void setCertifiedText(boolean certifiedText) {}
}
```

---

2. **Set the Resolver on Your SchemaFactory**

In your `validateFile` method, after creating the `SchemaFactory`, set the resolver:

```java
// ...existing code...
final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

if (withCatalog) {
    // your existing catalog resolver code
    schemaFactory.setResourceResolver(resolver);
}

// Always add classpath resolver as a fallback
schemaFactory.setResourceResolver(
    new ClasspathResourceResolver()
);
// ...existing code...
```

Or, if you want to chain resolvers, you can write a composite resolver that tries the catalog first, then the classpath.

---

3. **Place Your XSDs in resources**

Make sure your XSDs are available on the classpath (i.e., inside `src/main/resources/xsd/...`).

---

**Summary**

- Implement a `LSResourceResolver` that loads from the classpath.
- Set it on your `SchemaFactory`.
- Ensure your resources are in resources.

This will allow your XML parser to resolve XSDs and other resources using classpath-relative paths, which is especially useful when running from a JAR or in environments where file paths are not stable.

Similar code found with 2 license types


## My Actions 002

This section: [My Actions 002](20250630_co-pilot-chat.md#my-actions-002) | [Back to top](#top)

Monday 30 June 2025, 12:49:08 pm

Added the extra classes.

```
-la /Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/java/com/example/XBRL_validation_with_xsd_uses_xerces
total 32
drwxr-xr-x@ 5 rob.bram  staff   160 Jun 30 12:50 .
drwxr-xr-x@ 3 rob.bram  staff    96 Apr 22 12:21 ..
-rw-r--r--@ 1 rob.bram  staff   812 Jun 30 12:50 ClasspathResourceResolver.java
-rw-r--r--@ 1 rob.bram  staff  1819 Jun 30 12:50 LSInputImpl.java
-rw-r--r--@ 1 rob.bram  staff  6291 Jun 30 10:28 XbrlValidationWithXsdUsesXercesApplication.java
```

<details>
  <summary>Click to view: logging from running without internet and with the catalog.</summary>

Result. Running without internet and with the catalog. FAIL.

```
2025-06-30T12:54:07.032+10:00  INFO 67307 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Starting XbrlValidationWithXsdUsesXercesApplication using Java 17.0.12 with PID 67307 (/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/build/classes/java/main started by rob.bram in /Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces)
2025-06-30T12:54:07.034+10:00 DEBUG 67307 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Running with Spring Boot v3.4.4, Spring v6.2.5
2025-06-30T12:54:07.034+10:00  INFO 67307 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : No active profile set, falling back to 1 default profile: "default"
2025-06-30T12:54:07.271+10:00  INFO 67307 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Started XbrlValidationWithXsdUsesXercesApplication in 0.434 seconds (process running for 0.917)
2025-06-30T12:54:07.273+10:00  INFO 67307 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Running without internet and with the catalog.
2025-06-30T12:54:07.273+10:00  INFO 67307 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : ========== src/main/resources/xbrl/xbrl_001_valid.xml ==========
2025-06-30T12:54:07.702+10:00  INFO 67307 --- [XBRL-validation-with-xsd_uses-xerces] [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-06-30T12:54:07.714+10:00 ERROR 67307 --- [XBRL-validation-with-xsd_uses-xerces] [           main] o.s.boot.SpringApplication               : Application run failed

java.security.AccessControlException: access denied ("java.net.SocketPermission" "www.xbrl.org:80" "connect,resolve")
	at java.base/java.security.AccessControlContext.checkPermission(AccessControlContext.java:485) ~[na:na]
	at java.base/java.security.AccessController.checkPermission(AccessController.java:1068) ~[na:na]
	at java.base/java.lang.SecurityManager.checkPermission(SecurityManager.java:416) ~[na:na]
	at java.base/java.lang.SecurityManager.checkConnect(SecurityManager.java:919) ~[na:na]
	at java.base/sun.net.www.http.HttpClient.openServer(HttpClient.java:621) ~[na:na]
	at java.base/sun.net.www.http.HttpClient.<init>(HttpClient.java:281) ~[na:na]
	at java.base/sun.net.www.http.HttpClient.New(HttpClient.java:386) ~[na:na]
	at java.base/sun.net.www.http.HttpClient.New(HttpClient.java:408) ~[na:na]
	at java.base/sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:1308) ~[na:na]
	at java.base/sun.net.www.protocol.http.HttpURLConnection.plainConnect0(HttpURLConnection.java:1241) ~[na:na]
	at java.base/sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:1127) ~[na:na]
	at java.base/sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:1056) ~[na:na]
	at java.base/sun.net.www.protocol.http.HttpURLConnection.getInputStream0(HttpURLConnection.java:1686) ~[na:na]
	at java.base/sun.net.www.protocol.http.HttpURLConnection.getInputStream(HttpURLConnection.java:1610) ~[na:na]
	at org.apache.xerces.impl.XMLEntityManager.setupCurrentEntity(Unknown Source) ~[xercesImpl-2.12.2.jar:2.12.2]
	at org.apache.xerces.impl.XMLVersionDetector.determineDocVersion(Unknown Source) ~[xercesImpl-2.12.2.jar:2.12.2]
	at org.apache.xerces.impl.xs.opti.SchemaParsingConfig.parse(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at org.apache.xerces.impl.xs.opti.SchemaParsingConfig.parse(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at org.apache.xerces.impl.xs.opti.SchemaDOMParser.parse(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at org.apache.xerces.impl.xs.traversers.XSDHandler.getSchemaDocument(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at org.apache.xerces.impl.xs.traversers.XSDHandler.resolveSchema(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at org.apache.xerces.impl.xs.traversers.XSDHandler.constructTrees(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at org.apache.xerces.impl.xs.traversers.XSDHandler.constructTrees(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at org.apache.xerces.impl.xs.traversers.XSDHandler.constructTrees(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at org.apache.xerces.impl.xs.traversers.XSDHandler.parseSchema(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at org.apache.xerces.impl.xs.XMLSchemaLoader.loadSchema(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at org.apache.xerces.impl.xs.XMLSchemaLoader.loadGrammar(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at org.apache.xerces.impl.xs.XMLSchemaLoader.loadGrammar(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at org.apache.xerces.jaxp.validation.XMLSchemaFactory.newSchema(Unknown Source) ~[xercesImpl-2.12.2.jar:na]
	at java.xml/javax.xml.validation.SchemaFactory.newSchema(SchemaFactory.java:612) ~[na:na]
	at java.xml/javax.xml.validation.SchemaFactory.newSchema(SchemaFactory.java:628) ~[na:na]
	at com.example.XBRL_validation_with_xsd_uses_xerces.XbrlValidationWithXsdUsesXercesApplication.validateFile(XbrlValidationWithXsdUsesXercesApplication.java:96) ~[main/:na]
	at com.example.XBRL_validation_with_xsd_uses_xerces.XbrlValidationWithXsdUsesXercesApplication.runAgainstAllFiles(XbrlValidationWithXsdUsesXercesApplication.java:58) ~[main/:na]
	at com.example.XBRL_validation_with_xsd_uses_xerces.XbrlValidationWithXsdUsesXercesApplication.run(XbrlValidationWithXsdUsesXercesApplication.java:38) ~[main/:na]
	at org.springframework.boot.SpringApplication.lambda$callRunner$5(SpringApplication.java:788) ~[spring-boot-3.4.4.jar:3.4.4]
	at org.springframework.util.function.ThrowingConsumer$1.acceptWithException(ThrowingConsumer.java:82) ~[spring-core-6.2.5.jar:6.2.5]
	at org.springframework.util.function.ThrowingConsumer.accept(ThrowingConsumer.java:60) ~[spring-core-6.2.5.jar:6.2.5]
	at org.springframework.util.function.ThrowingConsumer$1.accept(ThrowingConsumer.java:86) ~[spring-core-6.2.5.jar:6.2.5]
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:796) ~[spring-boot-3.4.4.jar:3.4.4]
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:787) ~[spring-boot-3.4.4.jar:3.4.4]
	at org.springframework.boot.SpringApplication.lambda$callRunners$3(SpringApplication.java:772) ~[spring-boot-3.4.4.jar:3.4.4]
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183) ~[na:na]
	at java.base/java.util.stream.SortedOps$SizedRefSortingSink.end(SortedOps.java:357) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:510) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150) ~[na:na]
	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596) ~[na:na]
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:772) ~[spring-boot-3.4.4.jar:3.4.4]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:325) ~[spring-boot-3.4.4.jar:3.4.4]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.4.4.jar:3.4.4]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.4.4.jar:3.4.4]
	at com.example.XBRL_validation_with_xsd_uses_xerces.XbrlValidationWithXsdUsesXercesApplication.main(XbrlValidationWithXsdUsesXercesApplication.java:32) ~[main/:na]
```

</details>

<details>
  <summary>Click to view: logging from running with internet and without the catalog.</summary>

Result. Running with internet and without the catalog. SUCCESS.

```
2025-06-30T12:55:28.067+10:00  INFO 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Starting XbrlValidationWithXsdUsesXercesApplication using Java 17.0.12 with PID 67573 (/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/build/classes/java/main started by rob.bram in /Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces)
2025-06-30T12:55:28.069+10:00 DEBUG 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Running with Spring Boot v3.4.4, Spring v6.2.5
2025-06-30T12:55:28.070+10:00  INFO 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : No active profile set, falling back to 1 default profile: "default"
2025-06-30T12:55:28.255+10:00  INFO 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Started XbrlValidationWithXsdUsesXercesApplication in 0.343 seconds (process running for 0.621)
2025-06-30T12:55:28.256+10:00  INFO 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Running with internet and without the catalog.
2025-06-30T12:55:28.257+10:00  INFO 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : ========== src/main/resources/xbrl/xbrl_001_valid.xml ==========
2025-06-30T12:55:30.245+10:00  INFO 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : 'src/main/resources/xbrl/xbrl_001_valid.xml' is valid against 'src/main/resources/xsd/sbr.gov.au/taxonomy/sbr_au_reports/sprstrm/sprcnt/sprcnt_0001/sprcnt.0001.conttrans.request.02.02.report.xsd'.
2025-06-30T12:55:30.245+10:00  INFO 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : ========== src/main/resources/xbrl/xbrl_002_invalid-against-Schematron.xml ==========
2025-06-30T12:55:31.709+10:00 DEBUG 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Error occurred during validation of XML file 'xbrl_002_invalid-against-Schematron.xml': 'cvc-complex-type.2.4.b: The content of element 'orgname1.02.00:OrganisationNameDetails' is not complete. One of '{"http://sbr.gov.au/icls/py/pyde/pyde.02.00.data":OrganisationNameDetails.OrganisationalName.Text}' is expected.'.
2025-06-30T12:55:31.711+10:00 DEBUG 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Error occurred during validation of XML file 'xbrl_002_invalid-against-Schematron.xml': 'cvc-complex-type.2.4.a: Invalid content was found starting with element '{"http://www.xbrl.org/2003/instance":segment}'. One of '{"http://www.xbrl.org/2003/instance":identifier}' is expected.'.
2025-06-30T12:55:31.711+10:00 ERROR 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Error: org.xml.sax.SAXParseException; systemId: file:/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xbrl/xbrl_002_invalid-against-Schematron.xml; lineNumber: 26; columnNumber: 45; cvc-complex-type.2.4.b: The content of element 'orgname1.02.00:OrganisationNameDetails' is not complete. One of '{"http://sbr.gov.au/icls/py/pyde/pyde.02.00.data":OrganisationNameDetails.OrganisationalName.Text}' is expected.
2025-06-30T12:55:31.711+10:00 ERROR 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Error: org.xml.sax.SAXParseException; systemId: file:/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xbrl/xbrl_002_invalid-against-Schematron.xml; lineNumber: 178; columnNumber: 25; cvc-complex-type.2.4.a: Invalid content was found starting with element '{"http://www.xbrl.org/2003/instance":segment}'. One of '{"http://www.xbrl.org/2003/instance":identifier}' is expected.
2025-06-30T12:55:31.711+10:00  INFO 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : ========== src/main/resources/xbrl/xbrl_003_invalid-against-XSD.xml ==========
2025-06-30T12:55:32.939+10:00 DEBUG 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Error occurred during validation of XML file 'xbrl_003_invalid-against-XSD.xml': 'cvc-pattern-valid: Value '日本人中國的' is not facet-valid with respect to pattern '[0-9]{6}' for type '#AnonType_sbrBankServiceBranchCodeItemType'.'.
2025-06-30T12:55:32.940+10:00 DEBUG 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Error occurred during validation of XML file 'xbrl_003_invalid-against-XSD.xml': 'cvc-complex-type.2.2: Element 'pyid.02.00:FinancialInstitutionAccount.BankStateBranch.Number' must have no element [children], and the value must be valid.'.
2025-06-30T12:55:32.940+10:00 ERROR 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Error: org.xml.sax.SAXParseException; systemId: file:/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xbrl/xbrl_003_invalid-against-XSD.xml; lineNumber: 47; columnNumber: 159; cvc-pattern-valid: Value '日本人中國的' is not facet-valid with respect to pattern '[0-9]{6}' for type '#AnonType_sbrBankServiceBranchCodeItemType'.
2025-06-30T12:55:32.941+10:00 ERROR 67573 --- [XBRL-validation-with-xsd_uses-xerces] [           main] rlValidationWithXsdUsesXercesApplication : Error: org.xml.sax.SAXParseException; systemId: file:/Users/rob.bram/work/test/XBRL-validation-with-xsd_uses-xerces/src/main/resources/xbrl/xbrl_003_invalid-against-XSD.xml; lineNumber: 47; columnNumber: 159; cvc-complex-type.2.2: Element 'pyid.02.00:FinancialInstitutionAccount.BankStateBranch.Number' must have no element [children], and the value must be valid.
```

</details>

Question 003

## Answer 003

This section: [Answer 003](20250630_co-pilot-chat.md#answer-003) | [Back to top](#top)

The error occurs because, despite having a classpath-relative resolver and a local OASIS XML catalog (catalog.xml), the XML parser (Xerces) is still trying to fetch some XSDs from the internet (e.g., `www.xbrl.org`). This means your resolver or catalog is not being used correctly, or not being used at all.

**Common causes:**

1. **Catalog Not Registered:**  
   Xerces (or the JAXP SchemaFactory) must be explicitly told to use the catalog. If you don't set the `xml.catalog.files` system property or configure the resolver programmatically, the catalog will be ignored.

2. **Resolver Not Wired:**  
   If you wrote a custom `LSResourceResolver` (e.g., `ClasspathResourceResolver`), you must set it on the `SchemaFactory` via `setResourceResolver`.

3. **Catalog Paths:**  
   The catalog entries must match the systemId/href exactly as used in the XSDs. If the XSDs reference `http://www.xbrl.org/2003/xbrl-instance-2003-12-31.xsd`, your catalog must map that systemId.

4. **Absolute vs Relative Paths:**  
   In your catalog, some `system` entries use absolute paths. If the code runs in a different environment, these may not resolve. Prefer classpath-relative or relative paths if possible.

---

**How to Fix**

**1. Register the Catalog with Xerces/JAXP**

Add this JVM property (in your `main` method or as a JVM argument):

```java
System.setProperty("xml.catalog.files", "src/main/resources/xsd/catalog.xml");
System.setProperty("xml.catalog.ignoreMissing", "true");
```

Or, if running via Maven/Gradle, add:

```
-Dxml.catalog.files=src/main/resources/xsd/catalog.xml
```

**2. Set Your Resource Resolver**

When creating your `SchemaFactory`, set your resolver:

```java
SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
factory.setResourceResolver(new ClasspathResourceResolver());
```

**3. Ensure Catalog is on the Classpath**

If using classpath-relative URIs, make sure catalog.xml and all XSDs are in the correct location in your JAR or classpath.

**4. Check Catalog Entries**

Make sure the `systemId` or `uri` in the catalog matches exactly what the XSDs reference.

---

**Why Is It Failing?**

If you miss any of the above, Xerces will fall back to trying to fetch the XSDs from the internet, triggering the `java.net.SocketPermission` error due to the security manager.

---

**Summary**

- Ensure the catalog is registered (`xml.catalog.files`).
- Set your custom resolver on the `SchemaFactory`.
- Catalog entries must match the XSD references exactly.
- Prefer classpath-relative paths for portability.

If you need help wiring up the resolver or catalog, please share your `SchemaFactory` and resolver setup code.
