UPDATE c1_role_permission SET END_DATE = NOW() WHERE INSTR(:ids, rolePermissionId) > 0