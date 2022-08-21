FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

PACKAGECONFIG_GRAPHICS = " gles2"
QT_QPA_DEFAULT_PLATFORM = "wayland"

PACKAGECONFIG:append = " examples "
PACKAGECONFIG:remove:class-native = " examples"
PACKAGECONFIG:remove:class-nativesdk = " examples"

