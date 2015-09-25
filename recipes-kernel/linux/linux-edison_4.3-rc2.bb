LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel

COMPATIBLE_MACHINE = "(edison)"

LINUX_VERSION = "4.3-rc2"
LINUX_VERSION_EXTENSION = ".0"

S = "${WORKDIR}/linux-${LINUX_VERSION}"

SRC_URI = "https://www.kernel.org/pub/linux/kernel/v4.x/testing/linux-4.3-rc2.tar.xz"
SRC_URI += "file://defconfig"
SRC_URI[md5sum] = "2253700f21055c240e19efb72e06f8e3"
SRC_URI[sha256sum] = "647995c4016bd3410a842c7c593d87d8f4583607dc49d6f1724b82bf411ef5d5"
