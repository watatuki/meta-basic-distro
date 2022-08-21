SUMMARY = "Coustomize image SDK"
LICENSE = "MIT"

require customize-image.bb

IMAGE_FEATURES:append = " dev-pkgs"

inherit populate_sdk populate_sdk_qt5

