---
title: Slide 3 - posts on the internet
description: Slide 3 - posts on the internet
hidden: false
---

<p id="top">Slide 3 - posts on the internet.</p>

Advice from teh InterWebs.

1. StackOverflow: [XSD validation of XBRL files shows structural errors on otherwise valid XBRL files](https://stackoverflow.com/questions/79659484/xsd-validation-of-xbrl-files-shows-structural-errors-on-otherwise-valid-xbrl-fil/79659897).

    > `FinancialInstitutionAccount` is probably containing a fact and in the substitution group of item.
    > 
    > Thus, the reason for the validation error is that the taxonomy schema (the one defining `FinancialInstitutionAccount`) is not in scope.
    > 
    > ...
    > 
    > If it works when downloading the schemas from the Internet, it is likely to be an issue with the mapping to the local copy of the schema files.
    > 
    > ...
    > 
    > Perhaps it would help locating the exact schema file defining FinancialInstitutionAccount and checking that it also exists as a local copy?

    1. Prove that XSDs covering `FinancialInstitutionAccount` are not in scope?

1. CodeRanch: [Error validating XBRL using catalog.xml to ensure only local XSD files are used](https://coderanch.com/t/789281/languages/Error-validating-XBRL-catalog-xml).

    > The reason you have to use absolute paths is because you haven't added a classpath-relative resolver to you XML parsing subsystem.

    Use a classpath relative resolver in the catalog code somehow.

